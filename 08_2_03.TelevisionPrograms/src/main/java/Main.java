import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// implement here your program that uses the TelevisionProgram class

		ArrayList<TelevibsionProgram> programs = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Name: ");
			String name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}
			System.out.print("Duration: ");
			int duration = Integer.parseInt(scanner.nextLine());
			programs.add(new TelevibsionProgram(name, duration));
		}
		System.out.println("Program's maximum duration? ");
		int maxDuration = scanner.nextInt();
		for (TelevibsionProgram tvProg : programs) {
			if(tvProg.getDuration()<=maxDuration) {
				System.out.println(tvProg);
			}
		}
	}
}
