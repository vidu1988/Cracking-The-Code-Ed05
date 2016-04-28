package chap9;

public class Ques5RecursivePermutation {
	public static void permutation(String input) {
		permutation("", input);
	}

	public static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.out.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques5RecursivePermutation obj = new Ques5RecursivePermutation();
		permutation("abc");

	}

}
