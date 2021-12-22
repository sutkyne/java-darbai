
public class Cat extends Animal implements NoiseCapable{
	public Cat() {
		super("Cat");
	}
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void purr() {
		System.out.println(super.getName()+" purrs");
	}
	@Override
	public void makeNoise() {
		purr();
		
	}
}
