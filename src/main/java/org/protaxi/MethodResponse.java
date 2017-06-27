package org.protaxi;

public class MethodResponse {

	private Object response;
	private boolean isCorrect; 
	private String errorMessage;
	private String stackTrace;
	
	public MethodResponse(Object response, boolean isCorrect, String errorMessage, String stackTrace) {
		super();
		this.response = response;
		this.isCorrect = isCorrect;
		this.errorMessage = errorMessage;
		this.stackTrace = stackTrace;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
	
	
}
