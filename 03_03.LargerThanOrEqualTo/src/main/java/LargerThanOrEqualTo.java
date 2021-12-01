
import java.util.Scanner;

public class LargerThanOrEqualTo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give the first number:");
		int number1 = Integer.parseInt(scan.nextLine());
		System.out.println("Give the second number:");
		int number2 = Integer.parseInt(scan.nextLine());
		/**String atsak = number1 == number2 ? "The numbers are equal!"
				: number1 > number2 ? "Greater number is: " + number1 
						: "Greater number is: " + number2;
				System.out.println(atsak);*/

		if (number1 > number2) {
			System.out.println("Greater number is: " + number1);
		} else if (number1 == number2) {
			System.out.println("The numbers are equal!");
		} else {
			System.out.println("Greater number is: " + number2);
		} 
	}
}
// if ()word.equals("djdjdj")
//String atsak = number1 == number2 ?"The numbers are equal!": number1 > number2 "Greater number is: " + number1: "Greater number is: " + number2;  // if ()word.equals("djdjdj")
