
public class Wageby_case {
	public static void main(String[] args) {
	int wageperhr=20;
	int dayhrs=8;
	int wages=wageperhr*dayhrs;
	int partTimehr=4;
	int partTimewage=wageperhr*partTimehr;
	
	int empcheck=(int) Math.floor(Math.random()*10)%3;
	switch (empcheck)
	{
	
	case 0:
		System.out.println("Employee is absent");
		System.out.println("your salary is zero");
	break;
	case 1:
		System.out.println("Employee is present");
		System.out.println("your salary is $" +wages);
	break;
	case 2:
		System.out.println("Employee is present half day");
		System.out.println("your salary is $" + partTimewage);
	break;
	}
		
		
		
		
	}
	
	
	
	

}
