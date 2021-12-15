import java.util.ArrayList;

public class Box implements Packable {
	double maxCap;
	private ArrayList<Packable> box;

	public Box(double maxCap) {
		box = new ArrayList<>();
		this.maxCap = maxCap;
	}

	public void add(Packable p) {
		int tempSize = 0;

		for (Packable i : box) {
			tempSize += i.weight();
		}

		if (p.weight() <= maxCap - tempSize) {
			box.add(p);
		}
	}

	@Override
	public double weight() {
		double totWeight = 0;
		for (Packable b : box) {
			totWeight += b.weight();
		}
		return totWeight;
	}

	@Override
	public String toString() {
		return "Box [maxCap=" + maxCap + ", box=" + box + "]";
	}

}
