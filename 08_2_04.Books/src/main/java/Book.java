
public class Book {
	private String title;
	private int pages;
	private int pubYear;

	public Book(String title, int pages, int pubYear) {
		this.title = title;
		this.pages = pages;
		this.pubYear = pubYear;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

}
