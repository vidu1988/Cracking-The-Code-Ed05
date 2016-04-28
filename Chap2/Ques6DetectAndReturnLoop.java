/* Ques 2.6 Detects loop in link list and returns the node which starts the loop.*/
package Chap2;

class Node {
	Node next = null;
	int data;

	public Node(int d) {
		data = d;
	}

	public Node() {

	}

	void createLinkList(Node start, Node newNode) {
		Node temp;

		for (temp = start; temp.next != null; temp = temp.next) {

		}

		temp.next = newNode;

	}

	public Node returnLoopBeginningNode(Node head) {
		Node slow, fast;
		slow = fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow)
				break;

		}
		if (fast == null || fast.next == null)
			return null;
		else {
			slow = head;
			while (slow != fast) {
				slow = slow.next;
				fast = fast.next;

			}
			return fast;
		}

	}

}

// This methods detects loop in link list
public class Ques6DetectAndReturnLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node obj = new Node();
		Node head = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(6);

		obj.createLinkList(head, a);
		obj.createLinkList(head, b);
		obj.createLinkList(head, c);
		obj.createLinkList(head, d);
		obj.createLinkList(head, e);

		e.next = b;

		if (obj.returnLoopBeginningNode(head) != null) {
			System.out.println("Yes. Link list has loop,and the node which begins the loop is :"
					+ obj.returnLoopBeginningNode(head).data);
		}
		else
			System.out.println("No. Link list has no loop");

	}

}
