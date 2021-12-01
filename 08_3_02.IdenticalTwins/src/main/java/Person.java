import java.util.Objects;

public class Person {

	private String name;
	private SimpleDate birthday;
	private int height;
	private int weight;

	public Person(String name, SimpleDate birthday, int height, int weight) {
		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthday, height, name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return Objects.equals(birthday, other.birthday) && height == other.height && Objects.equals(name, other.name)
				&& weight == other.weight;
	}

//	public boolean equals(Object compared) {
//		// if the variables are located in the same place, they are the same.
//		if (this == compared) {
//			return true;
//		}
//
//		// if the object is not instance of SimpleDate, the objects are not the same
//		if (!(compared instanceof SimpleDate)) {
//			return false;
//		}
//
//		// let's cast the object to SimpleDate
//		Person pers = (Person) compared;
//
//		// if the object's values are the same, the objects are the same
//		if (this.name.equals(pers.name) && this.birthday.equals(pers.birthday) && this.height == pers.height
//				&& this.weight == pers.weight) {
//			return true;
//		}
//
//		// other wise, the objects are not the same
//		return false;
//	}

	// implement an equals method here for checking the equality of objects
}
