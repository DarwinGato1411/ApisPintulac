package com.ec.pintulac.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CodigosCategoriaRequest {
	@JsonProperty("SY")
	private String sy;

	@JsonProperty("RT")
	private String rt;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("Fecha_Actualizacion")
	private String fechaActualizacion;

	@JsonProperty("TDAY")
	private String tday;

	public CodigosCategoriaRequest() {
		super();
	}

	public String getSy() {
		return sy;
	}

	public void setSy(String sy) {
		this.sy = sy;
	}

	public String getRt() {
		return rt;
	}

	public void setRt(String rt) {
		this.rt = rt;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getTday() {
		return tday;
	}

	public void setTday(String tday) {
		this.tday = tday;
	}

	
}
