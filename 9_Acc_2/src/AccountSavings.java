
public class AccountSavings extends Account {

	public AccountSavings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountSavings(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);

	}

	public AccountSavings(AccountWithTransaction a) {
		super(a.getId(), a.getBalance(), a.getAnnualInterestRate());

	}

	public AccountSavings(int id, double balance) {
		super(id, balance);

	}

	@Override
	public String toString() {
		return "AccountSavings [toString()=" + super.toString() + "]";
	}

}
