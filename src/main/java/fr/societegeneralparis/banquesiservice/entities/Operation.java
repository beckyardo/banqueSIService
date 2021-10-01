package fr.societegeneralparis.banquesiservice.entities;

import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numero;
	private Date date;
	private double montant;
	//Pour avoir le solde après chaque opération
	private double solde;
	private Compte compte;
	
	// L'utilisateur qui a effectué l'operation
	private Employe employe;

	public Operation() {
		super();
	}

	public Operation(Date date, double montant, double solde) {
		super();
		this.date = date;
		this.montant = montant;
		this.solde = solde;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	
}
