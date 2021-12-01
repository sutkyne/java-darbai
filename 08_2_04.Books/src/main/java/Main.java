import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> knygosNfo = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Title: ");
			String title = scanner.nextLine();
			if (title.isEmpty()) {
				break;
			}
			System.out.print("Pages: ");
			int pages = Integer.parseInt(scanner.nextLine());
			System.out.print("Publication year: ");
			int pubYear = Integer.parseInt(scanner.nextLine());
			knygosNfo.add(new Book(title, pages, pubYear));
		}
		System.out.println("What information will be printed? ");

		String whatToPrint = scanner.nextLine();
		for (Book book : knygosNfo) {

		}
		for (Book knyga : knygosNfo) {
			if (whatToPrint.equals("everything")) {
				System.out.println(knyga.getTitle() + ", " + knyga.getPages() + " pages, " + knyga.getPubYear());
			}
			if (whatToPrint.equals("name")) {
				System.out.println(knyga.getTitle());
			}
		}
	}
}
