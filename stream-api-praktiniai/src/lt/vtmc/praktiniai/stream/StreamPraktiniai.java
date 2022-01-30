package lt.vtmc.praktiniai.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamPraktiniai {

	public static List<Integer> returnSquareRoot(List<Integer> numbers) {
		List<Integer> collect = numbers.stream()
				.map(n -> (int) Math.sqrt(n))
				.collect(Collectors.toList());
		return collect;
	}

	public static List<Integer> getAgeFromUsers(List<User> users) {
		List<Integer> collect = users.stream()
				.map(u -> u.getAge())
				.collect(Collectors.toList());
		return collect;
	}

	public static List<Integer> getDistinctAges(List<User> users) {
		List<Integer> collect = users.stream()
				.map(u -> u.getAge())
				.distinct()
				.collect(Collectors.toList());
		return collect;
	}

	public static List<User> getLimitedUserList(List<User> users, int limit) {
		List<User> collect = users.stream().map(u -> u)
				.limit(limit)
				.collect(Collectors.toList());
		return collect;
	}

	public static Integer countUsersOlderThen25(List<User> users) {
		Integer collect = (int) users.stream()
				.filter(u -> u.getAge() > 25)
				.count();
		return collect;
	}

	public static List<String> mapToUpperCase(List<String> strings) {
		List<String> collect = strings.stream()
				.map(u -> u.toUpperCase())
				.collect(Collectors.toList());
		return collect;
	}

	public static Integer sum(List<Integer> integers) {
		return integers.stream()
				.mapToInt(i -> i)
				.sum();
	}

	public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
		return integers.stream()
				.skip(2)
				.collect(Collectors.toList());
	}

	public static List<String> getFirstNames(List<String> names) {
		return names.stream()
				.map(n -> n.substring(0, n.indexOf(" ")))
				.collect(Collectors.toList());
	}

	public static List<String> getDistinctLetters(List<String> names) {
		return names.stream()
				.map(n -> n.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList());

	}

	public static String separateNamesByComma(List<User> users) {
		return users.stream()
		.map(u -> u.getName().split(", "))
		.flatMap(Arrays::stream)
		.collect(Collectors.joining( ", " ));
	}

	public static double getAverageAge(List<User> users) {
		return users.stream()
				.mapToDouble(u -> u.getAge())
				.average()
				.getAsDouble();
	}

	public static Integer getMaxAge(List<User> users) {
		return users.stream()
				.mapToInt(n ->  n.getAge())
				.max()
				.getAsInt();

	}

	public static Integer getMinAge(List<User> users) {
		return users.stream()
				.mapToInt(n ->  n.getAge())
				.min()
				.getAsInt();
	}

	public static boolean anyMatch(List<User> users, int age) {
			return users.stream()
				.mapToInt(u->u.getAge())
				.anyMatch(u -> u==age);
	}

	public static boolean noneMatch(List<User> users, int age) {
		return users.stream()
				.mapToInt(u->u.getAge())
				.anyMatch(u -> u!=age);
	}

	public static Optional<User> findAny(List<User> users, String name) {
		return users.stream()
				.filter(f-> f.getName().equals(name))
				.findAny();
	}

	public static List<User> sortByAge(List<User> users) {
		return users.stream()
				.sorted(Comparator.comparingInt(User::getAge))
				.collect(Collectors.toList());
	}

	public static Stream<Integer> getBoxedStream(IntStream stream) {
		return stream.boxed();
	}

	public static List<Integer> generateFirst10PrimeNumbers() {
		return IntStream.range(1, 100)
				.filter(StreamPraktiniai::isPrime)
				.limit(10)
				.boxed()
				.collect(Collectors.toList());
	}

	public static boolean isPrime(int number) {
		return number>1 && IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
	}

	public static List<Integer> generate10RandomNumbers() {
		return Stream.generate(new Random()::nextInt)
				.limit(10)
				.collect(Collectors.toList());
	}

	public static User findOldest(List<User> users) {
		int maxAge = users.stream()
				.mapToInt(n ->  n.getAge())
				.max().getAsInt();
		return users.stream()
				.filter(u -> u.getAge()==maxAge)
				.findAny().get();
	}

	public static int sumAge(List<User> users) {
		return users.stream()
				.mapToInt(i -> i.getAge())
				.sum();
	}

	// Pvz.:
	// Java 8 Streams API: Grouping and Partitioning a Stream
	// https://www.javacodegeeks.com/2015/11/java-8-streams-api-grouping-partitioning-stream.html

	public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
		return users.stream().collect(Collectors.partitioningBy(e -> e.isMale()==true));
	}

	public static Map<Integer, List<User>> groupByAge(List<User> users) {
		return users.stream().collect(Collectors.groupingBy(User::getAge));
	}

	public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
		return users.stream().collect(Collectors.partitioningBy(e -> e.isMale()==true, Collectors.groupingBy(User::getAge)));
	}

	public static Map<Boolean, Long> countGender(List<User> users) {
		return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.counting()));
	}

	public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
		return users.stream().collect(Collectors.summarizingInt(u->u.getAge()));
	}

}
