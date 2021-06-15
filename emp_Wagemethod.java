/**
 * @author PRATHAMESH TIBILE
 *@since 14-6-21
 *calculate EmpWage using class method 
 */


public class emp_Wagemethod {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	
	public static int calculateEmpwage () {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;  // variables declared
		 while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) {
			 totalWorkingDays++;
			 int empcheck = (int) Math.floor(Math.random()*10)%3;
			 switch (empcheck) {
			 
			 case  IS_PART_TIME:
				 empHrs = 4;
				 break;
			 case IS_FULL_TIME:
				 empHrs = 8;
				 break;
		     default :
		    	 empHrs = 0;
			 }
			 totalEmpHrs += empHrs;
			 System.out.println("Totaldays" + totalWorkingDays + "EmpHrs: " + empHrs );
		 } // while loop 
		 int totalWage = totalEmpHrs * EMP_RATE_PER_HOUR ;
		 System.out.println("The Total Employee Wage is " + totalWage);
		return totalWage;
		 
		
	}// static method
	public static void main(String[] args) {
		calculateEmpwage();
		
	}	
		
			
	}
	
	
	
	


