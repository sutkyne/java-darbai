import java.util.ArrayList;

public class Variance {
	// Copy here sum from exercise 63
	public static int sum(ArrayList<Integer> list) {
		int suma = 0;
		for (Integer integer : list) {
			suma += integer;
		}
		return suma;
	}

	// Copy here average from exercise 64
	public static double average(ArrayList<Integer> list) {
		double mean = 0.0;
		double suma = sum(list);
		mean = suma / list.size();
		return mean;
	}

	public static double variance(ArrayList<Integer> list) {
		double avg = average(list);
		double varBuff = 0.0;
		double varRez;
		for (int i : list) {
			varBuff += Math.pow((i - avg), 2);
		}
		varRez = varBuff / (list.size() - 1);
		return varRez;
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);

		System.out.println("The variance is: " + variance(list));
	}

}
