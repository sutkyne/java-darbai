import java.util.ArrayList;

public class Hold {
	private int maxWeight;
	private ArrayList<Suitcase> sCase = new ArrayList<>();
	private int totlWeight = 0;

	public Hold(int maxWeight) {
		super();
		this.maxWeight = maxWeight;
	}

	public void addSuitcase(Suitcase suitcase) {
		totlWeight += suitcase.totalWeight();

		if (totlWeight <= maxWeight) {
			sCase.add(suitcase);

		}

	}

	public void printItems() {
		for (Suitcase s : sCase) {
			s.printItems();
		}
	}

	public String toString() {
		return sCase.size() + " suitcases (" + totlWeight + " kg)";
	}
}
