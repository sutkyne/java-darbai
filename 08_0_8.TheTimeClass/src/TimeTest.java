
public class TimeTest {

	public static void main(String[] args) {
		Time t=new Time(23,59,59);
		System.out.println(t);
		t.nextSecond();
		System.out.println(t);
		t.nextSecond();
		System.out.println(t);
		t.previousSecond();
		System.out.println(t);
		t.previousSecond();
		System.out.println(t);

	}

}
