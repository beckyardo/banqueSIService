package fr.societegeneralparis.banquesiservice.business;

import java.util.List;

import fr.societegeneralparis.banquesiservice.dtos.OperationDto;
import fr.societegeneralparis.banquesiservice.exceptions.ObjetIntrouvableException;
import fr.societegeneralparis.banquesiservice.exceptions.SoldeInsuffisantException;


public interface OperationBusiness {

	public void ajouterOperation(OperationDto operationDto) throws ObjetIntrouvableException, SoldeInsuffisantException;
	public List<OperationDto> afficherHistorique(String codeCompte) throws ObjetIntrouvableException;
}
