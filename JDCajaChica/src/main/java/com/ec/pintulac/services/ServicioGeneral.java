package com.ec.pintulac.services;

import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.ec.pintulac.entidad.VwJdeConfirmacionBancos;

import com.ec.pintulac.request.CodigosCategoriaRequest;
import com.ec.pintulac.response.CodigosCategoriaResponse;
import com.ec.pintulac.utilitario.CredentialToken;
import com.ec.pintulac.utilitario.GestionToken;
import com.ec.pintulac.utilitario.TokenResponse;

@Service
public class ServicioGeneral {

	@Value("${webservices.ruta}")
	private String ruta;
	@Value("${webservices.rutatoken}")
	private String rutatoken;

	@Value("${user.token}")
	private String userToken;
	@Value("${password.token}")
	private String passwordToken;
	
	@Value("${webservices.rutatokenlogout}")
	private String rutatokenlogout;

	public String invocarJDE(VwJdeConfirmacionBancos param) {
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		// create auth credentials
		CredentialToken credentialToken = new CredentialToken(userToken, passwordToken);
		TokenResponse token = GestionToken.obtenerToken(credentialToken, rutatoken);

		// create headers
		try {
			HttpHeaders headers = new HttpHeaders();
//			String authStr = "JDEDIS1:JDEDIS2";
//			String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());
//			headers.add("Authorization", "Basic " + base64Creds);
			headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
			headers.set("jde-AIS-Auth", token.getUserInfo().getToken().replace("\"", ""));

			// create request
			HttpEntity<String> requestBody = new HttpEntity<String>(param.getDatoJson(), headers);
			ResponseEntity<String> response = restTemplate.postForEntity(ruta, requestBody, String.class);
			String cierra = GestionToken.cerrarToken(token, rutatokenlogout);
			if (cierra.contains("Success")) {
				System.out.println("Cerro la sesion correctamente " + cierra);
			} else {

				System.out.println("Error al cerrar la sesion " + cierra);
			}
			return response.getBody();

		} catch (HttpStatusCodeException e) {
			

			if (token != null) {
				String cierra = GestionToken.cerrarToken(token, rutatokenlogout);
				if (cierra.contains("Success")) {
					System.out.println("Cerro la sesion correctamente " + cierra);
				} else {

					System.out.println("Error al cerrar la sesion " + cierra);
				}

			}
			String header = e.getResponseBodyAsString();

			String error = "";
			// TODO: handle exception
			System.out.println("ERROR " + e.getMessage());
//
			return "ERROR " + header;
		}

	}

}
