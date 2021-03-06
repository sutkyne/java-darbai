import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
	private int capacity;
	private ArrayList<Item> st;

	public BoxWithMaxWeight(int capacity) {
		st = new ArrayList<>();
		this.capacity = capacity;
	}

	@Override
	public void add(Item item) {
		int tempSize = 0;

		for (Item i : st) {
			tempSize += i.getWeight();
		}

		if (item.getWeight() <= capacity - tempSize) {
			st.add(item);
		}

	}

	@Override
	public boolean isInBox(Item item) {
		if (st.contains(item)) {
			return true;
		}
		return false;
	}

}
