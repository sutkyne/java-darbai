
public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
		
		
		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
		
		Circle c3 = new Circle(2.0, "blue");
		System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());
		Circle c4 = new Circle();
		c4.setRadius(5.0);
		System.out.println("Radius is: "+c4.getRadius());
		c4.setColor("Green");
		System.out.println("Color is: "+c4.getColor());
		Circle c6 = new Circle(5.1);
		System.out.println(c6.toString());
		Circle c7 = new Circle(1.6);
		System.out.println(c7.toString());
		System.out.println(c7);
		System.out.println("Operator plus toString too: "+c7);
	
	
	
	
	
	}
}
