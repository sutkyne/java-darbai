package lt.vtmc.praktiniai.users;

import java.util.List;

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
//		users.stream().filter(u-> u.getName().equals(name)).map(u -> u.);
		throw new UnsupportedOperationException("Not implemented");
	}

	public static List<User> sortByAge(List<User> users) {
//		List<User> sortedList = users.stream()
//				.sorted(Comparator.comparingInt(User::getAge))
//				.collect(Collectors.toList());
		throw new UnsupportedOperationException("Not implemented");
	}

	public static User findOldest(List<User> users) {
		Integer integer = users.stream().map(u -> u.getAge()).max(Integer::compare).get();
		User userFake = users.get(0);
		for (User user : users) {
			if (integer == user.getAge()) {
				userFake = user;
			}
		}
		return userFake;
	}

	public static int sumAge(List<User> users) {
//		users.stream().mapToInt(u -> u.getAge()+u.getAge())
		throw new UnsupportedOperationException("Not implemented");
	}

}
