package fr.societegeneralparis.banquesiservice.repositories;

import java.util.Map;

import org.springframework.stereotype.Component;

import fr.societegeneralparis.banquesiservice.entities.Employe;

@Component
public class EmployeRepository {

	private Map<String, Employe> employes;
	
	

	public EmployeRepository() {
		super();
	}

	public EmployeRepository(Map<String, Employe> employes) {
		super();
		this.employes = employes;
	}

	public Map<String, Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Map<String, Employe> employes) {
		this.employes = employes;
	}

	

}
