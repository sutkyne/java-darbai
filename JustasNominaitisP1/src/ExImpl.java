import java.util.ArrayList;
import java.util.List;

import lt.vtmc.praktinis.Exercises;
import lt.vtmc.praktinis.Point;

public class ExImpl implements Exercises {

	@Override
	public List<Integer> addToListNumbersUpTo(int arg0) {
		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 1; i < arg0; i++) {
			intList.add(i);
		}

		return intList;
	}

	@Override
	public double averageOf(int arg0, int arg1, int arg2) {
		double avg = (arg0 + arg1 + arg2) / 3;
		return avg;
	}

	@Override
	public int computeSumOfNumbers(int arg0) {
		int integer = 0;
		for (int i = 1; i <= arg0; i++) {
			integer += i;
		}
		return integer;
	}

	@Override
	public int countNumbersInRangeDevisibleBy(int arg0, int arg1, int arg2) {
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intListDivisableByDivisor = new ArrayList<Integer>();
		for (int i = arg0; i <= arg1; i++) {
			intList.add(i);
		}
		for (Integer integer : intList) {

			if (integer % arg2 == 0) {
				intListDivisableByDivisor.add(integer);
			}
		}
		return intListDivisableByDivisor.size();
	}

	@Override
	public int findLargest(int[] arg0) {

		int integer = arg0[0];
		for (int i = 0; i < arg0.length; i++) {
			if (integer < arg0[i]) {
				integer = arg0[i];
			}
		}

		return integer;
	}

	@Override
	public Integer findSmallest(List<Integer> arg0) {
		Integer smallest = arg0.get(0);
		for (Integer integer : arg0) {

			if (integer < smallest) {
				smallest = integer;
			}
		}
		return smallest;
	}

	@Override
	public boolean isEqual(Object arg0, Object arg1) {

		return arg0.equals(arg1);
	}

	@Override
	public boolean isSameObject(Object arg0, Object arg1) {

		return arg0 == arg1;
	}

	@Override
	public int numberOfDays(String arg0, int arg1) {
		int day = 0;
		switch (arg0) {
		case "January":
			day = 31;
			break;
		case "February":
			if (arg1 % 4 == 0 && (arg1 % 100 != 0 || arg1 % 400 == 0)) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		case "March":
			day = 31;
			break;
		case "April":
			day = 30;
			break;
		case "May":
			day = 31;
			break;
		case "June":
			day = 30;
			break;
		case "July":
			day = 31;
			break;
		case "August":
			day = 30;
			break;
		case "September":
			day = 31;
			break;
		case "October":
			day = 30;
			break;
		case "November":
			day = 31;
			break;
		case "December":
			day = 30;
			break;

		}
		return day;
	}

	@Override
	public int taskuSkaicius(Point arg0) {
		double c = Math.sqrt((arg0.getX() * arg0.getX()) + (arg0.getY() * arg0.getY()));
		if ((int) c > 10.0) {
			return 0;
		} else if ((int) c >= 6.0 && (int) c <= 10.0) {
			return 5;
		} else {
			return 10;
		}

	}

	@Override
	public int taskuSkaicius(List<Point> arg0) {
		int pointCount = 0;
		for (Point point : arg0) {
			double c = Math.sqrt((point.getX() * point.getX()) + (point.getY() * point.getY()));
			if ((int) c > 10.0) {
				pointCount += 0;
			} else if ((int) c >= 6.0 && (int) c <= 10.0) {
				pointCount += 5;
			} else {
				pointCount += 10;
			}

		}
		return pointCount;
	}

}
