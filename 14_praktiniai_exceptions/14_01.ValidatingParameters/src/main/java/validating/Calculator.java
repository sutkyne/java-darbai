package validating;

public class Calculator {

	public int factorial(int num) throws IllegalArgumentException {
		if (num < 0) {
			throw new IllegalArgumentException();
		} else {
			int answer = 1;
			for (int i = 1; i <= num; i++) {
				answer *= i;
			}

			return answer;
		}
	}

	public int binomialCoefficent(int setSize, int subsetSize) {
		if (setSize < 0 || subsetSize < 0 || subsetSize > setSize) {
			throw new IllegalArgumentException();
		} else {
			int numerator = factorial(setSize);
			int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

			return numerator / denominator;
		}
	}
}
