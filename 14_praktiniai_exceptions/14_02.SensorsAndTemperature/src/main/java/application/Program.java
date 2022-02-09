package application;

public class Program {

	public static void main(String[] args) {
		StandardSensor s = new StandardSensor(10);
		s.setOff();
		System.out.println(s.isOn());

	}

}
