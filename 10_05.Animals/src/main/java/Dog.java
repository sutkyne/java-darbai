
public class Dog extends Animal implements NoiseCapable{
	public Dog() {
		super("Dog");
	}

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public void bark() {
		System.out.println(super.getName()+" barks");
	}

	@Override
	public void makeNoise() {
		bark();
		
	}
}
