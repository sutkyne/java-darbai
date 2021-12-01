
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        boolean result = false;


        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            //result=!(books.contains(book.getName() )&&books.contains(book.getPublicationYear()));
            result=book instanceof books;
            books.add(book);
//            if (books.isEmpty()) {
//            	books.add(book);
//			} else if (result){
//        	   books.add(book);
//           }

        }
        for (Book book : books) {
			System.out.println(book);
		}

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
