import java.util.Scanner;

public class Reader {
 private Scanner sc;
public String readString() {
	sc=new Scanner(System.in);
	String reading = sc.nextLine();
	return reading;
}
public int readInteger() {
	sc=new Scanner(System.in);
	int readInt = Integer.parseInt(sc.nextLine());
	return readInt;
}
}
