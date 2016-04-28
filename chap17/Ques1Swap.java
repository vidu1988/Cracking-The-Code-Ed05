package chap17;

public class Ques1Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("Before Swap");
		System.out.println("a : " + a + " , b : " + b);
		b = a + b;
		a = b - a;
		b = b - a;
		System.out.println("After Swap");
		System.out.println("a : " + a + " , b : " + b);

		// Swapping using bit manipulations
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Re-Swap");
		System.out.println("a : " + a + " , b : " + b);

	}
}
