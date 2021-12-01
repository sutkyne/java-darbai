
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

	public static void main(String[] args) {

		// This exercise is worth five exercise points, and it is
		// gradually extended part by part.

		// If you want, you can send this exercise to the server
		// when it's just partially done. In that case the server will complain about
		// the parts you haven't done, but you'll get points for the finished parts.

		Scanner scanner = new Scanner(System.in);
		int sumNum = 0;
		int numNum = 0;
		int even = 0;
		int odd = 0;
		System.out.println("Give a numbers:");
		while (true) {

			int number = Integer.parseInt(scanner.nextLine());

			if (number == -1) {
				System.out.println("Thx! Bye!");
				break;
			}
			numNum++;
			sumNum += number;
			if (number % 2 != 0) {
				odd++;
			} else {
				even++;
			}
		}

		System.out.println("Sum : " + sumNum);
		System.out.println("Numbers: " + numNum);
		System.out.println("Average: " + (double) sumNum / numNum);
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);

		scanner.close();
	}
}
