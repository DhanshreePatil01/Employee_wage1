package com.bridgelabz;

public class Employee_wage {

	public static void main(String[] args) {
		
		 int IS_FULL_TIME = 1; 
		 int EMP_RATE_PER_HOUR = 20; //constant
		 
		 int empHrs = 0;
		 int empWage = 0;            //variables

		 // computation
		 double emp_check=Math.floor(Math.random()*10)%2;
		 
		 if(emp_check==IS_FULL_TIME)
			 
			 empHrs = 8 ;
		 
		 else
			 
			 empHrs =0;
		 
		 empWage = empHrs * EMP_RATE_PER_HOUR;
		 System.out.println("emp wage: "+empWage);
	}

}
