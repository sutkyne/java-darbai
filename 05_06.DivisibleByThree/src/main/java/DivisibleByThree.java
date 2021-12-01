
import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		divisableByThreeInrange(2, 10);
	}

	public static void divisableByThreeInrange(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}
}
