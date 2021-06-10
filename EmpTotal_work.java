
 public class EmpTotal_work {
 public static void main(String[] args) {
		
	int Wageperhr=20;
	int Workingdays=0;
	int Workinghrs=0;
	
	while ((Workingdays<=20) && (Workinghrs<=100))
	{
		
	int empcheck=(int)Math.floor(Math.random()*10)%3;
	if(empcheck==0)
	{ Workinghrs=8;}
	
	if(empcheck==1)
	{Workinghrs=4;}
	
	Workinghrs++;
	Workingdays++;
	
	System.out.println("Salary is :" + (Wageperhr*20*8));
	System.out.println("Salary for half day is :" + (Wageperhr*20*8));	
	}
	}

   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
