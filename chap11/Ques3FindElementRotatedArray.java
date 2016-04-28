package chap11;

import java.util.Scanner;

public class Ques3FindElementRotatedArray {
	public int findElement(int[] arr, int left, int right, int element) {
		if (right < left)
			return -1;
		int mid = (left + right) / 2;
		if (arr[mid] == element) {
			return mid;
		}

		if (arr[left] < arr[mid]) {
			// If left part is sorted, search here first
			if (element >= arr[left] && element <= arr[mid]) {
				return findElement(arr, left, mid - 1, element);
			} else {
				return findElement(arr, mid + 1, right, element);
			}
		} else if (arr[left] > arr[mid]) {
			// If right part is sorted, search here first
			if (element <= arr[right] && element >= arr[mid]) {
				return findElement(arr, mid + 1, right, element);
			} else {
				return findElement(arr, left, mid - 1, element);
			}
		} else if (arr[left] == arr[mid]) {
			if (arr[mid] != arr[right]) {
				return findElement(arr, mid + 1, right, element);
			} else {
				int result = findElement(arr, left, mid - 1, element);
				if (result == -1) {
					return findElement(arr, mid + 1, right, element);
				} else {
					return result;
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3FindElementRotatedArray obj = new Ques3FindElementRotatedArray();
		int arr[] = new int[] { 15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14 };
		System.out.println("Enter element to search");
		Scanner s = new Scanner(System.in);
		int element = s.nextInt();
		int result = obj.findElement(arr, 0, arr.length - 1, element);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + result);
		}

	}

}
