import java.util.Random;
import java.util.Scanner;

public class Explora {

	public static void main(String[] args) {
		System.out.println("Print");
		printRandomArray(generateRandomArray(10, 0, 9));
		System.out.println();
		System.out.println("-----------------");
//		findArrayMaxElement(generateRandomArray(10, 0, 9));
		System.out.println("-----------------");
//		findArrayMinElementIndex(generateRandomArray(10, 0, 9));
		System.out.println("-----------------");
//		calculateArrayElementsDivBy3(generateRandomArray(10, 0, 9));
		System.out.println("-----------------");
//		swapsArrayElements(generateRandomArray(10, 0, 9));
		System.out.println("-----------------");
		
//		returnsArrayWithoutIndexNumber(generateRandomArray(10, 0, 9));
		System.out.println("-----------------");
//		returnsArrayWithIndexedNumber(generateRandomArray(10, 0, 9));
		System.out.println("-----------------");
		flipsArrayReturnsCopy(generateRandomArray(10, 0, 9));
		System.out.println("-----------------");
		flipsArrayReturnsOriginal(generateRandomArray(10, 0, 9));
		System.out.println("-----------------");
	}

	// 1
	public static int[] generateRandomArray(int size, int min, int max) {
		int[] array = new int[size];
		Random r = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(max - min) + min;
		}
		return array;
	}

	// 2
	public static void printRandomArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// 3
	public static void findArrayMaxElement(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];

			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Highest number of array: " + max);
	}

	// 4
	public static void findArrayMinElementIndex(int[] array) {
		int min = array[0];
		int index = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Lowest number of array is " + min + " at index: " + index);
	}

	// 5
	public static void calculateArrayElementsDivBy3(int[] array) {

		int divBy3 = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 3 == 0) {
				divBy3++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Array contains " + divBy3 + " number(s) that can be divided by 3");
	}

	// 6
	public static void swapsArrayElements(int[] array) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Before swap");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Give two index numbers to swap: ");
		int swap = scanner.nextInt();
		int swapNext = scanner.nextInt();
		int temp = array[swapNext];
		array[swapNext] = array[swap];
		array[swap] = temp;
		System.out.println("After swap");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		scanner.close();
	}

	// 7
	public static void returnsArrayWithoutIndexNumber(int[] array) {
		System.out.println("Before removal");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index to remove number:");
		int index = Integer.parseInt(sc.nextLine());
		
		
		int[] copy = new int[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++) {

			if (i != index) {
				copy[j++] = array[i];
			}
		}
		System.out.println("After removal");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		sc.close();
	}
	//8
	public static void returnsArrayWithIndexedNumber(int[] array) {
		System.out.println("Before adding");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index for number:");
		int index = sc.nextInt();
		System.out.println("Enter number for index:");
		int number = sc.nextInt();
		
		int[] copy = new int[array.length + 1];
		for (int i = 0 ; i < array.length; i++) {

			if (i < index - 1)
                copy[i] = array[i];
            else if (i == index - 1)
                copy[i] =number;
            else
                copy[i] = array[i - 1];
		}
		System.out.println("After adding");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		sc.close();
	}
	//9
	public static void flipsArrayReturnsCopy(int[] array) {
		System.out.println("Original before flip");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	
		
		int[] copy = new int[array.length];
		for (int i = array.length-1, j = 0 ; i >=0; i--) {

                copy[j] = array[i];
                j++;
                
		}
		System.out.println("Copy after flip");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
	}
	//10
	public static void flipsArrayReturnsOriginal(int[] array) {
		System.out.println("Original before flip");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	
		
		int[] copy = new int[array.length];
		for (int i = array.length-1, j = 0 ; i >=0; i--) {

                copy[j] = array[i];
                j++;
                
		}
		for (int i = 0; i < copy.length; i++) {
			array[i]=copy[i];
		}
		System.out.println("Original after flip");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
}
//1. Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą ir užpildo jį
//atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
//public static int[] generateRandomArray(int size, int min, int max)
//2. Parašykite metodą paduoto masyvo elementų spausdinimui.
//3. Duotas sveikųjų skaičių masyvas A[n]. Raskite mažiausią jo elementą
//4. Duotas sveikųjų skaičių masyvas A[n]. Raskite mažiausio jo elemento indeksą
//5. Duotas sveikųjų skaičių masyvas. Parašykite metodą, kuris suskaičiuotų kiek masyve yra
//skaičių, kurie dalinasi iš trijų
//6. Duotas sveikųjų skaičių masyvas A[n]. Parašykite metodą, kuris sukeistų šio masyvo k-tąjį
//elementą su m-tuoju vietomis
//7. Parašykite metodą, kuris pašalintų masyvo A[n] k-tąjį elementą, surašant reikiamus elementus į
//naują masyvą B[n-1]. Atspausdinkite masyvą B[n-1].
//8. Parašykite metodą, kuris įterptų į masyvą A[n] prieš k-tąjį elementą reikšmę X, surašant
//reikiamus elementus į naują masyvą B[n+1]. Atspausdinkite masyvą B[n+1].
//9. Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
//10. Parašykite metodą, kuris apverstu duotą masyvą.