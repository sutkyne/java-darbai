
public class EmpTest {

	public static void main(String[] args) {
	Employee e1 = new Employee(1, "Jonas", "Vilkas", 666);	
	e1.setSalary(20);
	e1.raiseSalary(36);
	System.out.println(e1.toString());
	}

}
