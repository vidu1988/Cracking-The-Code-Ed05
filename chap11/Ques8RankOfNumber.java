package chap11;

class RankNode {
	public int data;
	public RankNode left;
	public RankNode right;
	public int left_size = 0;

	public RankNode(int d) {
		data = d;
		left = null;
		right = null;
	}

	public void insert(int d) {
		if (d <= data) {
			if (left != null) {
				left.insert(d);
			} else {
				left = new RankNode(d);
			}
			left_size++;
		} else {
			if (right != null) {
				right.insert(d);
			} else {
				right = new RankNode(d);
			}
		}

	}

	public int getRank(int d) {
		if (d == data) {
			return left_size;
		} else if (d < data) {
			if (left == null)
				return -1;
			else
				return left.getRank(d);
		} else {
			int right_rank = (right == null ? -1 : right.getRank(d));
			if (right_rank == -1)
				return -1;
			else
				return left_size + 1 + right_rank;
		}
	}
}

public class Ques8RankOfNumber {

	private static RankNode root = null;

	public static void track(int number) {
		if (root == null) {
			root = new RankNode(number);
		} else {
			root.insert(number);
		}
	}

	public static int getRankOfNumber(int number) {
		return root.getRank(number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		track(5);
		track(1);
		track(4);
		track(4);
		track(5);
		track(9);
		track(7);
		track(13);
		track(3);
		System.out.println("rank of no. 1: " + getRankOfNumber(1));
		System.out.println("rank of no. 3: " + getRankOfNumber(3));
		System.out.println("rank of no. 4: " + getRankOfNumber(4));
	}

}
