
public class MainProgram {

    public static void main(String[] args) {
    	Money a = new Money(-10, 250);
    	Money b = new Money(30, 50);

    	Money c = a.minus(b);

    	System.out.println(a);  // 10.00e
    	System.out.println(b);  // 3.50e
    	System.out.println(c);  // 6.50e

    	c = c.minus(a);       


    	System.out.println(a);  // 10.00e
    	System.out.println(b);  // 3.50e
    	System.out.println(c);  // 0.00e
//    	Money a = new Money(1, 0);
//    	Money b = new Money(1, 50);
//    	Money c = new Money(5, 0);
//
//
//    	System.out.println(a.lessThan(b));  // false
//    	System.out.println(b.lessThan(c));  // true

    }
}
