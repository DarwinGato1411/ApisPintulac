package com.ec.pintulac.utilitario;

import java.util.Base64;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

public class GestionToken {

	
	public static TokenResponse obtenerToken(CredentialToken credential, String urlconsulta) {
		try {
			
		
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		// create auth credentials
		String authStr = credential.getUserToken()+":"+credential.getPasswordToken();
		String base64Creds = Base64.getEncoder().encodeToString(authStr.getBytes());

		// create headers
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Creds);

		// Configuramos la entidad http y realizamos peticion get
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		ResponseEntity<TokenResponse> response = restTemplate.exchange(urlconsulta, HttpMethod.GET, requestEntity, TokenResponse.class);

		// Obtener el código de estado HTTP de la respuesta
		HttpStatus statusCode = response.getStatusCode();

		// Procesar la respuesta
		if (statusCode.is2xxSuccessful()) {
			TokenResponse responseBody = response.getBody();
			System.out.println("Respuesta: " + responseBody);
			return responseBody;
		} else {
			System.err.println("Error al hacer la solicitud. Código de respuesta: " + statusCode.value());
			return null;
		}
			
		} catch (Exception e) {
			System.out.println("ERROR AL CONSULTAR "+e.getMessage());
			return new TokenResponse("ERROR");
		}
	}
	
	public static String cerrarToken(TokenResponse token, String urlconsulta) {

		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
				HttpClientBuilder.create().build());
		RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);
		// create auth credentials

		// create headers
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
			LogoutToken logoutToken = new LogoutToken();
			logoutToken.setToken(token.getUserInfo().getToken());
			// create request
			HttpEntity<LogoutToken> requestBody = new HttpEntity<LogoutToken>(logoutToken, headers);
			ResponseEntity<String> response = restTemplate.postForEntity(urlconsulta, requestBody, String.class);

			return response.getBody();
		} catch (HttpStatusCodeException e) {
			String header = e.getResponseBodyAsString();
			String error = "";
			// TODO: handle exception
			System.out.println("ERROR " + e.getMessage());
//		error=e.get
			return header;
		}
	}
}
