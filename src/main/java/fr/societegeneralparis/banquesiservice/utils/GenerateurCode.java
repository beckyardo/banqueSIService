package fr.societegeneralparis.banquesiservice.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class GenerateurCode {

	public String genererCode() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}

}
