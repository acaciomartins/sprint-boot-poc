package com.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.CepService;
import com.poc.model.CEPResponse;

@RestController
@RequestMapping(value = "/poc/cep")
public class CepController {

	@Autowired
	CepService service;

	@GetMapping(value = "/{cep}")
	public ResponseEntity<CEPResponse> getCEP(@PathVariable(value = "cep") String cep) {
		CEPResponse response = service.getCEP(cep);
		return ResponseEntity.ok(response);
	}
}
