package com.bridgeLabz;

public class WelcomeMessage {
	
static final int FullTIme=1;
static final int PartTime=2;
static final int WAGEPerHour=20;
static final int WorkingDaysPerMonth=20;
static final int TotalWorkingHours=100;

 static void calculateWage() {
int wagePerHour = 20;
		        int fullDayHour = 8;
		        int dailyWage = 0;
		        int partTimeHour = 4;
		        int totalWorkingDays = 0;
		        int totalHour=0;
		        while (totalHour < 80 && totalWorkingDays < 20) {

		        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
		        totalWorkingDays++;
		        switch (employeeCheck) {
		        case 1:
                    totalHour = totalHour + fullDayHour;

		            dailyWage = dailyWage+fullDayHour * wagePerHour;
		            System.out.println("Employee is present Full Time" +dailyWage);
		            break;
		        case 2:
                    totalHour = totalHour + partTimeHour;

		        	 dailyWage = dailyWage+partTimeHour * wagePerHour;
		             System.out.println("Employee is present half time" +dailyWage);
		             break;
default:		            System.out.println("Employee is absent");
		        }
		        System.out.println("Working days is : " + totalWorkingDays   +   " Hours: "  +totalHour);
		    }
		        System.out.println("Employee total wage is: " + dailyWage);
}
public static void main(String[] args) {
	calculateWage();
		}
}