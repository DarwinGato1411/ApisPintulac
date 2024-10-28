package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	
	@JsonProperty("FECHA_ACTUALIZACION")
	private String fechaActualizacion;

	@JsonProperty("DESCRIPCION_COMPRIMIDA")
	private String descripcionComprimida;

	@JsonProperty("SY")
	private String sy;

	@JsonProperty("RT")
	private String rt;

	@JsonProperty("KY")
	private String ky;

	@JsonProperty("DESCRIPCION1")
	private String descripcion1;

	@JsonProperty("DESCRIPCION2")
	private String descripcion2;

	@JsonProperty("GESTION_ESPECIAL")
	private String gestionEspecial;

	@JsonProperty("ACTIVO")
	private String activo;

	public Item() {
		super();
	}

	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getDescripcionComprimida() {
		return descripcionComprimida;
	}

	public void setDescripcionComprimida(String descripcionComprimida) {
		this.descripcionComprimida = descripcionComprimida;
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

	public String getKy() {
		return ky;
	}

	public void setKy(String ky) {
		this.ky = ky;
	}

	public String getDescripcion1() {
		return descripcion1;
	}

	public void setDescripcion1(String descripcion1) {
		this.descripcion1 = descripcion1;
	}

	public String getDescripcion2() {
		return descripcion2;
	}

	public void setDescripcion2(String descripcion2) {
		this.descripcion2 = descripcion2;
	}

	public String getGestionEspecial() {
		return gestionEspecial;
	}

	public void setGestionEspecial(String gestionEspecial) {
		this.gestionEspecial = gestionEspecial;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

}
