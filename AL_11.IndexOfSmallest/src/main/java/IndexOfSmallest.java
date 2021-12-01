
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == 9999) {
				break;
			}

			list.add(input);
		}
		int lowestNum = list.get(0);
		int index = 0;
		for (int i = 0; i < list.size(); i++) {

			if (lowestNum > list.get(i)) {
				lowestNum = list.get(i);

			}

		}
		System.out.println("Smallest number: " + lowestNum);
		for (int i = 0; i < list.size(); i++) {

			if (lowestNum == list.get(i)) {
				index = i;
				System.out.println("Found at index: " + index);
			}
		} // implement here a program that reads user input
			// until the user enters 9999

		// after that, the program prints the smallest number
		// and its index -- the smallest number
		// might appear multiple times

	}
}
