public class DailyEmployeeWageUc2 {
	public static void main(String[] args) {
		int isFullTime=1;
		int wagePerHour=20;
		int fullDayHour=8;
		double empCheck=Math.floor((Math.random()*10)%2);
		if(empCheck==isFullTime) {
			System.out.println("Employee is present");
			System.out.println("Total wage of the day= "+(wagePerHour*fullDayHour)+" rupees");

		}
		else 
		{
			System.out.println("Employee is absent");
			System.out.println("Total wage of the day=0 rupees");
	   }
	}

}
