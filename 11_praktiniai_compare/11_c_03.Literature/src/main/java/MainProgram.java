
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
    	Books bkz= new Books();

        Scanner scanner = new Scanner(System.in);
        while (true) {
        	System.out.print("Input the name of the books, empty stops: ");
        	String title = scanner.nextLine();
			if (title.isEmpty()) {
				break;
			}
			System.out.print("Input the age recommendation: ");
			int age = Integer.parseInt(scanner.nextLine());
			bkz.addBooks(new Books(title,age));
			bkz.sortBooks();
		}
        System.out.println(bkz.size()+" books in total.\n");
        bkz.printBooks();
        scanner.close();
    }


}
