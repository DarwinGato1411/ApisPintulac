package com.ec.pintulac.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConfirmacionBancosResponse {
	@SerializedName("Numero_batch")
	@Expose
	private String numeroBatch;
	@SerializedName("jde__status")
	@Expose
	private String jdeStatus;
	@SerializedName("jde__startTimestamp")
	@Expose
	private String jdeStartTimestamp;
	@SerializedName("jde__endTimestamp")
	@Expose
	private String jdeEndTimestamp;
	@SerializedName("jde__serverExecutionSeconds")
	@Expose
	private Double jdeServerExecutionSeconds;

	public String getNumeroBatch() {
	return numeroBatch;
	}

	public void setNumeroBatch(String numeroBatch) {
	this.numeroBatch = numeroBatch;
	}

	public String getJdeStatus() {
	return jdeStatus;
	}

	public void setJdeStatus(String jdeStatus) {
	this.jdeStatus = jdeStatus;
	}

	public String getJdeStartTimestamp() {
	return jdeStartTimestamp;
	}

	public void setJdeStartTimestamp(String jdeStartTimestamp) {
	this.jdeStartTimestamp = jdeStartTimestamp;
	}

	public String getJdeEndTimestamp() {
	return jdeEndTimestamp;
	}

	public void setJdeEndTimestamp(String jdeEndTimestamp) {
	this.jdeEndTimestamp = jdeEndTimestamp;
	}

	public Double getJdeServerExecutionSeconds() {
	return jdeServerExecutionSeconds;
	}

	public void setJdeServerExecutionSeconds(Double jdeServerExecutionSeconds) {
	this.jdeServerExecutionSeconds = jdeServerExecutionSeconds;
	}


}
