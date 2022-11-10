package com.bridgelabz;

public class Employee_wage {

	final static int IS_PART_TIME = 1; 
	final static int IS_FULL_TIME = 2; 
	int EMP_RATE_PER_HOUR;
	int NUM_OF_WORKING_DAYS;
	int MAX_HRS_IN_MONTH;//constant
	
	public Employee_wage(int eMP_RATE_PER_HOUR, int nUM_OF_WORKING_DAYS, int mAX_HRS_IN_MONTH)
	{
	
		EMP_RATE_PER_HOUR = eMP_RATE_PER_HOUR;
		NUM_OF_WORKING_DAYS = nUM_OF_WORKING_DAYS;
		MAX_HRS_IN_MONTH = mAX_HRS_IN_MONTH;
	}

	public void computeWage()
	{
		 int empHrs = 0;
		 int totalEmpHrs = 0;      
		 int totalWorkingDays=0;            //variables

		 // computation
		 while(totalEmpHrs <= MAX_HRS_IN_MONTH && 
			   totalWorkingDays < NUM_OF_WORKING_DAYS)
		 {
			 totalWorkingDays++; 
		 	
		 int emp_check=(int)Math.floor(Math.random()*10)%3;
		 
		 switch(emp_check)
		 {
		 case IS_PART_TIME :
			 empHrs=4;
			 break;
			 
		 case IS_FULL_TIME:
			 empHrs=8;
			 break;
			 
	     default:
			 empHrs=0;	 
		 }
		 
		 totalEmpHrs += empHrs;
		 System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHrs);
		 }
		 
		 int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
		 System.out.println("Total Emp wage: "+totalEmpWage);
	
	}

     public static void main(String[] args)
     {
    	 Employee_wage company1=new Employee_wage(10, 50, 150);
 		company1.computeWage();
 		
 		 Employee_wage company2=new Employee_wage(20, 30, 120);
  		company2.computeWage();
  		
  		 Employee_wage company3=new Employee_wage(30, 60, 130);
  		company3.computeWage();
	     // computeWage();
     }
}
