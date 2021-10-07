package de.tekup.calcul.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.calcul.services.CalculService;

@RestController
public class CalculCtrl {
	
	private CalculService service;

	public CalculCtrl(CalculService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping(path = "/{opr}/{op1}/{op2}")
	public double executCalc(@PathVariable String opr, @PathVariable double op1,
			@PathVariable double op2) {
		return service.calcul(op1, op2, opr);
	}
	

}
