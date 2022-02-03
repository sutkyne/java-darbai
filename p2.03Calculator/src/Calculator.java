
public class Calculator {
	private Reader reader;
	private int track=0;

	public Calculator() {
		reader = new Reader();
	}

	public void start() {

		while (true) {
			System.out.print("command: ");
			String command = reader.readString();
			if (command.equals("end")) {
				break;
			}
			if (command.equals("sum")) {
				sum();
			} else if (command.equals("difference")) {
				difference();
			} else if (command.equals("product")) {
				product();
			}
		}
		statistics();
	}

	private void sum() {
		System.out.print("value1: ");
		int red1 = reader.readInteger();
		System.out.print("alue2: ");
		int red2 = reader.readInteger();
		System.out.println("sum of the values " + (red1 + red2));
		track++;
	}

	private void difference() {
		System.out.print("value1: ");
		int red1 = reader.readInteger();
		System.out.print("value2: ");
		int red2 = reader.readInteger();
		System.out.println("difference of the values " + (red1 - red2));
		track++;
	}

	private void product() {
		System.out.print("value1: ");
		int red1 = reader.readInteger();
		System.out.print("value2: ");
		int red2 = reader.readInteger();
		System.out.println("product of the values " + (red1 * red2));
		track++;
	}

	private void statistics() {
		System.out.print("Calculations done "+track);
	}
}
