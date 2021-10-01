package fr.societegeneralparis.banquesiservice.services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.societegeneralparis.banquesiservice.business.OperationBusiness;
import fr.societegeneralparis.banquesiservice.constantes.TypeOperation;
import fr.societegeneralparis.banquesiservice.dtos.OperationDto;
import fr.societegeneralparis.banquesiservice.entities.Compte;
import fr.societegeneralparis.banquesiservice.entities.Employe;
import fr.societegeneralparis.banquesiservice.entities.Operation;
import fr.societegeneralparis.banquesiservice.entities.Retrait;
import fr.societegeneralparis.banquesiservice.entities.Versement;
import fr.societegeneralparis.banquesiservice.exceptions.ObjetIntrouvableException;
import fr.societegeneralparis.banquesiservice.exceptions.SoldeInsuffisantException;
import fr.societegeneralparis.banquesiservice.mappers.OperationMapper;
import fr.societegeneralparis.banquesiservice.repositories.CompteRepository;
import fr.societegeneralparis.banquesiservice.repositories.EmployeRepository;
import fr.societegeneralparis.banquesiservice.repositories.OperationRepository;
import fr.societegeneralparis.banquesiservice.utils.GenerateurCode;

@Service
public class OperationService implements OperationBusiness {

	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;
	@Autowired
	private GenerateurCode generateurCode;

	@Autowired
	private OperationMapper operationMapper;

	@Override
	public void ajouterOperation(OperationDto operationDto)
			throws ObjetIntrouvableException, SoldeInsuffisantException {
		if (!compteRepository.getComptes().containsKey(operationDto.getNumeroCompte()))
			throw new ObjetIntrouvableException(
					String.format("Le compte %s n'existe pas.", operationDto.getNumeroCompte()));
		if (!employeRepository.getEmployes().containsKey(operationDto.getCodeEmploye()))
			throw new ObjetIntrouvableException(
					String.format("L'employé %s n'existe pas.", operationDto.getCodeEmploye()));
		if(!operationDto.getType().equals(TypeOperation.VERSEMENT) && !operationDto.getType().equals(TypeOperation.RETRAIT))
			throw new ObjetIntrouvableException(
					String.format("Le type d'operation %s est inconnu.", operationDto.getType()));

		Compte compte = compteRepository.getComptes().get(operationDto.getNumeroCompte());
		Employe employe = employeRepository.getEmployes().get(operationDto.getCodeEmploye());
		if (operationDto.getType().equals(TypeOperation.VERSEMENT)) {
			compte.setSolde(compte.getSolde() + operationDto.getMontant());
			ajouterOperation(TypeOperation.VERSEMENT, operationDto.getMontant(), compte, employe);
		} else {
			if (compte.getSolde() < operationDto.getMontant())
				throw new SoldeInsuffisantException("Le solde est insuffisant.");
			compte.setSolde(compte.getSolde() - operationDto.getMontant());
			ajouterOperation(TypeOperation.RETRAIT, operationDto.getMontant(), compte, employe);
		}

	}

	@Override
	public List<OperationDto> afficherHistorique(String numeroCompte) throws ObjetIntrouvableException {
		return operationRepository.getOperations().values().stream()
				.filter(op -> op.getCompte().getCode().equals(numeroCompte))
				.map(operation -> operationMapper.operationEntityToOperationDto(operation))
				.collect(Collectors.toList());
	}

	private void ajouterOperation(String type, double montant, Compte compte, Employe employe) {
		Operation operation = type.equals(TypeOperation.VERSEMENT) ? new Versement() : new Retrait();
		String codeOperation = generateurCode.genererCode();
		String codeCompte = compte.getCode();
		operation.setNumero(codeOperation);
		operation.setDate(new Date());
		operation.setMontant(montant);
		operation.setCompte(compte);
		operation.setSolde(compte.getSolde());
		operation.setEmploye(employe);
		operationRepository.getOperations().put(codeOperation, operation);

		compteRepository.getComptes().put(codeCompte, compte);
	}
}
