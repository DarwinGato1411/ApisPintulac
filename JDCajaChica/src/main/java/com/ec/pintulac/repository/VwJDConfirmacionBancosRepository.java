package com.ec.pintulac.repository;

import java.math.BigDecimal;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ec.pintulac.entidad.VwJdeConfirmacionBancos;


@SuppressWarnings("unused")
@Repository
public interface VwJDConfirmacionBancosRepository  extends JpaRepository<VwJdeConfirmacionBancos, String>{

	
	@Modifying
	@Transactional
	@Query(value = "UPDATE cc_cobro vn SET vn.jde_estado ='E' , vn.JDE_NUM_BATCH=? WHERE vn.cn_codigo=? and vn.co_valor =? and TO_DATE(vn.co_fecdocum)  =TO_DATE(?) and vn.ce_codigo  =? and vn.fp_codigo =?", nativeQuery = true)
	void updateEntidad(String bach, String cn_codigo,BigDecimal co_valor, Date co_fecdocum, String ce_codigo, String ep_codigo);
	
}
