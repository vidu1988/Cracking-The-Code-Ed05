/* To find whether String 2 is permutation of String 1*/
package Chap1;

import java.util.Arrays;

public class Ques3StringPermutation {
	public boolean isPermutation(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char[] one = str1.toCharArray();
			Arrays.sort(one);
			char[] two = str2.toCharArray();
			Arrays.sort(two);
			if (Arrays.equals(one, two))
				return true;
			else
				return false;
		} else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3StringPermutation obj = new Ques3StringPermutation();
		boolean result = obj.isPermutation("abcd", "dcba");

		if (result)
			System.out.println("Yes! String 2 is permutation of String 1");
		else
			System.out.println("No! String 2 is not permutation of String 1");

	}

}
