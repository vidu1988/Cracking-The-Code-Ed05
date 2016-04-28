// Finding whether string contains duplicates characters or not
package Chap1;

import java.util.*;

public class Ques1UniqueCharacters {

	public boolean findUniquenessWithNoDataStructure(String str) {
		if (str.length() > 256) {
			return false;
		}
		boolean arr[] = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (arr[val]) {
				return false;
			} else {
				arr[val] = true;
			}
		}
		return true;
	}

	public boolean findUniquenessWithMap(String str) {
		Map<Integer, Character> myMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a' + 1;
			if (myMap.containsKey(index))
				return false;
			myMap.put(index, str.charAt(i));

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques1UniqueCharacters obj = new Ques1UniqueCharacters();
		/* Invoking time efficient but space inefficient method */
		if (obj.findUniquenessWithMap("Vidushi"))
			System.out.println("No Duplicates in String");
		else
			System.out.println("Duplicates in String");

		/* Invoking space efficient but time inefficient method */
		if (obj.findUniquenessWithNoDataStructure("Vidu"))
			System.out.println("No Duplicates in String");
		else
			System.out.println("Duplicates in String");

	}

}
