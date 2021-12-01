
public class EquilateralTriangle extends Shape {
	private double side1;

	public EquilateralTriangle() {
		side1 = 1;

	}

	public EquilateralTriangle(double side) {
		super();
		this.side1 = side;
	}

	public EquilateralTriangle(double side, String color, boolean filled) {
		super(color, filled);
		this.side1 = side;

	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side) {
		this.side1 = side;
	}

	public double getArea() {
		return (Math.sqrt(3) / 4) * Math.pow(side1, 2);
	}

	public double getPerimeter() {
		return 3 * side1;
	}

	@Override
	public String toString() {
		return "an EquilateralTriangle with a side=" + getSide() + "Area=" + getArea() + ", and Perimeter="
				+ getPerimeter() + ", which is a subclass of " + super.toString();
	}

}
