package fr.societegeneralparis.banquesiservice.repositories;

import java.util.Map;

import org.springframework.stereotype.Component;

import fr.societegeneralparis.banquesiservice.entities.Client;

@Component
public class ClientRepository {
	
	private Map<String, Client> clients;
	
	

	public ClientRepository() {
		super();
	}



	public Map<String, Client> getClients() {
		return clients;
	}



	public void setClients(Map<String, Client> clients) {
		this.clients = clients;
	}

	
	

}
