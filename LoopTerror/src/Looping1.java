import java.util.Scanner;

public class Looping1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = 7;
		// checker board
		for (int i = 1; i <= size; i++) {

			if (i % 2 == 0) {
				System.out.print(" ");

			}
			for (int j = 1; j <= size; j++) {

				System.out.print("# ");

			}

			System.out.println();
		}
		// checker board + *
		System.out.println("-----------");
		for (int i = 1; i <= size; i++) {

			if (i % 2 == 0) {
				System.out.print(" ");

			}
			for (int j = 1; j <= size; j++) {
				if (j % 2 == 0) {
					System.out.print("* ");
				} else
					System.out.print("# ");

			}

			System.out.println();
		}
		// Upside Triangle down l<r
		System.out.println("-----------");
		for (int i = 1; i <= size; i++) {

			for (int j = size; j >= i; j--) {

				System.out.print("# ");

			}

			System.out.println();

		}
		// Upside Triangle down l>r
		System.out.println("-----------");
		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("  ");

			}
			for (int j = i; j <= size; j++) {
				System.out.print("# ");
			}
			System.out.println();

		}
		// Triangle down numbers l>r

		System.out.println("-----------");
		for (int i = 1; i <= size; i++) {

			for (int j = i; j >= 1; j--) {

				System.out.print(j + " ");

			}

			System.out.println();
		}
		scan.close();
		// Triangle down numbers l<r

		System.out.println("-----------");
		for (int i = 1; i <= size; i++) {
			for (int j = i; j <= size; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print(" " + j);

			}

			System.out.println();
		}
		scan.close();

		// Timetable 1-9

		System.out.println("-----------");
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= 9; j++) {

				System.out.print(j + "  ");

			}
			System.out.println();
			for (int j = 2; j <= 18; j=j+2) {
				if (j >= 8) {
					System.out.print(j + " ");
				} else
					System.out.print(j + "  ");

			}

			System.out.println();
		}
		scan.close();
		
//		System.out.println("-----------");
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 9; j++) {
//
//				System.out.print(j + "  ");
//
//			}
//			i++;
//			System.out.println();
//			
//		}
//		scan.close();
	}
}
//checker board + *
//for (int i = 1; i <= size; i++) {
//	
//	if (i % 2 == 0) {
//		System.out.print(" ");
//
//	}
//	for (int j = 1; j <= size; j++) {
//		if (j % 2 == 0) {
//			System.out.print("* ");
//		} else System.out.print("# ");
//		
//
//	}
//	
//	System.out.println();
//}