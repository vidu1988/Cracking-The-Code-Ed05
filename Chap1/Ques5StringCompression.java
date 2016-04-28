/* Compresses the string */

package Chap1;

import java.util.*;

public class Ques5StringCompression {
	// O(n2) Method
	/* public void compress(String str) {
		ArrayList<Character> list = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < str.length();) {
			count = 0;
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(i) != str.charAt(j))
					break;
				else
					count++;
			}

			list.add(str.charAt(i));
			list.add(Integer.toString(count).charAt(0));
			i = i + count;
		}
		char[] resultArray = new char[list.size()];
		for (int k = 0; k < list.size(); k++)
			resultArray[k] = list.get(k);
		System.out.println(resultArray);

	} */
	
	 public void compress(String str) {
		 Map<Character, Integer> myMap = new HashMap<>();
		 for(int i = 0; i<str.length()-1;i++) {
			 if(myMap.containsKey(str.charAt(i)) && (str.charAt(i) == str.charAt(i+1)))
					 myMap.put(str.charAt(i), myMap.get(str.charAt(i)) + 1);
			 else
				 myMap.put(str.charAt(i), 1);
				
		 }
		 System.out.println(myMap);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques5StringCompression obj = new Ques5StringCompression();
		obj.compress("aabcccccaaa");

	}

}
