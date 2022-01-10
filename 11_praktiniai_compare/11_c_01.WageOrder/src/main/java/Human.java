import java.util.Objects;

public class Human implements Comparable<Human>{

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

	@Override
	public int compareTo(Human other) {
		
		
		return other.wage-this.wage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(wage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Human))
			return false;
		Human other = (Human) obj;
		return wage == other.wage;
	}
	
}
