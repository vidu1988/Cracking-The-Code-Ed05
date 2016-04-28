// Sorted array of distinct elements
package chap9;

public class Ques3MagicIndex {
	public int findIndex(int arr[], int start, int end) {
		if (end < start || start < 0 || end > arr.length) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (arr[mid] == mid) {
			return mid;
		}
		if (arr[mid] > mid) {
			return findIndex(arr, 0, mid - 1);

		} else
			return findIndex(arr, mid + 1, end);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3MagicIndex obj = new Ques3MagicIndex();
		int arr[] = new int[] { -40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13 };
		System.out.println("The magic index is: " + obj.findIndex(arr, 0, arr.length));
	}

}
