import java.util.ArrayList;

public class Room {
	private ArrayList<Person> room;

	public Room() {
		super();
		this.room = new ArrayList<>();
	}

	public void add(Person person) {
		this.room.add(person);
	}

	public boolean isEmpty() {
		return this.room.isEmpty();
	}

	public ArrayList<Person> getPersons() {
		return this.room;
	}

	public Person shortest() {

		if (room.isEmpty()) {
			return null;
		}
		Person pers = room.get(0);
		for (Person p : room) {

			if (pers.getHeight() > p.getHeight()) {
				pers = p;
			}
		}
		return pers;
	}

	public Person take() {

		if (room.isEmpty()) {
			return null;
		}
		Person pers = room.get(0);
		for (Person p : room) {

			if (pers.getHeight() > p.getHeight()) {
				pers = p;
			}
		}

		room.remove(pers);

		return pers;
	}
}
