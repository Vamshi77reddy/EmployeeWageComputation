package com.bridgeLabz;

public class WelcomeMessage {
	
			public static void main(String[] args) {

		        System.out.println("Welcome to Employee Wage Computation Program");
		        int wagePerHour = 20;
		        int fullDayHour = 8;
		        int dailyWage = 0;
		        int partTimeHour = 4;
		        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;

		        if (employeeCheck == 1) {
		            dailyWage = fullDayHour * wagePerHour;
		            System.out.println("Employee is present Full Time");
		        } else if(employeeCheck == 2){
		        	 dailyWage = partTimeHour * wagePerHour;
		             System.out.println("Employee is present half time");
		        }else {
		            System.out.println("Employee is absent");
		        }
		        System.out.println("Employee total wage is: " + dailyWage);
		    }
		}