package lt.vtmc.exercises;

import java.util.ArrayList;
import java.util.List;

public class FlatCollection {

	private FlatCollection() {
	}

	public static List<String> transform7(List<List<String>> collection) {
		List<String> newCollection = new ArrayList<>();
		for (List<String> subCollection : collection) {
			for (String value : subCollection) {
				newCollection.add(value);
			}
		}
		return newCollection;
	}

	public static List<String> transform(List<List<String>> collection) {
		return collection.stream().flatMap(s -> s.stream()).toList();
	}

}
