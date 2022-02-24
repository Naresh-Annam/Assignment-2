package com.caseStudy1.calculator;

public class TrigonometricValues {
	public TrigonometricValues(String function, double degrees) {

		double cos, sin, tan = 0, cot;
		double radians = Math.toRadians(degrees);
		switch (function) {
		case "sin":
			sin = Math.sin(radians);
			System.out.println("sin(" + degrees + ") = " + sin);
			break;
		case "cos":
			cos = Math.cos(radians);
			System.out.println("cos(" + degrees + ") = " + cos);
			break;

		case "tan":
			tan = Math.tan(radians);
			System.out.println("Tan(" + degrees + ") = " + tan);
			break;
		case "cot":
			cot = 1 / tan;
			System.out.println("Cot(" + degrees + ") = " + cot);
			break;

		}

	}
}
