import java.util.Objects;

public class Archive {
	private String identifier;
	private String name;

	public Archive(String identifier, String name) {
		super();
		this.identifier = identifier;
		this.name = name;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identifier, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Archive))
			return false;
		Archive other = (Archive) obj;
		return Objects.equals(identifier, other.identifier);
	}

	@Override
	public String toString() {
		return identifier + ": " + name;
	}

}
