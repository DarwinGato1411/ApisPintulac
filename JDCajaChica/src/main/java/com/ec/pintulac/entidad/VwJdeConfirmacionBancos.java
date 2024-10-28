package com.ec.pintulac.entidad;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "VW_JDE_IN_CONFIRMACION_BANCOS")
public class VwJdeConfirmacionBancos {
	@Id
	@Column(name = "COBRO")
	private String COBRO;
	@Column(name = "CN_CODIGO")
	private String CNCODIGO;
	@Column(name = "CO_VALOR")
	private BigDecimal COVALOR;
	@Column(name = "CO_REFER")
	private String COREFER;
	@Column(name = "CO_FECDOCUM")
    @Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "DD/MM/YYYY")
	private Date COFECDOCUM;
	@Column(name = "CE_CODIGO")
	private String CECODIGO;
	@Column(name = "FP_CODIGO")
	private String FPCODIGO;
	@Column(name = "dato_json")
	private String datoJson;

	public VwJdeConfirmacionBancos() {
		super();
	}

	public String getCOBRO() {
		return COBRO;
	}

	public void setCOBRO(String cOBRO) {
		COBRO = cOBRO;
	}

	public String getCNCODIGO() {
		return CNCODIGO;
	}

	public void setCNCODIGO(String cNCODIGO) {
		CNCODIGO = cNCODIGO;
	}

	public BigDecimal getCOVALOR() {
		return COVALOR;
	}

	public void setCOVALOR(BigDecimal cOVALOR) {
		COVALOR = cOVALOR;
	}

	public String getCOREFER() {
		return COREFER;
	}

	public void setCOREFER(String cOREFER) {
		COREFER = cOREFER;
	}

	public Date getCOFECDOCUM() {
		return COFECDOCUM;
	}

	public void setCOFECDOCUM(Date cOFECDOCUM) {
		COFECDOCUM = cOFECDOCUM;
	}

	public String getCECODIGO() {
		return CECODIGO;
	}

	public void setCECODIGO(String cECODIGO) {
		CECODIGO = cECODIGO;
	}

	public String getFPCODIGO() {
		return FPCODIGO;
	}

	public void setFPCODIGO(String fPCODIGO) {
		FPCODIGO = fPCODIGO;
	}

	public String getDatoJson() {
		return datoJson;
	}

	public void setDatoJson(String datoJson) {
		this.datoJson = datoJson;
	}

}
