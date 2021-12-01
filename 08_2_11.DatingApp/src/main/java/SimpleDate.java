
public class SimpleDate {

	private int day;
	private int month;
	private int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean before(SimpleDate compared) {
		if (this.year < compared.year) {
			return true;
		}

		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
			return true;
		}

		return false;
	}

	public void advance() {
		this.day++;
		if (this.day > 30) {
			this.month++;
			this.day = 1;
		}
		if (this.month > 12) {
			this.year++;
			this.month = 1;
		}
	}

	public void advance(int howManyDays) {
		for(int i = 0; i< howManyDays; i++) {
            advance();
        }
	}

	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public SimpleDate afterNumberOfDays(int days) {
		SimpleDate newDate = new SimpleDate(getDay(), getMonth(), getYear());
		for(int i = 0; i< days; i++) {
            newDate.day++;
			if (newDate.day > 30) {
				newDate.month++;
				newDate.day = 1;
			}
			if (newDate.month > 12) {
				newDate.year++;
				newDate.month = 1;
			}
        }
		return newDate;
	}

}
