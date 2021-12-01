
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int number2 = 0;
		System.out.print("First number? ");
		int numFirst = Integer.parseInt(scanner.nextLine());
		System.out.print("Last number? ");
		int numLast = Integer.parseInt(scanner.nextLine());
		scanner.close();
		for (i = numFirst; i <= numLast; i++) {
			number2 += i;
			
		}
		System.out.println("The sum is "+number2);
    }
}
