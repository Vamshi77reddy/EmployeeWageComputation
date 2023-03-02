package com.bridgeLabz;

public class WelcomeMessage {
	
		public static void Attendance() {

		int empCheck = (int) ( (Math.random() * 10 )% 2);

		if (empCheck == 1) {

			System.out.println("Employee is present");

		} else {

			System.out.println("Employee is absent");
		}
		

		
}

public static void main(String[] args) {
	System.out.println("Welcome to EmployeewageComputation");
	Attendance();
}}