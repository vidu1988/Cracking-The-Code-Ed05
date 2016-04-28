/* Checks whether one string is rotation of another string */
package Chap1;

public class Ques8StringRotation {
	public void isStringsRotative(String s1, String s2) {
		if (s1.length() == s2.length()) {
			String s3 = s1 + s1;
			if (isSubString(s3, s2)) {
				System.out.println("Yes: " + s2 + " is rotation of  " + s1);
				return;

			}
		}

		System.out.println("No: " + s2 + " is not rotation of  " + s1);

	}

	public boolean isSubString(String one, String two) {
		if (one.contains(two))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques8StringRotation obj = new Ques8StringRotation();
		String str1 = "erbottlewat";
		String str2 = "waterbottle";
		obj.isStringsRotative(str1, str2);

	}

}
