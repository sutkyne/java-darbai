
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.print("Where to? ");
		int numberFinish = Integer.parseInt(scanner.nextLine());
		System.out.print("Where from? ");
		int numberStart = Integer.parseInt(scanner.nextLine());
		scanner.close();
		for(i=numberStart;i<=numberFinish;i++) {
			System.out.println(i);
		}
        // Write your program here
    }
}
