
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class Program {
	private HashMap<String, Book> hshMap = new HashMap<>();

	public static void main(String[] args) {
		HashMap<String, Book> hashmap = new HashMap<>();
		hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
		hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
		hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
		printValues(hashmap);

		List<Book> books = List.of(new Book("a", 11, ".."));
		System.out.println("\n---");
		//printValueIfNameContains(hashmap, "p");
		
		String text = "p";
		Predicate<Book> filter = v -> v.getPublicationYear() > 2000;

		filterAndPrint(hashmap, filter);
	}
	public static void printValues(HashMap<String, Book> hm) {
		hm.forEach((k, v) -> System.out.println(v));
	}

	public static void printValueIfNameContains(HashMap<String, Book> hm, String text) {
		hm.forEach((k,v)->{
			if((v.getName().contains(cleanString(text)))) {
				System.out.println(v);
			}
		}

				);
	}

	public static void filterAndPrint(HashMap<String, Book> hm, Predicate<Book> filter) {
		hm
			.values()
			.stream()
			.filter(filter)
			.forEach(System.out::println);	
	}


	public static void printWithStreams(HashMap<String, Book> hm, String text) {
		hm
			.values()
			.stream()
			.filter(v -> v.getName().contains(cleanString(text)))
			.forEach(System.out::println);	
	}

	public static String cleanString(String s) {
		if (s == null) {
			return "";
		}

		return s.toLowerCase().trim();

	}
}
