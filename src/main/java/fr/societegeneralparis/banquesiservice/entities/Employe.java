package fr.societegeneralparis.banquesiservice.entities;

import java.io.Serializable;

public class Employe implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private String nom;

	public Employe(String nom) {
		super();
		this.nom = nom;
	}

	public Employe() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCodeEmploye(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
