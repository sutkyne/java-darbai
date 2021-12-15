
public class TripleTacoBox implements TacoBox {
	int tacos;

	public TripleTacoBox() {
		tacos = 3;
	}

	@Override
	public int tacosRemaining() {

		return tacos;
	}

	@Override
	public void eat() {
		if (tacos > 0) {
			tacos--;
		}

	}

}
