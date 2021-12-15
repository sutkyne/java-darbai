import java.util.ArrayList;

public class Box implements Packable {
	double maxCap;
	private ArrayList<Book> bx;

	public Box(double maxCap) {
		bx = new ArrayList<>();
		this.maxCap = maxCap;
	}

	public double add(Book b) {
		int tempSize = 0;

		for (Book i : bx) {
			tempSize += i.weight();
		}

		if (b.weight() <= maxCap - tempSize) {
			bx.add(b);
		}
	}

	@Override
	public double weight() {
		double totWeight=0;
		for (Box b : bx) {
totWeight+=b.;
		}
		return 0;
	}

}
