package com.cspinformatique.broadleaf.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import com.cspinformatique.broadleaf.client.util.RestUtil;

public class BroadleafTemplate {
	private String url;
	private String username;
	private String password;
	private RestTemplate restTemplate;

	private boolean secured;

	public BroadleafTemplate(String url, String username, String password) {
		this(url, username, password, new RestTemplate());
	}

	public BroadleafTemplate(String url, String username, String password,
			RestTemplate restTemplate) {
		this.url = url;
		this.username = username;
		this.password = password;
		this.restTemplate = restTemplate;

		Assert.notNull(restTemplate);

		if (username != null && password != null) {
			secured = true;
		}
	}

	public <T> T exchange(String endpoint, HttpMethod httpMethod,
			Object requestBody, Class<T> returnType) {
		HttpEntity<?> httpEntity = null;

		HttpHeaders headers = null;
		if (secured) {
			headers = RestUtil.createBasicAuthHeader(username, password);
			headers.setContentType(MediaType.APPLICATION_JSON);

			httpEntity = new HttpEntity<Object>(requestBody, headers);
		} else {
			headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			httpEntity = new HttpEntity<Object>(requestBody, headers);
		}

		ResponseEntity<T> responseEntity = this.restTemplate.exchange(url
				+ endpoint, httpMethod, httpEntity, returnType);

		if (responseEntity.getStatusCode() != HttpStatus.OK) {
			throw new RuntimeException("Server responding with "
					+ responseEntity.getStatusCode().value() + " : "
					+ responseEntity.getStatusCode().getReasonPhrase());
		}

		return responseEntity.getBody();
	}
}
