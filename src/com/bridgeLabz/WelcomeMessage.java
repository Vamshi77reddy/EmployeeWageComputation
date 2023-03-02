package com.bridgeLabz;

public class WelcomeMessage {
	
			public static void main(String[] args) {

		        System.out.println("Welcome to Employee Wage Computation Program");
		        int wagePerHour = 20;
		        int fullDayHour = 8;
		        int dailyWage = 0;
		        int partTimeHour = 4;
		        int workingDays = 20;
		        for (int day = 0; day <= workingDays; day++) {

		        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;

		        switch (employeeCheck) {
		        case 1:
		            dailyWage = dailyWage+fullDayHour * wagePerHour;
		            System.out.println("Employee is present Full Time");
		            break;
		        case 2:
		        	 dailyWage = dailyWage+partTimeHour * wagePerHour;
		             System.out.println("Employee is present half time");
		             break;
default:		            System.out.println("Employee is absent");
		        }
		        System.out.println("Employee total wage is: " + dailyWage);
		    }}
		}