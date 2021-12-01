
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: "+statistics.getCount());
//        System.out.println("Sum: "+statistics.sum());
//        System.out.println("Count: "+statistics.average());
		Statistics st = new Statistics();
		Statistics sumEven = new Statistics();
		Statistics sumOdd = new Statistics();
		System.out.println("Enter numbers:");
		while (true) {
			int input = Integer.valueOf(scan.nextLine());
			if (input == -1) {
				break;
			}

			st.addNumber(input);
			
			if (input % 2 == 0) {
				sumEven.addNumber(input);
			} else {
				sumOdd.addNumber(input);
			}
		}
		System.out.println("Sum: " + st.sum());
		System.out.println("Sum of even numbers: " + sumEven.sum());
		System.out.println("Sum of odd numbers: " + sumOdd.sum());

	}
}
