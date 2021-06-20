/**
 * @author PRATHAMESH TIBILE
 *@since 15-6-21
 *Compute employee wage and calculate total wage for each company
 */
	public class UC9_empWage {
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		
		private final String company;
		private final int empRateperHour;
		private final int numofWorkingDays;
		private final int maxHoursperMonth;
		private  int totalEmpWage;
		
		public UC9_empWage(String company, int empRateperHour, int numofWorkingDays, int maxHoursperMonth ) 
		{
			this.company = company;
			this.empRateperHour =empRateperHour;
			this.numofWorkingDays = numofWorkingDays;
			this.maxHoursperMonth = maxHoursperMonth;
		}
		
		public void calempWage()
		{
			int empHours=0, totalEmpHours=0, totalWorkingDays=0	;
			while(totalEmpHours < this.maxHoursperMonth &&  totalWorkingDays < this.numofWorkingDays)
			{
				totalWorkingDays++;
				int empcheck = (int) Math.floor(Math.random()*10)%3;
				switch (empcheck)
				{
				case IS_PART_TIME:
					empHours=4;
					break;
					
				case IS_FULL_TIME:
					empHours=8;
					break;
				default :
					empHours=0;
				}
				totalEmpHours +=empHours;
				System.out.println("Working Day" + totalWorkingDays );
				System.out.println("Working Hours are" + empHours  );
			}
			totalEmpWage = 	totalEmpHours*empRateperHour;
			System.out.println("total employee wage is " + totalEmpWage);
			
		}

		@Override
		public String toString() 
		{
			return "UC9_empWage [company=" + company + ", empRateperHour=" + empRateperHour + ", numofWorkingDays="
					+ numofWorkingDays + ", maxHoursperMonth=" + maxHoursperMonth + "]";
		}
		
		
		
		public static void main(String[] args) 
		{
			UC9_empWage Dmart = new UC9_empWage ("Dmart", 15, 25, 10);
			UC9_empWage Reliance = new UC9_empWage ("Reliance", 20, 20, 10);
			Dmart.calempWage();
			System.out.println(Dmart);
			Reliance.calempWage();
			System.out.println(Reliance);
		}

		
		
		

}
