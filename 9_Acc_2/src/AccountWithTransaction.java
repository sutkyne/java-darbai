import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountWithTransaction {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private List<Transaction> tr = new ArrayList<Transaction>();

	public AccountWithTransaction() {
		name="";
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();

	}

	public AccountWithTransaction(String name,int id, double balance) {
		super();
		this.name=name;
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public AccountWithTransaction(String name,int id, double balance, double annualInterestRate) {
		super();
		this.name=name;
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 1200;
	}

	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * getBalance();
	}

	public void withdrawal(double ammount) {
		if (this.balance >= ammount && ammount > 0) {
			this.balance -= ammount;
			tr.add(new Transaction('w', ammount, balance, "Withdrawal succesfull"));
			System.out.println("Balance: " + this.balance);
		} else {
			System.out.println("The amount is too great to withdraw \n Not enough balance \n" + this.balance);
		}

	}

	public void deposit(double ammount) {
		if (ammount > 0) {
			this.balance += ammount;
			tr.add(new Transaction('d', ammount, balance, "Deposit succesfull"));
			System.out.println("Balance: " + this.balance);

		} else {
			System.out.println("Ammount must be possitive");
		}

	}

	@Override
	public String toString() {
		String str="";
		for (Transaction transaction : tr) {
			str+=transaction+"\n";
		}
		return "Account [balance=" + balance + ", getMonthlyInterest()=" + getMonthlyInterest() + ", dateCreated="
				+ dateCreated + "]"+"\n"+str;
	}

}
