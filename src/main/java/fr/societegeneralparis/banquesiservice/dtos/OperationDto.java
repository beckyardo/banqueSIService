package fr.societegeneralparis.banquesiservice.dtos;

import java.io.Serializable;
import java.util.Date;

public class OperationDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numero;
	private String type;
	private Date date;
	private double montant;
	private double solde;
	private String numeroCompte;

	// L'utilisateur qui a effectué l'operation
	private String codeEmploye;

	public OperationDto() {
		super();
	}

	public OperationDto(String type, Date date, double montant, double solde) {
		super();
		this.type = type;
		this.date = date;
		this.montant = montant;
		this.solde = solde;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(String codeEmploye) {
		this.codeEmploye = codeEmploye;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
