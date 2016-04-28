//Search element in MXN matrix where each rows and cols are arranged in ascending order.
package chap11;

import java.util.*;

public class Ques6FindElementInMatrixAscendingRowsCols {
	public boolean search(int[][] arr, int element) {
		if (arr == null) {
			return false;
		}
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if (arr[row][col] == element) {
				System.out.println("Element found at index matrix [" + row + "][" + col + "]");
				return true;
			} else if (arr[row][col] > element) {
				col--;
			} else if (arr[row][col] < element) {
				row++;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques6FindElementInMatrixAscendingRowsCols obj = new Ques6FindElementInMatrixAscendingRowsCols();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Rows");
		int rows = s.nextInt();
		System.out.println("Enter Columns");
		int cols = s.nextInt();
		int[][] matrix = new int[rows][cols];
		System.out.println("Populate Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter element matrix [" + i + "][" + j + "]");
				matrix[i][j] = s.nextInt();
			}
		}
		System.out.println("Input Matrix: \n");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Enter element to be searched");
		int element = s.nextInt();
		boolean result = obj.search(matrix, element);
		if (result == false) {
			System.out.println("Element not found !");
		} else {
			System.out.println("Element found !");
		}
	}

}
