package com.poc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.poc.model.CEPResponse;

@Service
public class CepService {

	public CEPResponse getCEP(final String cep) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://viacep.com.br/ws/{cep}/json/";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		Map<String, String> params = new HashMap<String, String>();
		params.put("cep", cep);

		ResponseEntity<CEPResponse> response = restTemplate.getForEntity(url, CEPResponse.class, params);
		return response.getBody();
	}

}
