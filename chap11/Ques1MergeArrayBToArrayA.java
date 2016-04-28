package chap11;

import java.util.Scanner;

public class Ques1MergeArrayBToArrayA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ques1MergeArrayBToArrayA obj = new Ques1MergeArrayBToArrayA();
		int[] arrA = new int[10];
		int[] arrB = new int[5];
		int i, j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array A in sorted order");
		for (i = 0; i < 5; i++) {
			arrA[i] = s.nextInt();
		}
		System.out.println("Enter Array B in sorted order");
		for (j = 0; j < 5; j++) {
			arrB[j] = s.nextInt();
		}

		int lastIndexA = i - 1;
		int lastIndexB = j - 1;
		int mergedArrayLastIndex = lastIndexA + lastIndexB + 1;

		while (lastIndexA >= 0 && lastIndexB >= 0) {
			if (arrB[lastIndexB] >= arrA[lastIndexA]) {
				arrA[mergedArrayLastIndex] = arrB[lastIndexB];
				mergedArrayLastIndex--;
				lastIndexB--;
			} else {
				arrA[mergedArrayLastIndex] = arrA[lastIndexA];
				mergedArrayLastIndex--;
				lastIndexA--;
			}
		}

		// Copy remaining elements from b into place
		while (lastIndexB >= 0) {
			arrA[mergedArrayLastIndex] = arrB[lastIndexB];
			mergedArrayLastIndex--;
			lastIndexB--;
		}
		System.out.println("sorted array A");
		for (int x : arrA) {
			System.out.print(x + " ");
		}

	}

}
