package chap3;

import java.util.Scanner;

class ViduStack {
	int maxSize = 5;
	int arr[] = new int[maxSize];
	int top = -1;
	
	public int pop() {
		if (top == -1) {
			System.out.println("ViduStack empty!");
			return 0;
		}

		return arr[top--];
	}

	public void push(int min) {
		if (top >= maxSize - 1)
			System.out.println("ViduStack full.");
		arr[++top] = min;
	}

	public int peek() {
		if (top == -1) {
			return 0;
		}

		return arr[top];
	}
}

public class Ques4TowersOfHanoi {
	public void TOH(int n,ViduStack A,ViduStack B, ViduStack C) {
		
		if(n>0) {
			TOH(n-1,A,C,B);
			int x = A.pop();
			C.push(x);
			TOH(n-1,B,A,C);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques4TowersOfHanoi obj = new Ques4TowersOfHanoi();
		ViduStack ViduStackfrom = new ViduStack();
		ViduStack ViduStackAux = new ViduStack();
		ViduStack ViduStackTo = new ViduStack();
		Scanner s = new Scanner(System.in);
		System.out.println("enter no. of disks");
		int n = s.nextInt();
		for(int i = 0;i<n;i++) {
			ViduStackfrom.push(i);
		}
		obj.TOH(n, ViduStackfrom,ViduStackAux, ViduStackTo);
		System.out.println("ViduStackTo top element:" + ViduStackTo.peek());
		

	}

}
