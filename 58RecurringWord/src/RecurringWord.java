
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
    	ArrayList<String> words = new ArrayList<String>();
    	Scanner sc = new Scanner(System.in);
    	while (true) {
    		System.out.print("Type a word: ");
    	
    		String input = sc.nextLine();
    		if (words.contains(input)) {
    			System.out.println("You gave the word "+input+" twice");
    			break;
    		}
    		words.add(input);
    	}
      sc.close();  
    }
}
