
public class Student extends Person {
	private int studyCredits;

	public Student(String name, String adress) {
		super(name, adress);
		this.studyCredits = 0;

	}

	public int study() {
		studyCredits++;
		return studyCredits;
	}

	public int credits() {
		return studyCredits;
	}

	@Override
	public String toString() {

		return super.toString();
	}

}
