
public class Person {
	private String name;
	private String adress;

	public Person(String name, String adress) {
		super();
		this.name = name;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return name + "\n  " + adress;
	}

}
