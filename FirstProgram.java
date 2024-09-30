import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
		
		String name;
		int age;
		double years;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name?");
		name = scanner.nextLine();
		
		System.out.println("How many years old are you?");
		age = scanner.nextInt();
		
		System.out.println("How many years have you been teaching?");
		years = scanner.nextDouble();
		
		System.out.println("Name Entered: " + name);
		System.out.println("Age: " + age);
		System.out.println("Years teaching: " + years);
		
		
	}

}
