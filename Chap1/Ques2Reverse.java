/* Done in Java*/
package Chap1;

public class Ques2Reverse {
	public String findReverse(String str) {
		int n = str.length();
		char ch[] = str.toCharArray();
		char temp;
		for(int i = 0,j = n-1 ;j> i;i++, j--) {
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			
		}
		return String.valueOf(ch);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques2Reverse obj = new Ques2Reverse();
		System.out.println(obj.findReverse("Hello California!"));

	}

}
