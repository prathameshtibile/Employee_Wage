
public class Daily_Wages{
	public static void main(String[] args) {
		int wageperhr=20;
		int dayhrs=8;
		int wages= wageperhr*dayhrs;
		int empcheck=(int)Math.floor(Math.random()*10)%2;
		
		if(empcheck==0) {
		System.out.println("Employee is Absent");
		System.out.println("your Salary is zero");
		}
		
		if(empcheck==1) {
			System.out.println("Employe is present");
			System.out.println("Your salary is $" + wages);
		}
		
		
	}

}