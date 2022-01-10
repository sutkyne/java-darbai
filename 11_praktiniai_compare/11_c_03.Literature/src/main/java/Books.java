import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Books implements Comparable<Books>{
	private String bookName;
	private int recommendedAge;
	private List<Books> litBooks;
	public Books() {
		litBooks= new ArrayList<Books>();
	}

	public Books(String bookName, int recommendedAge) {
		super();
		this.bookName = bookName;
		this.recommendedAge = recommendedAge;

	}

	@Override
	public int compareTo(Books other) {
			int compName= this.bookName.compareToIgnoreCase(other.bookName);
			int compAge=this.recommendedAge - other.recommendedAge;
		if(compAge!=0) {
			return this.recommendedAge - other.recommendedAge;
		}
		return  compName;
	}
	public void addBooks(Books bk) {

		litBooks.add(bk);
	}
	public void printBooks() {
		System.out.println("Books:");
		for (Books books : litBooks) {
			System.out.println(books);
		}
	}
	public void sortBooks() {
		Collections.sort(litBooks);
	}
	public int size() {
		return litBooks.size();
	}
	@Override
	public String toString() {
		return bookName + " (recommended for " + recommendedAge + " year-olds or older)";
	}

}
