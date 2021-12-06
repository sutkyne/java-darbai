import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		DebitAccount acc1 = new DebitAccount(1, "Jurgis", 500);
		CreditAccount acc1Credit = new CreditAccount(acc1,1000, 100);
		
		
		accountsTest(acc1,acc1Credit);
	}

	public static void accountsTest(DebitAccount acc, CreditAccount accCredit) {

		Scanner sc = new Scanner(System.in);
		while (true) {

			String anotherOp = "y";
			System.out.println("Which account would you like to use? debit/credit");
			String whichAcc = sc.nextLine();
			if (whichAcc.equals("debit")) { // debit
				System.out.println("What operation do you want to perform? \n"
						+ " \"c\" for cash withdrawal, \"t\" for top up balance, \"a\" for account info");
				String whichOp = sc.nextLine();
				if (whichOp.equals("c")) {
					System.out.println("How much?");
					double howMuch = Double.parseDouble(sc.nextLine());
					acc.cashWithdrawal(howMuch);
				}
				if (whichOp.equals("t")) {
					System.out.println("How much?");
					double howMuch = Double.parseDouble(sc.nextLine());
					acc.topUpBalance(howMuch);
				}
				if (whichOp.equals("a")) {
					System.out.println(acc);
				}

			} else if (whichAcc.equals("credit")) { // credit
				System.out.println("What operation do you want to perform? \n"
						+ " \"c\" for cash withdrawal, \"t\" for top up balance,"
						+ " \"b\" for borrow money, \"a\" for account info");
				String whichOp = sc.nextLine();

				if (whichOp.equals("c")) {
					System.out.println("How much?");
					double howMuch = Double.parseDouble(sc.nextLine());
					accCredit.cashWithdrawal(howMuch);

				}
				if (whichOp.equals("t")) {
					System.out.println("How much?");
					double howMuch = Double.parseDouble(sc.nextLine());
					accCredit.topUpBalance(howMuch);
				}
				if (whichOp.equals("b")) {
					System.out.println("How much?");
					double howMuch = Double.parseDouble(sc.nextLine());
					accCredit.borrowMoney(howMuch);
				}
				if (whichOp.equals("a")) {
					System.out.println(accCredit);
				}

			}
			System.out.println("Would you like another operation? y/n");
			anotherOp = sc.nextLine();
			if (anotherOp.equals("n")) {
				break;
			}
		}

	}
}
