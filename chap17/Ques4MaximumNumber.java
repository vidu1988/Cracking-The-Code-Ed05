package chap17;

import java.util.Scanner;

public class Ques4MaximumNumber {

	public int findMaxNumber(int a, int b) {
		int p = (a - b) >> 31 & 1;
		return a - p * (a - b);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = s.nextInt();
		System.out.println("Enter second number:");
		int b = s.nextInt();
		Ques4MaximumNumber obj = new Ques4MaximumNumber();
		System.out.println("Two numbers are: " + a + " " + b);
		System.out.println("Maximum number is : " + obj.findMaxNumber(a, b));
		s.close();

	}

}
