
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	
		int sumNum = 0;
		int numNum = 0;
		
		while (true) {
			System.out.println("Give a number:");
			int number = Integer.parseInt(scanner.nextLine());

			if (number == 0) {
				break;
			}

			if (number > 0 ) {
				sumNum += number;
				numNum++;
			}
		}
		if(sumNum==0) {
			System.out.println("Cannot calculate the average");
		}else System.out.println((double) sumNum / numNum);
		
		scanner.close();
	}
    }

