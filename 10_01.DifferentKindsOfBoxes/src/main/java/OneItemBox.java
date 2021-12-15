import java.util.ArrayList;

public class OneItemBox extends Box {
	private ArrayList<Item> st;

	public OneItemBox() {
		st = new ArrayList<>();

	}

	@Override
	public void add(Item item) {
		if (st.size() < 1) {
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
