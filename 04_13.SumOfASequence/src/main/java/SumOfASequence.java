
import java.util.Scanner;

public class SumOfASequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.print("Last number? ");
		int number = Integer.parseInt(scanner.nextLine());
		int number2 = 0;
		scanner.close();
		for (i = 0; i <= number; i++) {
			number2 += i;
			
		}
		System.out.println("The sum is "+number2);
	}
}
