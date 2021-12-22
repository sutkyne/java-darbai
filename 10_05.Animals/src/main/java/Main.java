
public class Main {

    public static void main(String[] args) {
    	Dog dog = new Dog();
    	dog.bark();
    	dog.eat();

    	Dog fido = new Dog("Fido");
    	fido.bark();
    	Cat cat = new Cat();
    	cat.purr();
    	cat.eat();

    	Cat garfield = new Cat("Garfield");
    	garfield.purr();
    	
    	NoiseCapable dogee = new Dog();
    	dogee.makeNoise();

    	NoiseCapable catee = new Cat("Garfield");
    	catee.makeNoise();
    	Cat c = (Cat) catee;
    	c.purr();

    }

}
