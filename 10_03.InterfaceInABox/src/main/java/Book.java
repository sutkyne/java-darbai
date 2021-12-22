
public class Book implements Packable {
	private String author;
	private String nameBook;
	private double weightBook;

	public Book(String author, String bookName, double weight) {
		super();
		this.author = author;
		this.nameBook = bookName;
		this.weightBook = weight;
	}

	@Override
	public double weight() {
		// TODO Auto-generated method stub
		return this.weightBook;
	}

	@Override
	public String toString() {
		return author + ": " + nameBook;
	}

}
