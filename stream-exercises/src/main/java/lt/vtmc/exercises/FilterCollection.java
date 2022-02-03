package lt.vtmc.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {

	private FilterCollection() {
	}

	public static List<String> transform7(List<String> collection) {
		List<String> newCollection = new ArrayList<>();
		for (String element : collection) {
			if (element.length() < 4) {
				newCollection.add(element);
			}
		}
		return newCollection;
	}

	public static List<String> transform(List<String> collection) {
		return collection.stream().filter(s -> s.length() < 4).toList();
	}

}
