
public class Money {

	private final int euros;
	private final int cents;

	public Money(int euros, int cents) {

		if (cents > 99) {
			euros = euros + cents / 100;
			cents = cents % 100;
		}

		this.euros = euros;
		this.cents = cents;
	}

	public int euros() {
		return this.euros;
	}

	public int cents() {
		return this.cents;
	}

	public String toString() {
		String zero = "";
		if (this.cents < 10) {
			zero = "0";
		}

		return this.euros + "." + zero + this.cents + "e";
	}

	public Money plus(Money addition) {

		int eurThis = (this.euros * 100 + this.cents) + (addition.euros * 100 + addition.cents);
		int eur = eurThis / 100;
		int cent = eurThis % 100;
		Money newMoney = new Money(eur, cent);

		return newMoney;
	}

	public boolean lessThan(Money compared) {

		if ((this.euros * 100 + this.cents) < (compared.euros * 100 + compared.cents)) {
			return true;
		} else {
			return false;
		}

	}

	public Money minus(Money decreaser) {
		int eur = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);
		// If kai ivedami kazkurie(s) eurai(s) neigiami(as)
		// Testai veikia ir be

		if (this.euros < 0 && decreaser.euros < 0) {
			eur = 0;
		} else if (decreaser.euros < 0) {
			eur = (this.euros * 100 + this.cents) + (decreaser.euros * 100 - decreaser.cents);
		} else if (this.euros < 0) {
			eur = (this.euros * 100 - this.cents) + (decreaser.euros * 100 + decreaser.cents);
		}

		int cent = eur % 100;
		eur /= 100;
		if (eur < 0 || cent < 0) {
			eur = 0;
			cent = 0;

		}

		Money newMoney = new Money(eur, cent);

		return newMoney;

	}

}
