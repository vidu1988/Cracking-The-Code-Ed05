package chap9;

import java.util.Scanner;

public class Ques1CountSteps {
	private static Scanner s;

	public int count(int n) {
		if(n<0){
			return 0;
		}
		else if(n==0) {
			return 1;
		}
		else
		{
			return count(n-1) + count(n-2) + count(n-3);
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques1CountSteps obj = new Ques1CountSteps();
		s = new Scanner(System.in);
		System.out.println("Enter Number of steps:");
		int n = s.nextInt();
		System.out.println("Total no. of ways a child can run up stairs are: " + obj.count(n));

	}

}
