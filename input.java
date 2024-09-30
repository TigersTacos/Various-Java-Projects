import java.util.Scanner;

public class input {

	public static void main(String[] args) {
	//data declarations
	int a, b, c;
	String name;
	double gpa;
	
	Scanner s = new Scanner(System.in); // step 2
	
	System.out.println("Hi, what is your name?");
	name = s.nextLine();
	
	System.out.println ("Welcome " + name);
	
	System.out.println("What is your GPA?");
	gpa = s.nextDouble();
	
	System.out.println("Gpa of " + gpa + " is pretty good!");
	
	System.out.println("Input a: ");
	a = s.nextInt();
	
	System.out.print("Input B");
	b = s.nextInt();
	
	c = a + b;
	System.out.println("a + b = " + c);
	

	
	}
}
