/* Sort a stack in ascending order. (Using only 1 additional stack) */
package chap3;

public class Ques6SortStackAscending {
	public void sort(Stack stackUnsorted, Stack stackSorted) {
		while (!stackUnsorted.isEmpty()) {
			int temp = stackUnsorted.pop();
			while (!stackSorted.isEmpty() && stackSorted.peek() > temp) {
				stackUnsorted.push(stackSorted.pop());
			}
			stackSorted.push(temp);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques6SortStackAscending obj = new Ques6SortStackAscending();
		Stack stackUnsorted = new Stack();
		Stack stackSorted = new Stack();
		stackUnsorted.push(10);
		stackUnsorted.push(1);
		stackUnsorted.push(110);
		stackUnsorted.push(12);
		stackUnsorted.push(9);
		stackUnsorted.push(32);
		System.out.println("Unsorted stack:");
		stackUnsorted.showStack();
		obj.sort(stackUnsorted, stackSorted);
		System.out.println("\nSorted stack:");
		stackSorted.showStack();

	}

}
