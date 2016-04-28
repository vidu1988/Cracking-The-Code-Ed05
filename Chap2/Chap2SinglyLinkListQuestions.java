package Chap2;

import java.util.Scanner;

class SinglyNode {
	SinglyNode next = null;
	int data;

	public SinglyNode(int d) {
		data = d;
	}

	public SinglyNode() {

	}

	void createLinkList(SinglyNode start, SinglyNode newNode) {
		SinglyNode temp;
		// SinglyNode newNode = new SinglyNode(d);
		for (temp = start; temp.next != null; temp = temp.next) {

		}

		temp.next = newNode;

	}

	// Prints link list in reverse order
	void printLinkListFromEnd(SinglyNode start) {
		if (start == null)
			return;
		printLinkListFromEnd(start.next);
		System.out.print(start.data + "\t");

	}

	// To detect whether a link list in even or odd
	boolean IsEvenOddd(SinglyNode start) {
		if (start == null) {
			System.out.println("Link list is null");
			return true;
		}

		else {
			while (start != null && start.next != null) {
				start = start.next.next;
			}
			if (start == null) {
				return true;
			} else
				return false;
		}
	}

	// Sol 2.1 Removing Duplicates
	public void removeDuplicate(SinglyNode start) {
		for (SinglyNode first = start; first != null; first = first.next) {
			for (SinglyNode second = first; second != null; second = second.next) {
				if (second.next != null) {
					if (first.data == second.next.data)
						second.next = second.next.next;
				}

				else {
					if (first.data == second.data)
						removeFromTail(start);

				}
			}

		}

	}

	// Sol 2.2 Kth to last Element
	public SinglyNode kthtoLast(SinglyNode head, int k) {
		if (k <= 0)
			return null;
		SinglyNode p1 = head;
		SinglyNode p2 = head;

		for (int i = 0; i < k - 1; i++) {
			if (p2 == null)
				return null;
			p2 = p2.next;
		}
		if (p2 == null)
			return null;
		while (p2.next != null) {
			p2 = p2.next;
			p1 = p1.next;

		}
		return p1;

	}

	public void deleteFromMiddle(SinglyNode nodeToBeDeleted) {
		if (nodeToBeDeleted == null || nodeToBeDeleted.next == null)
			System.out.println("Node does not exist");

		else {
			SinglyNode next = nodeToBeDeleted.next;
			nodeToBeDeleted.data = next.data;
			nodeToBeDeleted.next = next.next;
		}

	}

	public void removeFromTail(SinglyNode begin) {
		SinglyNode temp;
		for (temp = begin; temp.next.next != null; temp = temp.next) {

		}
		temp.next = null;
	}

	public SinglyNode reverseLinkList(SinglyNode start) {
		SinglyNode newNext = null;
		SinglyNode temp = start;
		SinglyNode next;
		while (temp != null) {
			next = temp.next;
			temp.next = newNext;
			newNext = temp;
			temp = next;

		}
		start = newNext;
		return start;

	}

	// Sol: 2.7 Checking whether link list is palindrome or not
	public boolean isPalindrome(SinglyNode head) {

		SinglyNode revHead;
		revHead = reverseLinkList(head);
		SinglyNode start1 = head;
		SinglyNode start2 = revHead;
		while (start1 != null && start2 != null) {
			if (start1.data != start2.data)
				return false;
			start1 = start1.next;
			start2 = start2.next;
		}
		return true;
	}

	public SinglyNode addTwoLinkList(SinglyNode headOne, SinglyNode headTwo, int carry) {
		int sum = 0;
		int x = headOne.data + headTwo.data + carry;
		sum = x % 10;
		carry = x / 10;

		SinglyNode headThree = new SinglyNode(sum);
		SinglyNode temp1 = headOne.next;
		SinglyNode temp2 = headTwo.next;

		while (temp1.next != null && temp2.next != null) {
			x = temp1.data + temp2.data + carry;
			sum = x % 10;
			carry = x / 10;
			SinglyNode newNode = new SinglyNode(sum);
			createLinkList(headThree, newNode);

			temp1 = temp1.next;
			temp2 = temp2.next;

		}
		SinglyNode newNode = new SinglyNode(temp1.data + temp2.data + carry);
		createLinkList(headThree, newNode);

		return headThree;

	}

	// Sol 2.4 Partitioning link list around a value
	public SinglyNode partitionAroundValue(SinglyNode head, float val) {
		SinglyNode smallerHead = null;
		SinglyNode smallerTail = null;
		SinglyNode greaterHead = null;
		SinglyNode greaterTail = null;
		;
		SinglyNode temp = head;
		while (temp != null) {

			if (temp.data < val) {
				// if allocating value (Lesser than the partitioning value) for
				// the first time
				if (smallerHead == null) {
					smallerHead = temp;
					smallerTail = smallerHead;
				} else {
					smallerTail.next = temp;
					smallerTail = smallerTail.next;

				}
			}

			else {
				// if allocating value (Greater than the partitioning value) for
				// the first time
				if (greaterHead == null) {
					greaterHead = temp;
					greaterTail = greaterHead;

				} else {
					greaterTail.next = temp;
					greaterTail = greaterTail.next;
				}
			}

			temp = temp.next;

		} // end of while loop

		// Merging two lists
		if (smallerHead != null && smallerTail != null) {
			smallerTail.next = greaterHead;
			return smallerHead;

		} else
			return greaterHead;

	}

}

public class Chap2SinglyLinkListQuestions {

	public void display(SinglyNode head) {
		for (SinglyNode temp = head; temp != null; temp = temp.next) {
			System.out.print(temp.data);
			if (temp.next != null)
				System.out.print("->");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chap2SinglyLinkListQuestions myObject = new Chap2SinglyLinkListQuestions();
		SinglyNode obj = new SinglyNode();
		SinglyNode head = new SinglyNode(7);
		SinglyNode a = new SinglyNode(1);
		SinglyNode b = new SinglyNode(10);
		SinglyNode c = new SinglyNode(2);
		SinglyNode d = new SinglyNode(3);
		SinglyNode e = new SinglyNode(5);
		SinglyNode f = new SinglyNode(2);
		SinglyNode g = new SinglyNode(10);
		SinglyNode h = new SinglyNode(33);

		obj.createLinkList(head, a);
		obj.createLinkList(head, b);
		obj.createLinkList(head, c);
		obj.createLinkList(head, d);
		obj.createLinkList(head, e);
		obj.createLinkList(head, f);
		obj.createLinkList(head, g);
		obj.createLinkList(head, h);

		System.out.println("****Original Link list****");
		myObject.display(head);
		
		// Printing link list in reverse order.
		System.out.println("\nPrinting link list from end:");
		obj.printLinkListFromEnd(head);

		// To detect whether link list is even or odd.
		System.out.println("\nTo detect whether link list is odd or even:");
		if (obj.IsEvenOddd(head))
			System.out.println("Even");
		else
			System.out.println("Odd");

		// Ques 2.1 Removing duplicates
		obj.removeDuplicate(head);
		System.out.println("\n\nQues 2.1 Link list after removing duplicates");
		myObject.display(head);

		// Ques 2.2 Returning kth to the last element of link list
		Scanner s = new Scanner(System.in);
		System.out.println("\n\nEnter k:");
		int k = s.nextInt();
		System.out.println("\n\nReturning the " + k + "th to the last element of link list");
		SinglyNode element = obj.kthtoLast(head, k);
		System.out.println("The " + k + "th to last element is :" + element.data);

		/*
		 * System.out.println("\n\nReversing Link list "); head =
		 * obj.reverseLinkList(head); myObject.display(head);
		 * 
		 * // Ques 2.3 Deleting an element from the middle of the link list
		 * System.out.println("\n\nQues 2.2 Removing node " + b.data +
		 * " from middle."); obj.deleteFromMiddle(b); myObject.display(head);
		 * 
		 * // Ques 2.4 Splitting link list around value x System.out.println(
		 * "\n\nQues 2.4 Link list before splitting around any value: ");
		 * myObject.display(head); float partitionValue = 2.2f; head =
		 * obj.partitionAroundValue(head, partitionValue); System.out.println(
		 * "\n\nSol 2.4 Link list after splitting around value: " +
		 * partitionValue); myObject.display(head);
		 * 
		 * 
		 * // Ques 2.5: Creating two different link list and adding them to
		 * generate new link list
		 * 
		 * SinglyNode headOne = new SinglyNode(7); SinglyNode aOne = new
		 * SinglyNode(1); SinglyNode bOne = new SinglyNode(6);
		 * obj.createLinkList(headOne, aOne); obj.createLinkList(headOne, bOne);
		 * System.out.println("\nQues 2.5 Adding Two link lists. ");
		 * System.out.println("\n\nFirst Number(In desired Format):");
		 * myObject.display(headOne);
		 * 
		 * SinglyNode headTwo = new SinglyNode(5); SinglyNode aTwo = new
		 * SinglyNode(9); SinglyNode bTwo = new SinglyNode(5);
		 * obj.createLinkList(headTwo, aTwo); obj.createLinkList(headTwo, bTwo);
		 * System.out.println("\n\nSecond Number(In desired Format):");
		 * myObject.display(headTwo);
		 * 
		 * // Adding two link list SinglyNode headThree; headThree =
		 * obj.addTwoLinkList(headOne, headTwo, 0); System.out.println(
		 * "\n\nSol 2.5 Adding first number with second number:");
		 * myObject.display(headThree);
		 * 
		 * 
		 * // Ques 2.7 To check whether the link list is palindrome or not
		 * System.out.println("\n\nQues 2.7 Original list:");
		 * myObject.display(headTwo); if (obj.isPalindrome(headTwo))
		 * System.out.println("\n\nSol 2.7 Yes: Link List is a palindrome");
		 * else System.out.println(
		 * "\n\nSol 2.7 No: Link List is not a palindrome");
		 */

	}

}
