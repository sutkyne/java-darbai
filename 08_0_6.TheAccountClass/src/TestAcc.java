
public class TestAcc {

	public static void main(String[] args) {
		Account a1 = new Account("1","Juozas", 100); 
		Account a2 = new Account("2","Jonas", 120); 
		a1.credit(20);
		a2.debit(30);
		a1.transferTo(a2,30);
		System.out.println(a1);
		System.out.println(a2);
	}

}
