package com.safa.loan.soap.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.safa.loan.soap.ws.loaneligibility.CustomerRequest;
import com.safa.loan.soap.ws.loaneligibility.WsResponse;
import com.safa.loan.soap.ws.services.LoanEligibiltyService;

@RestController
public class TestSoap {
	@Autowired
	private LoanEligibiltyService service;
	
	
	@PostMapping("ws/loan/status")
	public WsResponse testConsume(@RequestBody CustomerRequest request) {
		return service.getLoanStatus(request);
		
	}

}
