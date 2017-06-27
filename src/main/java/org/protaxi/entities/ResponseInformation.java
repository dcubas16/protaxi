package org.protaxi.entities;

public class ResponseInformation {

	private boolean isSuccess;
	private String message;
	
	public ResponseInformation(boolean isSuccess, String message) {
		super();
		this.isSuccess = isSuccess;
		this.message = message;
	}
	
	public ResponseInformation() {
	}
	
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
