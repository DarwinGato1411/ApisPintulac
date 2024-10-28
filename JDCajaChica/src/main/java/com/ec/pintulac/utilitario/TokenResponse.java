package com.ec.pintulac.utilitario;

public class TokenResponse {

	public String username;
	public String environment;
	public String role;
	public String jasserver;
	public UserInfo userInfo;
	public boolean userAuthorized;
	public Object version;
	public Object poStringJSON;
	public Object altPoStringJSON;
	public String aisSessionCookie;
	public boolean adminAuthorized;
	public boolean passwordAboutToExpire;
	public String envColor;
	public String machineName;
	public String externalJASURL;

	public TokenResponse() {
		super();
	}

	public TokenResponse(String username, String environment, String role, String jasserver, UserInfo userInfo,
			boolean userAuthorized, Object version, Object poStringJSON, Object altPoStringJSON,
			String aisSessionCookie, boolean adminAuthorized, boolean passwordAboutToExpire, String envColor,
			String machineName, String externalJASURL) {
		super();
		this.username = username;
		this.environment = environment;
		this.role = role;
		this.jasserver = jasserver;
		this.userInfo = userInfo;
		this.userAuthorized = userAuthorized;
		this.version = version;
		this.poStringJSON = poStringJSON;
		this.altPoStringJSON = altPoStringJSON;
		this.aisSessionCookie = aisSessionCookie;
		this.adminAuthorized = adminAuthorized;
		this.passwordAboutToExpire = passwordAboutToExpire;
		this.envColor = envColor;
		this.machineName = machineName;
		this.externalJASURL = externalJASURL;
	}

	public TokenResponse(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getJasserver() {
		return jasserver;
	}

	public void setJasserver(String jasserver) {
		this.jasserver = jasserver;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public boolean isUserAuthorized() {
		return userAuthorized;
	}

	public void setUserAuthorized(boolean userAuthorized) {
		this.userAuthorized = userAuthorized;
	}

	public Object getVersion() {
		return version;
	}

	public void setVersion(Object version) {
		this.version = version;
	}

	public Object getPoStringJSON() {
		return poStringJSON;
	}

	public void setPoStringJSON(Object poStringJSON) {
		this.poStringJSON = poStringJSON;
	}

	public Object getAltPoStringJSON() {
		return altPoStringJSON;
	}

	public void setAltPoStringJSON(Object altPoStringJSON) {
		this.altPoStringJSON = altPoStringJSON;
	}

	public String getAisSessionCookie() {
		return aisSessionCookie;
	}

	public void setAisSessionCookie(String aisSessionCookie) {
		this.aisSessionCookie = aisSessionCookie;
	}

	public boolean isAdminAuthorized() {
		return adminAuthorized;
	}

	public void setAdminAuthorized(boolean adminAuthorized) {
		this.adminAuthorized = adminAuthorized;
	}

	public boolean isPasswordAboutToExpire() {
		return passwordAboutToExpire;
	}

	public void setPasswordAboutToExpire(boolean passwordAboutToExpire) {
		this.passwordAboutToExpire = passwordAboutToExpire;
	}

	public String getEnvColor() {
		return envColor;
	}

	public void setEnvColor(String envColor) {
		this.envColor = envColor;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getExternalJASURL() {
		return externalJASURL;
	}

	public void setExternalJASURL(String externalJASURL) {
		this.externalJASURL = externalJASURL;
	}

}
