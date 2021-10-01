package fr.societegeneralparis.banquesiservice.entities;

import java.io.Serializable;
import java.util.Collection;

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private String nom;
	private String prenom;

	private Collection<Compte> comptes;

	public Client() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

}
