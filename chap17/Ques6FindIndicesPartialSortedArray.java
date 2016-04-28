package chap17;

public class Ques6FindIndicesPartialSortedArray {
	public void findIndices(int arrA[]) {
		int front, rear, index1, index2;
		for (front = 0; front < arrA.length - 1; front++) {
			if (arrA[front] <= arrA[front + 1])
				continue;
			else
				break;
		}
		for (rear = arrA.length - 1; rear > 0; rear--) {
			if (arrA[rear] >= arrA[rear - 1])
				continue;
			else
				break;
		}

		// Find min and max element between front and rear
		int min = arrA[front];
		int max = arrA[front];
		for (int x = front + 1; x <= rear; x++) {
			if (arrA[x] < min)
				min = arrA[x];
			if (arrA[x] > max)
				max = arrA[x];
		}
		for (index1 = 0; index1 < arrA.length; index1++) {
			if (arrA[index1] > min)
				break;
		}
		for (index2 = arrA.length - 1; index2 > 0; index2--) {
			if (arrA[index2] < max)
				break;
		}

		System.out.println("Indices are: " + index1 + " " + index2);

		// Alternate method.
		/*
		 * int i = 0; int j = arrA.length-1; int arrB[] = arrA;
		 * Arrays.sort(arrA); System.out.println("After Sorting:");
		 * while(i<arrA.length) { if(arrA[i] == arrB[i]) i++; else break;
		 * 
		 * }
		 * 
		 * while(j>0) { if(arrA[j] == arrB[j]) j--; else break;
		 * 
		 * } System.out.println("Indices are: " + i + " " + j);
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques6FindIndicesPartialSortedArray obj = new Ques6FindIndicesPartialSortedArray();
		int arr[] = new int[] { 1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19 };
		obj.findIndices(arr);

	}

}
