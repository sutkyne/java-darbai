import java.util.Scanner;

public class Reader {
 private Scanner sc=new Scanner(System.in);;
public String readString() {
	String reading = sc.nextLine();
	return reading;
}
public int readInteger() {
	int readInt = Integer.parseInt(sc.nextLine());
	return readInt;
}
}
