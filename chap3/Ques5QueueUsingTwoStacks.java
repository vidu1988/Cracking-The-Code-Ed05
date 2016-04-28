package chap3;

class MyQueue {
	Stack stackNew;
	Stack stackOld;

	public MyQueue() {
		stackNew = new Stack();
		stackOld = new Stack();
	}

	public void addElement(int el) {
		stackNew.push(el);
	}

	public void shiftStack() {
		if (stackOld.isEmpty()) {
			while (!stackNew.isEmpty()) {
				stackOld.push(stackNew.pop());
			}
		}
	}

	public int peek() {
		shiftStack();
		return stackOld.peek();
	}

	public int remove() {
		shiftStack();
		return stackOld.pop();
	}
}

public class Ques5QueueUsingTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue obj = new MyQueue();
		obj.addElement(1);
		obj.addElement(10);
		obj.addElement(45);
		obj.addElement(32);
		obj.addElement(9);
		obj.addElement(23);
		System.out.println("First Element of queue(Peek Operation): " + obj.peek());
		System.out.println("First Element of queue(Remove Operation): " + obj.remove());
		System.out.println("First Element of queue(Peek Operation): " + obj.peek());

	}

}
