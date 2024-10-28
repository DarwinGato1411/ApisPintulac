package com.ec.pintulac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.ec.pintulac.entidad.VwJdeConfirmacionBancos;
import com.ec.pintulac.repository.RepositoryGenerico;
import com.ec.pintulac.repository.VwJDConfirmacionBancosRepository;
import com.ec.pintulac.response.ConfirmacionBancosResponse;
import com.ec.pintulac.services.ServicioGeneral;
import com.google.gson.Gson;

//@EnableDiscoveryClient
@EnableScheduling
@SpringBootApplication
public class JDCajaChica extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication.run(JDCajaChica.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(JDCajaChica.class);
	}
	
	
	

}
