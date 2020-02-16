package com.safa.loan.soap.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller =new Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.safa.loan.soap.ws.loaneligibility");
		return marshaller;
	}

}
