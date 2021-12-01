
import java.util.ArrayList;

public class TestShapes {

	public static void main(String[] args) {
		ArrayList<Shape> sh = new ArrayList<>();
		Square sq = new Square(2.5, "blue", true);
		sh.add(sq);
		Square sq2 = new Square(2.8, "blue", true);
		sh.add(sq2);
		Circle c = new Circle(5, "yellow", true);
		sh.add(c);
		EquilateralTriangle eqt = new EquilateralTriangle(3.3, "violet", true);
		sh.add(eqt);
		Rectangle r = new Rectangle(2.5, 3.5, "green", false);
		sh.add(r);
		double getAllArea = 0;
		int i = 0;
		for (Shape shape : sh) {
			getAllArea += shape.getArea();
			if (++i == sh.size()) {
				System.out.println(getAllArea);
			}
		}
		for (Shape shape : sh) {
			if (shape instanceof Square) {
				Square s = (Square) shape;
				System.out.println(s.getSide() + "\n");
			}

//			if (shape.getSide() > 0) { // not feng shui
//				System.out.println(shape.getSide());
//			}
		}

	}

}
