
import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		int number=Integer.parseInt(scanner.nextLine());	
		if (number<0) {
			number=(number*-1);
		}
		for ( i = 0; i <=number; i++) {
			
			System.out.println(i);
			
		}
		
	}
}
