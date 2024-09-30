import java.util.Scanner;

public class VariablesMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x,y;
		
		System.out.println("Please enter two numbers.");
		x = s.nextDouble();
		y = s.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("x + y = " + (x+y));
		System.out.println("Average of x and y = " + ((x+y)/2));
		System.out.println("Average of x and x =" + ((x+x)/2));
		System.out.println("Average of y and y = " + ((y+y)/2));
		System.out.println("Quotient of x and y = " + (x/y));
		System.out.println("Quotient of x and x = " + (x/x));
		System.out.println("Quotient of y and y = " + (y/y));
		System.out.println("x - y = " + (x - y));
		
	}

}
