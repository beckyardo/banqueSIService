package fr.societegeneralparis.banquesiservice.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.societegeneralparis.banquesiservice.dtos.OperationDto;
import fr.societegeneralparis.banquesiservice.exceptions.ObjetIntrouvableException;
import fr.societegeneralparis.banquesiservice.exceptions.SoldeInsuffisantException;
import fr.societegeneralparis.banquesiservice.services.OperationService;

@RestController
@RequestMapping("/operations")
public class OperationController {

	@Autowired
	OperationService operationService;

	@PostMapping(value = "/verser",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deposer(@RequestBody @Validated OperationDto operationDto) throws ObjetIntrouvableException, SoldeInsuffisantException {
		operationService.ajouterOperation(operationDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/retirer",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> retirer(@RequestBody @Validated OperationDto operationDto) throws ObjetIntrouvableException, SoldeInsuffisantException {
		operationService.ajouterOperation(operationDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping(value = "/{numeroCompte}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<OperationDto>> lister(@PathVariable(name = "numeroCompte") String numeroCompte) throws ObjetIntrouvableException {
		return new ResponseEntity<>(operationService.afficherHistorique(numeroCompte), HttpStatus.OK);
	}
	


	
}
