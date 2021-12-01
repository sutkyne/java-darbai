
import java.util.Scanner;

public class AverageOfNumbers {

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

			sumNum += number;
			numNum++;

		}
		System.out.println("Average of the numbers: " + (double) sumNum / numNum);
		scanner.close();
	}
}
