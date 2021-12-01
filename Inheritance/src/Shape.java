
public class Shape {
	private String color;
	private boolean filled;

	public Shape() {
		color = "red";
		filled = true;
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public double getArea() {
		return 0;
	}

	public double getSide() {
		return 0;
	}

	@Override
	public String toString() {
		String answ;
		if (filled == true) {
			answ = "Filled";
		} else {
			answ = "Not Filled";
		}
		return "A Shape with color of " + color + " " + answ;
	}

}
