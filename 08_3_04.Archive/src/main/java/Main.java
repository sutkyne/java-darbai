
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Archive> arch = new ArrayList<>();

		while (true) {
			System.out.println("Identifier? (empty will stop)");
			String identifier = scanner.nextLine();
			if (identifier.isEmpty()) {
				break;
			}
			System.out.println("Name? (empty will stop)");
			String name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}

			Archive entry = new Archive(identifier, name);

			if (!(arch.contains(entry))) {

				arch.add(entry);
			}
		}
		System.out.println("==Items==");
		for (Archive a : arch) {

			System.out.println(a);
		}

	}
}
