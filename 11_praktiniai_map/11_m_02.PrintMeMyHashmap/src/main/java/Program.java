

import java.util.HashMap;


public class Program {
	private HashMap<String, String> hshMap = new HashMap<>();

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<>();
		hashmap.put("f.e", "for example");
		hashmap.put("etc.", "and so on");
		hashmap.put("i.e", "more precisely");

		printKeys(hashmap);
		System.out.println("---");
		printKeysWhere(hashmap, "i");
		System.out.println("---");
		printValuesOfKeysWhere(hashmap, ".e");
	}

	public static void printKeys(HashMap<String, String> hm) {
//		for (String key : hm.keySet()) {
//
//            System.out.println(key);

		hm.forEach((k, v) -> System.out.println(k));

	}

	public static void printKeysWhere(HashMap<String, String> hm, String text) {
		for (String key : hm.keySet()) {

			if (key.contains(cleanString(text))) {
				System.out.println(key);
			}

		}

	}

	public static void printValuesOfKeysWhere(HashMap<String, String> hm, String text) {
		for (String key : hm.keySet()) {

			if (key.contains(cleanString(text))) {
				System.out.println(hm.get(key));
			}

		}
	}

	public static String cleanString(String strToClean) {

		if (strToClean == null) {
			return "";
		}

		return strToClean.toLowerCase().trim();

	}
}
