import java.util.Scanner;
public class Stanley {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//declare variables
		String name;
		int yards, catches, tds, points;
		
		//prompt for and get inputs
		System.out.println("Enter Player name");
		name = s.nextLine();
		
		System.out.println("Enter yards, catches, and tds.");
		yards = s.nextInt();
		catches = s.nextInt();
		tds = s.nextInt();
		
		points = yards + catches * 2 + tds * 7;
		
		System.out.println("Name: " + name);
		System.out.println( yards + " yards ");
		System.out.println( catches + " catches ");
		System.out.println( tds + " touchdowns ");
		System.out.println( points + " points ");
		
		
	}

}
