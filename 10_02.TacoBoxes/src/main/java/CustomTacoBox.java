
public class CustomTacoBox implements TacoBox {
	int tacos;

	public CustomTacoBox(int tacos) {
		super();
		this.tacos = tacos;
	}

	@Override
	public int tacosRemaining() {
		// TODO Auto-generated method stub
		return tacos;
	}

	@Override
	public void eat() {
		if (tacos > 0) {
			tacos--;
		}

	}

}
