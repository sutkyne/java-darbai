
import java.util.Scanner;

public class NumberAndSumOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumNum = 0;
		int numNum = 0;
		while (true) {
			System.out.println("Give a number:");
			int number = Integer.parseInt(scanner.nextLine());

			if (number == 0) {
				break;
			}
			numNum++;
			sumNum += number;
		}
		System.out.println("Number of numbers: " + numNum);
		System.out.println("Sum of the numbers: " + sumNum);
		scanner.close();
	}
}
