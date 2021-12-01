
import java.util.Scanner;

public class OnlyPositives {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.println("Give a number:");
			number = Integer.parseInt(scanner.nextLine());
			if (number < 0) {
				System.out.println("Unsuitable number");

			} else {
				System.out.println(number * number);
			}
			
		}while (!(number == 0)); 
			
	
		scanner.close();
//		while (true) {
//			System.out.println("Give a number:");
//			int number = Integer.parseInt(scanner.nextLine());
//			if (number == 0) {
//				break;
//			}
//
//			if (number > 0) {
//				System.out.println(number * number);
//
//			} else {
//				System.out.println("Unsuitable number");
//			}
//
//		}
//		scanner.close();
	}
}
