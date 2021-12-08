import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Room room = new Room();
		ArrayList<Person> p = new ArrayList<>();
		room.add(new Person("Lea", 183));
		room.add(new Person("Kenya", 182));
		room.add(new Person("Auli", 186));
		room.add(new Person("Nina", 172));
		room.add(new Person("Terhi", 185));

		System.out.println("");
		for (Person person : room.getPersons()) {
			System.out.println(person);
		}
		System.out.println("");
		while (!room.isEmpty()) {
			p.add(room.take());
		}
		for (Person person : p) {
			System.out.println(person);
		}
	}
}
