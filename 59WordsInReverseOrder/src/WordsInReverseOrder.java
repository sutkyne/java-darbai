import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
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
		ArrayList<String> copy = new ArrayList<String>();
		for (int i = words.size() - 1; i >= 0; i--) {
			copy.add((words.get(i)));
		}

		for (String string : copy) {
			System.out.println(string);
		}
    }
}
