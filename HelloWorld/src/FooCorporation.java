
class FooCorporation {
	public static void main(String[] arguments){
		System.out.println("Employee 1 -- $"+payroll(35,7.50));
		System.out.println("Employee 2 -- $"+payroll(47,8.20));
		System.out.println("Employee 3 -- $"+payroll(73,10.00));
	}
	public static double payroll(int hours,double wage){
		double earnings=0.0;
		double timeandhalf=wage+0.5*wage;
		double overtime=0.0;
		if(hours>60)
		{
		System.out.println("Error: Hours too High!");
		}
		if(hours>40){
			overtime=hours-40;
			hours=40;
		}
		if(wage<8.00){
			System.out.println("Error: Wage too low!");
			earnings=wage*hours+overtime*timeandhalf;
		}else
		{
			earnings=wage*hours+overtime*timeandhalf;
		}
		
		return earnings;
	}
}
