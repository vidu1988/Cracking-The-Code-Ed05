/* Counting trailing zeros in factorial of a number. */

package chap17;

import java.util.Scanner;

public class Ques3FactorialTrailingZeros {
	public int countTrailingZeros(int num) {
		int count = 0;
		int denominator = 5;
		int i = 1;
		while (num / denominator > 0) {
			count = count + Math.abs(num / denominator);
			i += 1;
			denominator = (int) Math.pow(5, i);
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3FactorialTrailingZeros obj = new Ques3FactorialTrailingZeros();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = s.nextInt();
		System.out.println("Count of trailing zeros in " + num + " is : " + obj.countTrailingZeros(num));
		s.close();
	}

}
