package fr.societegeneralparis.banquesiservice.repositories;

import java.util.Map;

import org.springframework.stereotype.Component;

import fr.societegeneralparis.banquesiservice.entities.Compte;

@Component
public class CompteRepository {

	private Map<String, Compte> comptes;

	public CompteRepository() {
		super();
	}

	public CompteRepository(Map<String, Compte> comptes) {
		super();
		this.comptes = comptes;
	}

	public Map<String, Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Map<String, Compte> comptes) {
		this.comptes = comptes;
	}

}
