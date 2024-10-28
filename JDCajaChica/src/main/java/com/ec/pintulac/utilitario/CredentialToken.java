package com.ec.pintulac.utilitario;

public class CredentialToken {
	String userToken ;
	String passwordToken ;
	
	
	public CredentialToken(String userToken, String passwordToken) {
		super();
		this.userToken = userToken;
		this.passwordToken = passwordToken;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	public String getPasswordToken() {
		return passwordToken;
	}
	public void setPasswordToken(String passwordToken) {
		this.passwordToken = passwordToken;
	}
	
	
	
	
}
