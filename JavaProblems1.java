//Name: WhittenB
//Date: Sep 23, 2024
//Title: Problem Set 1
//Description: 5 problems demonstrating input, output, variables, and math.

import java.util.Scanner;
public class JavaProblems1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Problem 1
		double cprice,  pincrease, nprice;
		System.out.println("Input current price: ");
		cprice = s.nextDouble();
		System.out.println("Input percentage increase: ");
		pincrease = s.nextDouble();
		nprice = cprice + (pincrease * cprice);
		System.out.println("New price is: " + nprice);
		// Problem 2
		String employee1;
		double annualpay, bonuspercentage;
		System.out.println("What is the employee's name?");
		employee1 = s.next();
		System.out.println("What is their current annual pay?");
		annualpay = s.nextDouble();
		System.out.println("What percent bonus do you want to give them?");
		bonuspercentage = s.nextDouble();
		System.out.println(employee1 + "'s bonus is:" + (annualpay + bonuspercentage * annualpay));
		// Problem 3
		int sinventory, asold, runits, einventory;
		System.out.println("Enter in order the starting inventory, amounts sold, and units returned.");
		sinventory = s.nextInt();
		asold = s.nextInt();
		runits = s.nextInt();
		einventory = sinventory - asold + runits;
		System.out.println("Your ending inventory is: " + einventory);
		// Problem 4
		double length, width, totalArea, sqftprice, totalCost;
		System.out.println("What is the length, width, and price per square foot?");
		length = s.nextDouble();
		width = s.nextDouble();
		sqftprice = s.nextDouble();
		totalArea = length * width;
		totalCost = sqftprice * totalArea;
		System.out.println("Your total price is: $" + totalCost + " With an area of: " + totalArea + " Square feet.");
		// Problem 5
		int balcony, floor, orchestra, totalbRevenue, totalfRevenue, totaloRevenue, overallRevenue, tSoldb, tSoldf, tSoldo, tsoldtotal;
		balcony = 15;
		floor = 30;
		orchestra = 25;
		System.out.println("How many tickets did the balcony sell?");
		tSoldb = s.nextInt();
		System.out.println("How many tickets did the floor sell?");
		tSoldf = s.nextInt();
		System.out.println("How many tickets did the orchestra sell?");
		tSoldo = s.nextInt();
		totalbRevenue = tSoldb * balcony;
		totalfRevenue = tSoldf * floor;
		totaloRevenue = tSoldo * orchestra;
		tsoldtotal = tSoldb + tSoldf + tSoldo;
		overallRevenue = totalbRevenue + totalfRevenue + totaloRevenue;
		System.out.println("Balcony sold " + tSoldb + " Tickets, making $" + totalbRevenue);
		System.out.println("Floor sold " + tSoldf + " Tickets, making $" + totalfRevenue);
		System.out.println("Orchestra sold " + tSoldo + " Tickets, making $" + totaloRevenue);
		System.out.println("Altogether, " + tsoldtotal + " tickets have been sold, making $" + overallRevenue);
	}

}
