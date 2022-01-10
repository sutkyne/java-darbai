
public class Test {

	public static void main(String[] args) {
//		Account acc = new Account(1122, 1000, 1.5);
//		AccountChecking accChecking= new AccountChecking(acc, 0);
//		AccountSavings accSavings = new AccountSavings(acc);
		AccountWithTransaction accWTransaction= new AccountWithTransaction ("George", 1122, 1000, 1.5);
		accWTransaction.withdrawal(30);
		accWTransaction.withdrawal(40);
		accWTransaction.withdrawal(50);
		accWTransaction.deposit(5);
		accWTransaction.deposit(4);
		accWTransaction.deposit(2);
		System.out.println(accWTransaction);
//		System.out.println(acc);
//		acc.withdrawal(2500);
//		System.out.println(acc);
//		acc.deposit(3000);
//		System.out.println(acc);
//		System.out.println(accChecking);
//		System.out.println(accSavings);


	}

}
