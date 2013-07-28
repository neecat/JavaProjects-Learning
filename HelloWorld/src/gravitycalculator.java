
public class gravitycalculator {

	public static void main(String[] args) {
		double x; //position
		double gravity = -9.81; //earth gravity
		double xi=990; //starting position
		double t=10; //time
		double a=910; //altitude
		double v=20; //starting velocity
		x=0.5*a*(t*t)+v*t+xi;
		x=x/t;
		System.out.println("The answer is "+x+".");
	}

}
