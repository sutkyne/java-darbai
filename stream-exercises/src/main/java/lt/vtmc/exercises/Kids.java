package lt.vtmc.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Kids {

	public static Set<String> getKidNames7(List<Person> people) {
		Set<String> kids = new HashSet<>();
		for (Person person : people) {
			if (person.getAge() < 18) {
				kids.add(person.getName());
			}
		}
		return kids;
	}

	public static Set<String> getKidNames(List<Person> people) {
		return people.stream().filter(p -> p.getAge() < 18).map(p -> p.getName()).collect(Collectors.toSet());
	}

}
