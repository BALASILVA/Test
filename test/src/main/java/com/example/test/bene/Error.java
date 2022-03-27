package com.example.test.bene;

import java.util.Date;

public class Error {

	private int errorCode;
	private String errorMessage;
	private Date timpeStamp;

	public Error() {
	}
	
	

	public Error(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.timpeStamp = new Date();
	}



	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Date getTimpeStamp() {
		return timpeStamp;
	}

	public void setTimpeStamp(Date timpeStamp) {
		this.timpeStamp = timpeStamp;
	}

	@Override
	public String toString() {
		return "Error [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", timpeStamp=" + timpeStamp + "]";
	}

}
