package entities;

import exceptions.NumberException;

public class Calculator {
	private Double n1;
	private Double n2;
	
	public Calculator(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}

	public Double getN2() {
		return n2;
	}

	public void setN2(Double n2) {
		this.n2 = n2;
	}
	
	public Double addition() {
		return n1 + n2;
	}
	
	public Double subtraction() {
		return n1 - n2;
	}
	
	public Double multiplicate() {
		return n1 * n2;
	}
	
	public Double division() throws NumberException {
		
		if (n1 == 0 || n2 == 0) {
			throw new NumberException("Um dos números não pode ser igual a 0");
		}
		
		else {
			return n1 / n2;
		}
	}
}
