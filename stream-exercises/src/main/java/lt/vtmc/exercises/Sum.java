package lt.vtmc.exercises;

import java.util.List;

public class Sum {

	private Sum() {
	}

	public static int calculate7(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static int calculate(List<Integer> people) {
		return people.stream().mapToInt(p -> p).sum();
	}

}
