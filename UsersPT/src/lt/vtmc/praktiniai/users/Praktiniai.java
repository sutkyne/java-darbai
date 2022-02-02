package lt.vtmc.praktiniai.users;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Praktiniai {

	public static Integer countUsersOlderThen25(List<User> users) {
		long count = users.stream().filter(u -> u.getAge() > 25).count();
		return (int) count;
	}

	public static double getAverageAge(List<User> users) {
		Double average = users.stream().mapToDouble(a -> a.getAge()).average().getAsDouble();
		return average;
	}

	public static Integer getMinAge(List<User> users) {
		Integer integer = users.stream().map(u -> u.getAge()).min(Integer::compare).get();
		return integer;
	}

	public static User findByName(List<User> users, String name) {

		return users.stream().filter(u -> u.getName().equals(name)).findFirst().orElse(null);
	}

	public static List<User> sortByAge(List<User> users) {
		List<User> sortedList = users.stream().sorted(Comparator.comparingInt(User::getAge))
				.collect(Collectors.toList());
		return sortedList;
	}

	public static User findOldest(List<User> users) {

		return users.stream().max(Comparator.comparingInt(User::getAge)).get();
	}

	public static int sumAge(List<User> users) {
		return users.stream().mapToInt(u -> u.getAge()).sum();

	}

}
