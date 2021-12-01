
public class Account {
	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		return this.balance += amount;
	}

	public int debit(int amount) {
		if (amount <= this.balance) {
			return this.balance -= amount;
		} else
			System.out.println("Amount is greater than balance");
		return this.balance;
	}

	public int transferTo(Account whoReceives, int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			whoReceives.balance += amount;
		} else
			System.out.println("Amount is greater than balance");
		return this.balance;
	}

	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
