
public class AccountChecking extends Account {
	private double overdraftLimit;

	public AccountChecking(AccountWithTransaction a, double overdraftLimit) {
		super(a.getId(), a.getBalance(), a.getAnnualInterestRate());
		this.overdraftLimit = overdraftLimit;
		// TODO Auto-generated constructor stub
	}

	public AccountChecking(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdrawal(double ammount) {
		if (ammount <= overdraftLimit && ammount > 0) {
			super.withdrawal(ammount);
			System.out.println("Withdrawal succesfull \n Balance: " + super.getBalance());
		} else {
			System.out.println("Ammount exeeds overdraft limit or is negative \nLimit: " + overdraftLimit);
		}
	}

	@Override
	public String toString() {
		return "AccountChecking [overdraftLimit=" + overdraftLimit + ", getBalance()=" + getBalance()
				+ ", getDateCreated()=" + getDateCreated() + "]";
	}

}
