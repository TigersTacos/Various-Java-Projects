import java.util.Scanner;
public class aidenraise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double pay, raisePercent, newishPay, newPay;
		System.out.println("Enter your current weekly pay:");
		pay = s.nextDouble();
		System.out.println("Enter your raise percentage:");
		raisePercent = s.nextDouble();
		
		newishPay = raisePercent * pay;
		newPay = newishPay + pay;
		System.out.println("Your new pay is: " + newPay);
		
	}

}
