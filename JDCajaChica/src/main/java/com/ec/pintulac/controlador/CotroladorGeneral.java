package com.ec.pintulac.controlador;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ec.pintulac.repository.RepositoryGenerico;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api
public class CotroladorGeneral {

	@Autowired
	RepositoryGenerico generico;

	@PostMapping(value = "/caja_chica")
	@ApiOperation(tags = "Caja Chica", value = "Caja Chica")
	public ResponseEntity<?> vwVentasPos(@RequestBody Object param) {
		try {
			long totalSum = 0;
			long startTime = System.currentTimeMillis();
			int i = 0;
			JsonObject respuesta = new JsonObject();
			Gson gson = new Gson();
			String JSON = gson.toJson(param);
			System.out.println("JSON " + JSON);
			respuesta = generico.callStoreProcedureArray("DINAMIC.sp_jsonin_out_caja_chica", JSON);
			System.out.println(i++ + ": " + respuesta);
			totalSum = (System.currentTimeMillis() - startTime);
			System.out.println("Tiempo ejecucion" + (totalSum / 1000));
			return new ResponseEntity<String>(respuesta == null ? "Respuesta nula" : respuesta.toString(),
					HttpStatus.OK);

		} catch (Exception ex) {
			ex.printStackTrace();
			String stacktrace = ExceptionUtils.getStackTrace(ex);
			return new ResponseEntity<String>("ERROR: " + stacktrace, HttpStatus.BAD_REQUEST);

		}

	}
}
