
import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			System.out.println("Give a number:");
			input = Integer.parseInt(scanner.nextLine());

		} while (!(input == 4));
	}
}
