import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradesOperations {
	private Scanner sc = new Scanner(System.in);
	private List<Integer> gradeList = new ArrayList<Integer>();
	private List<Integer> passedgradeList = new ArrayList<Integer>();
	private int pointAverage = 0;
	private int pointPassing = 0;
	private String grade0 = "";
	private String grade1 = "";
	private String grade2 = "";
	private String grade3 = "";
	private String grade4 = "";
	private String grade5 = "";

	public GradesOperations() {

	}

	public void enterPoints() {

		System.out.println("Enter point totals, -1 stops:");
		while (true) {
			int grade = Integer.parseInt(sc.nextLine());
			if (grade == -1) {
				break;
			}
			if (grade >= 0 && grade <= 100) {
				gradeList.add(grade);
			}

		}
	}

	public void calculateAverages() {

		for (Integer i : gradeList) {
			pointAverage += i;
			if (i > 49) {
				pointPassing += i;
				passedgradeList.add(i);
			}

		}
	}

	public void calculateGradeDistribution() {
		for (Integer i : gradeList) {
			if (i < 50) {
				grade0 += "*";
			} else if (i < 60) {
				grade1 += "*";
			} else if (i < 70) {
				grade2 += "*";
			} else if (i < 80) {
				grade3 += "*";
			} else if (i < 90) {
				grade4 += "*";
			} else if (i >= 90) {
				grade5 += "*";
			}
		}
	}

	public void printStatistics() {
		System.out.println("Point average (all): " + (double) pointAverage / gradeList.size());
		if (pointPassing == 0) {
			System.out.println("Point average (passing): -");
		} else {
			System.out.println("Point average (passing): " + (double) pointPassing / passedgradeList.size());
		}
		System.out.println("Pass percentage: " + 100.0 * ((double) passedgradeList.size() / gradeList.size()));

		System.out.println("Grade distribution: \n" + "5: " + grade5 + "\n" + "4: " + grade4 + "\n" + "3: " + grade3
				+ "\n" + "2: " + grade2 + "\n" + "1: " + grade1 + "\n" + "0: " + grade0);
	}

}
