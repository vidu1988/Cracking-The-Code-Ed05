//Assumption: Each stack can hold only 5 items.
package chap3;

import java.util.*;

class Stack {

	int maxSize = 100;
	int arr[] = new int[maxSize];
	int top = -1;
	
	public void showStack() {
		for(int i = 0;i<6;i++) {
			System.out.print(arr[i]+ "\t");
		}
	}

	public boolean isFull() {
		if (top == maxSize - 1)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public int pop() {

		return arr[top--];
	}

	public void push(int v) {
		if (isFull())
			System.out.println("Stack Full.");
		arr[++top] = v;
	}
	public int peek() {
		if (top == -1) {
			System.out.println("Peek Operation: Empty Stack");
			return 0;
		}

		return arr[top];
	}

}

public class Ques3SetOfStacks {

	ArrayList<Stack> stackList = new ArrayList<>();

	public int stackNumber() {
		return stackList.size();
	}

	public Stack getLastStack() {
		if (stackList.size() == 0)
			return null;
		else
			return stackList.get(stackList.size() - 1);
	}

	public void push(int v) {
		Stack last = getLastStack();
		if (last != null && !last.isFull()) {
			System.out.println("Item pushed in Stack " + stackNumber());
			last.push(v);

		} else {
			Stack newStack = new Stack();
			stackList.add(newStack);
			System.out.println("Item pushed in Stack " + stackNumber());
			newStack.push(v);
		}

	}

	public int pop() {

		Stack last = getLastStack();
		if (last == null)
			return 0;

		// System.out.println("Item popped from Stack " + stackNumber());
		return last.pop();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3SetOfStacks obj = new Ques3SetOfStacks();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(8);
		obj.push(9);
		obj.push(10);
		obj.push(11);
		System.out.println(obj.pop());
		System.out.println(obj.pop());

	}

}
