package fr.societegeneralparis.banquesiservice.entities;

import java.util.Date;


public class CompteEpargne extends Compte{

	private static final long serialVersionUID = 1L;
	

	
	
	public CompteEpargne() {
		super();
	}

	public CompteEpargne(String codeCompte, Date dateCreation, double solde) {
		super(codeCompte, dateCreation, solde);
	}


}
