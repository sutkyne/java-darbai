import java.util.ArrayList;

public class MisplacingBox extends Box {
	private ArrayList<Item> st;

	public MisplacingBox() {
		st = new ArrayList<>();
	}

	@Override
	public void add(Item item) {
		st.add(item);

	}

	@Override
	public boolean isInBox(Item item) {

		return false;
	}

}
