package Chap1;

import java.util.*;

public class Ques4ReplaceSpace {
	public void findReplace(String str) {
		int shift = 0;
		ArrayList<Character> strList = new ArrayList<>();
		char ch[] = str.toCharArray();
		for(char c: ch) {
			strList.add(c);
		}
		//System.out.println(ch);
		//System.out.println(strList);
		for(int i = 0;i<ch.length;i++) {
			if ( ch[i] ==' ') {
				strList.add((i + shift+ 0), '%');
				strList.add((i + shift+ 1), '2');
				strList.add((i + shift+ 2), '0');
				shift = 3;				
				
			}
		}
		System.out.println(strList);
		
		/*for(char c:strList){
			System.out.print(c);
		}*/
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ques4ReplaceSpace obj = new Ques4ReplaceSpace();
		obj.findReplace("Hello Santa Clara");

	}

}
