package Chap1;

import java.util.*;

public class Ques7RowColoumnSetToZero {
	public void setToZero(int[][] matrix) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					System.out.println(i + " " + j);
					list.add(i);
					list.add(j);
				}
			}
		}

		set(matrix, list);
	}

	public void set(int[][] arr, ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i += 2) {
			for (int p = 0; p < arr[0].length; p++)
				arr[list.get(i)][p] = 0;
			for (int q = 0; q < arr.length; q++)
				arr[q][list.get(i + 1)] = 0;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques7RowColoumnSetToZero obj = new Ques7RowColoumnSetToZero();
		int matrix[][] = new int[][] { { 1, 0, 3, 5 }, { 1, 5, 6, 8 }, { 7, 8, 9, 9 }, { 1, 0, 12, 13 } };
		System.out.println("Original Matrix");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		obj.setToZero(matrix);
		System.out.println("Modified Matrix");
		System.out.println();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
