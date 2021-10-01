package fr.societegeneralparis.banquesiservice.entities;

import java.util.Date;


public class CompteCourant extends Compte{

	private static final long serialVersionUID = 1L;

	
	
	public CompteCourant() {
		super();
	}

	public CompteCourant(String codeCompte, Date dateCreation, double solde) {
		super(codeCompte, dateCreation, solde);
	}

}
