
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a year:");
		int year = Integer.parseInt(scan.nextLine());
		scan.close();
		//Trumpesnis if
		if (year % 4 ==0 && (year % 100 !=0 || year % 400 ==0))
		//Tas pats su boolean.
		/* boolean leap4 = year % 4 == 0;
		   boolean leap100 = year % 100 != 0;
		   boolean leap400 = year % 400 == 0;
		if (leap4 && (leap100 || leap400))    */ {

			System.out.println("The year is a leap year.");
		} else {
			System.out.println("The year is not a leap year.");
		}
		

	}
}
