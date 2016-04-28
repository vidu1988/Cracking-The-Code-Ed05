// Method to sort an array of Strings so that all anagrams are next to each other.
package chap11;

import java.util.*;

public class Ques2AnagramsNextToEachOther {
	public String sort(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques2AnagramsNextToEachOther obj = new Ques2AnagramsNextToEachOther();
		String[] arr = new String[] { "care", "rate", "star", "acre", "tare", "hello", "race", "vidushi", "rats" };
		System.out.println("Input: ");
		for(String str: arr) {
			System.out.print(str + " ");
		}
		Map<String, LinkedList<String>> hash = new TreeMap<>();
		for (String s : arr) {
			String key = obj.sort(s);
			if (hash.containsKey(key)) {
				LinkedList<String> anagrams = hash.get(key);
				anagrams.add(s);
			} else {
				hash.put(key, new LinkedList());
				hash.get(key).add(s);
			}
		}

		// Display desired output
		System.out.println("\n\nOutput:");
		for (String s : hash.keySet()) {
			LinkedList<String> list = hash.get(s);
			for (String str : list)
				System.out.print(str + " ");
		}

	}

}
