package com.caseStudy1.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public CalculatorTest() {
		System.out.println("select an option  : \n 1. Arthmetic operations \n 2. Trignametic Functions");
		Scanner s = new Scanner(System.in);
		int option = s.nextInt();

		if (option == 1) {
			System.out.println("Enter First Number");
			int num1 = s.nextInt();
			System.out.println("Enter Second Number");
			int num2 = s.nextInt();
			System.out.println(
					"Enter sysmbol to perform an operation \n Addition       : + \n Subraction     : - \n Multiplication : * \n Division       : / ");
			String operation = s.next();
			switch (operation) {
			case "+":
				new Addition(num1, num2);
				break;
			case "-":
				new Subraction(num1, num2);
				break;
			case "*":
				new Multiplication(num1, num2);
				break;
			case "/":
				new Division(num1, num2);
				break;
			default:
				System.out.println("Select correct operation");

			}
		}
		if (option == 2) {
			System.out.println("Enter the Function :\nsin\ncos\ntan\ncot");
			String function = s.next();
			System.out.println("Enter Degrees");
			double degrees = s.nextInt();
			new TrigonometricValues(function, degrees);
		}

	}

	public static void main(String[] args) {
		new CalculatorTest();
	}

}
