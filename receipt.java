import java.util.Scanner;
public class receipt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String product1;
		String product2;
		String product3;
		double price1, price2, price3, subtotal, salestax, totalprice;
		System.out.println("What is their first purchase's name and price?");
		product1 = s.next();
		price1 = s.nextDouble();
		System.out.println("What is their second purchase's name and price?");
		product2 = s.next();
		price2 = s.nextDouble();
		System.out.println("What is their third purchase's name and price?");
		product3 = s.next();
		price3 = s.nextDouble();
		System.out.println("What is the sales tax? Input as a 0.x please.");
		salestax = s.nextDouble();
		subtotal = price1 + price2 + price3;
		totalprice = subtotal * salestax;
		System.out.println("*********************");
		System.out.println("   Joe's Hardware    ");
		System.out.println("   1600 penn ave, dc ");
		System.out.println("   (123) 456 7890    ");
		System.out.println("  Desc       Price    ");
		System.out.println( "  " + product1 + "     $  " + price1);
		System.out.println( "  " + product2 + "     $  " + price2);
		System.out.println( "  " + product3 + "     $  " + price3);
		System.out.println( "  Subtotal: $" + subtotal);
		System.out.println( "  Tax: %" + salestax);
		System.out.println( "  Total: $" + totalprice);
		
	}

}
