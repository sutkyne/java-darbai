import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
	private HashMap<String, ArrayList<String>> hMap;

	public DictionaryOfManyTranslations() {
		hMap = new HashMap<>();
	}

	public void add(String word, String translation) {
		ArrayList<String> translationsList = hMap.get(word);
		// if list does not exist create it
		if (translationsList == null) {
			translationsList = new ArrayList<String>();
			translationsList.add(translation);
			hMap.put(word, translationsList);
		} else {
			// add if translation is not already in list
			if (!translationsList.contains(translation))
				translationsList.add(translation);
		}
	}

	public ArrayList<String> translate(String word) {
		return null;

	}

	public void remove(String word) {

	}
}
