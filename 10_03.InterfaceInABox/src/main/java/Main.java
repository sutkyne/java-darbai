
public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
		Book book2 = new Book("Robert Martin", "Clean Code", 1);
		Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

		CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
		CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
		CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(cd1);
		System.out.println(cd2);
		System.out.println(cd3);
		Box bx = new Box(20);
		bx.add(new Book("Fyodor Dostoevsky", "Crime and Punishment\n", 2));
		bx.add(new Book("Fyodo Dostoevsky", "Crime and Punishment", 2));
		bx.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
		bx.add(new Book("Fyodor Dostoevsk", "Crime and Punishment", 2));

		bx.add(new CD("Pink Floy", "Dark Side of the Moon", 1973));
		bx.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
		bx.add(new CD("Pin Floyd", "Dark Side of the Moon", 1973));
		Box bxx = new Box(200);
		bxx.add(bx);
		System.out.println(bx);

	}

}
