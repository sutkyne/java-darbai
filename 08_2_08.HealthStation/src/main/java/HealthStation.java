
public class HealthStation {
	private int weighings;

	public int weigh(Person person) {

		this.weighings++;
		return person.getWeight();
	}

	public int weighings() {
		return weighings;
	}

	public void feed(Person person) {
		person.setWeight(person.getWeight() + 1);
	}
}
