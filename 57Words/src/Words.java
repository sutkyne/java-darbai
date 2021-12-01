import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
    	ArrayList<String> words = new ArrayList<String>();
    	Scanner sc = new Scanner(System.in);
    	while (true) {
    		System.out.print("Type a word: ");
    	
    		String input = sc.nextLine();
    		if (input.equals("")) {
    			break;
    		}
    		words.add(input);
    	}
    	for (String string : words) {
    		System.out.println(string);
    	}
    }
}
