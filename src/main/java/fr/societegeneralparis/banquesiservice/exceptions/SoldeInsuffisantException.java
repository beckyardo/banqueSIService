package fr.societegeneralparis.banquesiservice.exceptions;

public class SoldeInsuffisantException extends Exception {

	private static final long serialVersionUID = 1L;

	private String message;

	public SoldeInsuffisantException(String message) {
		super();
		this.message = message;
	}
	
	

	public SoldeInsuffisantException() {
		super();
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
