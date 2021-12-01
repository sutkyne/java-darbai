import java.util.Objects;

public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

	@Override
	public int hashCode() {
		return Objects.hash(name, publicationYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(name, other.name) && publicationYear == other.publicationYear;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", publicationYear=" + publicationYear + "]";
	}
	

}
