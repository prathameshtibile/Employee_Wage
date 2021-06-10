
public class Wage_parttime {
	public static void main(String[] args) {
		int wageperhr=20;
		int dayhrs=8;
		int partTimehr=4;
		int wages= wageperhr*dayhrs;
		int empcheck=(int)Math.floor(Math.random()*10)%3;

		if(empcheck==0) {
		System.out.println("Employee is Absent");
		System.out.println("your Salary is zero");
		}
		
		if(empcheck==1) {
			System.out.println("Employe is present");
			System.out.println("Your salary is $" + wages);
		
	
      }
		if(empcheck==2) 
	
		{
			System.out.println("Employee is present half day");
			System.out.println("Your salary is " +wageperhr*partTimehr);
		
		}
			
		}
	
	
	
}
