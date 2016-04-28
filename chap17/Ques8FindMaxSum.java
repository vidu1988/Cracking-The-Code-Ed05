package chap17;

public class Ques8FindMaxSum {
	public int findMaxSum(int arr[]) {
		int maxSum = 0;
		int tempSum = 0;
		for (int i = 0; i < arr.length; i++) {
			tempSum += arr[i];
			if (tempSum < 0) {
				tempSum = 0;
			}
			if (tempSum > maxSum)
				maxSum = tempSum;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques8FindMaxSum obj = new Ques8FindMaxSum();
		int[] arr = new int[] { 2, -8, 3, -2, 4, -10};
		System.out.println("Max Sum is : " + obj.findMaxSum(arr));

	}

}
