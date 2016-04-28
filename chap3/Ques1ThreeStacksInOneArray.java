package chap3;

import java.util.Scanner;

public class Ques1ThreeStacksInOneArray {
	int stackSize = 100;
	Integer buffer[] = new Integer[stackSize * 3];
	Integer stackTop[] = new Integer[] { -1, -1, -1 };

	public void push(int element, int stackNum) {
		if (stackTop[stackNum] + 1 >= stackSize) {
			System.out.println("Stack " + stackNum + " Full!");
		} else {
			stackTop[stackNum]++;
			buffer[absTopOfStack(stackNum)] = element;
			System.out.println("Item Pushed in stack " + stackNum);

		}

	}

	public int absTopOfStack(int stackNum) {
		return stackNum * stackSize + stackTop[stackNum];
	}

	public int pop(int stackNum) {
		if (stackTop[stackNum] == -1) {
			System.out.println("Stack Empty");
			return 0;
		} else {
			int value = buffer[absTopOfStack(stackNum)];
			buffer[absTopOfStack(stackNum)] = 0;
			stackTop[stackNum]--;
			return value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques1ThreeStacksInOneArray obj = new Ques1ThreeStacksInOneArray();
		System.out.println("Enter stack number(0,1,2)");
		Scanner s = new Scanner(System.in);
		int stackNum = s.nextInt();
		obj.push(0, stackNum);
		obj.push(1, stackNum);
		obj.push(2, stackNum);
		obj.push(3, stackNum);
		obj.push(4, stackNum);
		obj.push(5, stackNum);
		System.out.println("Enter stack number(0,1,2)");
		stackNum = s.nextInt();
		obj.push(0, stackNum);
		obj.push(1, stackNum);
		obj.push(2, stackNum);
		System.out.println("Enter stack number(0,1,2)");
		stackNum = s.nextInt();
		obj.push(0, stackNum);
		obj.push(1, stackNum);
		obj.push(2, stackNum);
		obj.push(3, stackNum);
		obj.push(4, stackNum);
		obj.push(5, stackNum);
		obj.push(6, stackNum);
		obj.push(7, stackNum);
		obj.push(8, stackNum);
		System.out.println("Enter stack number to pop element:");
		stackNum = s.nextInt();
		System.out.println("Item popped from stack " + stackNum + " is:" + obj.pop(stackNum));
		stackNum = s.nextInt();
		System.out.println("Item popped from stack " + stackNum + " is:" + obj.pop(stackNum));
		stackNum = s.nextInt();
		System.out.println("Item popped from stack " + stackNum + " is:" + obj.pop(stackNum));

	}

}
