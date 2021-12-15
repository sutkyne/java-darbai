
public class Main {

	public static void main(String[] args) {
		BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
		coffeeBox.add(new Item("Saludo", 5));
		coffeeBox.add(new Item("Pirkka", 5));
		coffeeBox.add(new Item("Kopi Luwak", 5));

		System.out.println(coffeeBox.isInBox(new Item("Saludo")));
		System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
		System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
		System.out.println();
		OneItemBox box = new OneItemBox();
		box.add(new Item("Saludo", 5));
		box.add(new Item("Pirkka", 5));

		System.out.println(box.isInBox(new Item("Saludo")));
		System.out.println(box.isInBox(new Item("Pirkka")));
		System.out.println();
		MisplacingBox boxz = new MisplacingBox();
		boxz.add(new Item("Saludo", 5));
		boxz.add(new Item("Pirkka", 5));

		System.out.println(boxz.isInBox(new Item("Saludo")));
		System.out.println(boxz.isInBox(new Item("Pirkka")));
	}
}
