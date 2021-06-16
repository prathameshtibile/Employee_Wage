/**
 * @author PRATHAMESH TIBILE
 *@since 15-6-21
 *Compute employee wage for multiple companies using class method 
 */

public class UC8_Multiplecompanies {
	public static  final int IS_PART_TIME = 1;
	public static  final int IS_FULL_TIME = 2;
	
	public static int calEmpWage(String company, int empRateperHour, int NumofWorkingDays, int MaxHoursperMonth)
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			while(totalEmpHrs<MaxHoursperMonth && totalWorkingDays<NumofWorkingDays) {
			//	totalWorkingDays++;
				
				int empcheck = (int) Math.floor(Math.random()*10)%3;	
				switch (empcheck)
				{
				case IS_PART_TIME:
				empHrs = 4;
				break;
				case IS_FULL_TIME:
				empHrs = 8;
				break;
				default:
				empHrs = 0;
				}
				totalWorkingDays++;
				totalEmpHrs += empHrs;
				
				System.out.println(" working day  " + totalWorkingDays);
				System.out.println("Total employee Hours are " + empHrs);
				}
			System.out.println("Totalemphrs " + totalEmpHrs);
		       int totalEmpWage = totalEmpHrs *  empRateperHour;
		       System.out.println("total employee wage for company " + company + "is " +  totalEmpWage  );
			return totalEmpWage;
	}
	
public static void main(String[] args) 
  {
	calEmpWage("Reliance " , 10 , 20, 100);
	System.out.println("");
	calEmpWage("Star Bazar " , 10 , 15, 70);
	
 }

}
