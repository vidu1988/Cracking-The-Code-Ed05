package chap11;

import java.util.Scanner;

public class Ques5FindStringInterpersedEmptyString {
	public int findString(String[] str, int first, int last, String searchStr) {
		if (str == null || searchStr == "" || searchStr == null) {
			return -1;
		}
		if (first > last) {
			return -1;
		}
		int mid = (first + last) / 2;

		if (str[mid].isEmpty()) {
			int left = mid - 1;
			int right = mid + 1;
			while (true) {
				if (left < first && right > last) {
					return -1;
				}
				if (!str[left].isEmpty() && left >= first) {
					mid = left;
					break;
				}
				if (!str[right].isEmpty() && right <= last) {
					mid = right;
					break;
				}
				left--;
				right++;

			}
		}
		if (str[mid].equals(searchStr)) {
			return mid;
		}

		else if (str[mid].compareTo(searchStr) < 0) {
			return findString(str, mid + 1, last, searchStr);
		}

		else {
			return findString(str, first, mid - 1, searchStr);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques5FindStringInterpersedEmptyString obj = new Ques5FindStringInterpersedEmptyString();
		System.out.println("Enter String to search");
		String[] arr = new String[] {"at","","","","ball","","","car", "", "", "dad", "","" };
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int result = obj.findString(arr, 0, arr.length - 1, str);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + result);
		}

	}

}
