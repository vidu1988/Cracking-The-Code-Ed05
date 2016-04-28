// Pop, Push, Peek, Minimum element functions of stack in O(1) time.(Using additional stack)
package chap3;

class StackMin extends StackOne {

	public int pop() {
		if (top == -1) {
			System.out.println("Stack having minimums is empty stack");
			return 0;
		}

		return arr[top--];
	}

	public void push(int min) {
		if (top >= maxSize - 1)
			System.out.println("Stack having minimums is full.");
		arr[++top] = min;
	}

	public int peek() {
		if (top == -1) {
			return 0;
		}

		return arr[top];
	}

}

class StackOne {
	int maxSize = 10;
	int arr[] = new int[maxSize];
	int top = -1;
	int min = 0;
	StackMin obj1 = new StackMin();

	public void setMin(int m) {
		obj1.push(m);
	}

	public int getMin() {
		return obj1.peek();
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Pop Operation: Empty Stack");
			return 0;
		}
		if (arr[top] == getMin())
			obj1.pop();
		return arr[top--];
	}

	public void push(int el) {
		if (top >= maxSize - 1)
			System.out.println("Stack Full.");
		// Pushing first element in original and minimum stack
		if (getMin() == 0)
			obj1.push(el);

		if (el < obj1.peek())
			obj1.push(el);

		arr[++top] = el;
		System.out.println("Item " + el + " Pushed");
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Peek Operation: Empty Stack");
			return 0;
		}

		return arr[top];
	}

}

public class Ques2PushPopMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOne obj = new StackOne();

		obj.push(10);
		System.out.println("Min Element: " + obj.getMin());
		obj.push(20);
		System.out.println("Min Element: " + obj.getMin());
		obj.push(3);
		System.out.println("Min Element: " + obj.getMin());
		obj.push(40);
		System.out.println("Min Element: " + obj.getMin());
		System.out.println(obj.peek());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println("Min Element: " + obj.getMin());

	}

}
