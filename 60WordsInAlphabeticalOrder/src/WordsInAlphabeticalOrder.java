
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
    	ArrayList<String> words = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Type a word: ");

			String input = sc.nextLine();
			if (input.equals("")) {
				System.out.println("you typed the following words:");
				break;
			}
			words.add(input);
		}
	
		Collections.sort(words);

		for (String string : words) {
			System.out.println(string);
		}
		sc.close();
    }
}
