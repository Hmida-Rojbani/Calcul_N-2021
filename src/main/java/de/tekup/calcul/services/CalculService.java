package de.tekup.calcul.services;

import org.springframework.stereotype.Service;

@Service
public class CalculService {
	
	public double calcul(double op1, double op2, String opr) {
		switch (opr) {
		case "add":
			return op1+op2;
		case "sous":
			return op1-op2;	
		case "mul":
			return op1*op2;
		case "div":
			return op1/op2;
		default:
			return 0;
		}
		
	}

}
