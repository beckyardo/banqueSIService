package fr.societegeneralparis.banquesiservice.repositories;

import java.util.Map;

import org.springframework.stereotype.Component;

import fr.societegeneralparis.banquesiservice.entities.Operation;

@Component
public class OperationRepository{

	private Map<String, Operation> operations;

	
	public OperationRepository() {
		super();
	}


	public Map<String, Operation> getOperations() {
		return operations;
	}


	public void setOperations(Map<String, Operation> operations) {
		this.operations = operations;
	}

	
}
