import java.util.ArrayList;

public class Suitcase {
	private int maxWeight;
	private ArrayList<Item> items = new ArrayList<>();
	private int totWeight = 0;

	public Suitcase(int maxWeight) {
		super();
		this.maxWeight = maxWeight;

	}

	public void addItem(Item item) {
		totWeight += item.getWeight();

		if (totWeight <= maxWeight) {
			items.add(item);

		}
	}

	public void printItems() {
		for (Item item : items) {
			System.out.println(item);
		}
	}

	public int totalWeight() {
		int temp = 0;
		for (Item item : items) {
			temp += item.getWeight();
		}
		return temp;
	}

	public Item heaviestItem() {
		if (items.isEmpty()) {
			return null;
		}
		Item itm = items.get(0);
		for (Item p : items) {

			if (itm.getWeight() < p.getWeight()) {
				itm = p;
			}
		}
		return itm;
	}

	public String toString() {
		if (items.isEmpty()) {
			return "no items (0 kg)";
		}

		if (items.size() < 2) {
			return items.size() + " item (" + totalWeight() + " kg)";

		} else {
			return items.size() + " items (" + totalWeight() + " kg)";

		}

	}
}
