
public class Test {

	public static void main(String[] args) {
		Account acc = new Account(1122, 20000, 4.5);
		acc.withdrawal(2500);
		acc.deposit(3000);
		System.out.println(acc);

	}

}
