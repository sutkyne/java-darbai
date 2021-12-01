
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	int i;
		System.out.print("Give a number: ");
		int number = Integer.parseInt(scanner.nextLine());
		int number2 = 1;
		scanner.close();
		for (i = 1; i <= number; i++) {
			number2 *= i;
			
		}
		System.out.println("Factorial: "+number2);
    }
}
