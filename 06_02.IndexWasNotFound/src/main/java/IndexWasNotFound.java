
import java.util.Scanner;

public class IndexWasNotFound {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		array[0] = 6;
		array[1] = 2;
		array[2] = 8;
		array[3] = 1;
		array[4] = 3;
		array[5] = 0;
		array[6] = 9;
		array[7] = 7;

		System.out.print("Search for? ");
		int src = Integer.valueOf(scanner.nextLine());
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == src) {
				System.out.println(src + " is at index " + i + ".");
				break;
			}
			count++;
		} 
		if (count==array.length)
			System.out.println(src + " was not found.");
		// Implement the search functionality here
	}

}
