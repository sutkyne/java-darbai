
public class Teacher extends Person {
	private int salary;

	public Teacher(String name, String adress, int salary) {
		super(name, adress);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n  salary " + this.salary + " euro/month";
	}

}
