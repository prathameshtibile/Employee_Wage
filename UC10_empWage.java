
public class UC10_empWage {
	public final String company;
	public final int empRtePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public UC10_empWage(String company, int empRtePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRtePerHour = empRtePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public void settotalEmpWage (int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for company :" +  company + "is:"+ totalEmpWage;
	}
	
	public class empWageArray{
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		
		private int numOfCompany = 0;
		private UC10_empWage [] UC10_empWageArray;
		
		public empWageArray() {
			UC10_empWageArray = new UC10_empWage[5];
			
		}
		private void addCompanyEmpWage(String company,int empRtePerHour,int numOfWorkingDays, int maxHoursPerMonth) {
			UC10_empWageArray[numOfCompany] = new UC10_empWage (company,empRtePerHour,numOfWorkingDays,maxHoursPerMonth);
		}
		
		
		
	private void computeEmpWage () {
		for (int i = 0; i<numOfCompany; i++) {
			UC10_empWageArray[i].settotalEmpWage(this.computeEmpWage(UC10_empWageArray[i]));
			System.out.println(UC10_empWageArray[i]);
			
		}
	}
		private int computeEmpWage(UC10_empWage)
		{
			int EmpHrs = 0, totalEmpHrs=0, totalWorkingDays = 0;
			while (totalEmpHrs<UC10_empWage.maxHoursPerMonth && totalWorkingDays < UC10_empWage.numOfWorkingDays ) {
				totalWorkingDays++;
				int empcheck = (int) Math.floor(Math.random()*10)%3;
				switch (empcheck) {
				case IS_PART_TIME:
					EmpHrs=4;
					break;
				case IS_FULL_TIME:
					EmpHrs=8;
					break;
				default:
					EmpHrs=0;
				}
				totalEmpHrs += EmpHrs;
				System.out.println("day" + totalWorkingDays );
				System.out.println("Emp Hour" + EmpHrs );
			}
			return totalEmpHrs*UC10_empWage.empRtePerHour;
		}
		
		
		
	}
	
}
 public static void main(String[] args) {
	 empWageArray empWage = new  empWageArray();
	 empWage.companyEmpWage("D mart" ,  20, 2, 10);
	 empWage.companyEmpWage("Star bazar" ,  10, 4, 15);
	 empWage.computeEmpWage();
}
