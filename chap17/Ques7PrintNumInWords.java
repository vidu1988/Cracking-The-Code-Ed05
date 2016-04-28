package chap17;

import java.util.*;

public class Ques7PrintNumInWords {
	public String printNumInWords(int num) {
		String result = "";
		String suffix = "";
		
		Map<Character, String> OnesMap = new HashMap<>();
		OnesMap.put('1', "One");
		OnesMap.put('2', "Two");
		OnesMap.put('3', "Three");
		OnesMap.put('4', "Four");
		OnesMap.put('5', "Five");
		OnesMap.put('6', "Six");
		OnesMap.put('7', "Seven");
		OnesMap.put('8', "Eight");
		OnesMap.put('9', "Nine");
		
		Map<Character, String> TensMap = new HashMap<>();
		TensMap.put('2', "Twenty");
		TensMap.put('3', "Thirty");
		TensMap.put('4', "Forty");
		TensMap.put('5', "Fifty");
		TensMap.put('6', "Sixty");
		TensMap.put('7', "Seventy");
		TensMap.put('8', "Eighty");
		TensMap.put('9', "Ninety");

		Map<Character, String> Tens1Map = new HashMap<>();
		Tens1Map.put('1', "Eleven");
		Tens1Map.put('2', "Twelve");
		Tens1Map.put('3', "Thirteen");
		Tens1Map.put('4', "Fourteen");
		Tens1Map.put('5', "Fifteen");
		Tens1Map.put('6', "Sixteen");
		Tens1Map.put('7', "Seventeen");
		Tens1Map.put('8', "Eighteen");
		Tens1Map.put('9', "Nineteen");

		String strNum = Integer.toString(num);
		for (int i = 0; i < strNum.length(); i++) {
			if (strNum.charAt(i) == '0')
				continue;
			if (i < 2) {
				if (i == 0)
					suffix = "Thousand" + " ";
				if (i == 1)
					suffix = "" + "Hundred" + " ";
				result = result + OnesMap.get(strNum.charAt(i)) + " " + suffix;
			}

			if (i == 2) {

				if (strNum.charAt(i) == '1') {
					result = result + " " + Tens1Map.get(strNum.charAt(i + 1)) + "";
					break;
				} else {
					result = result + " " + TensMap.get(strNum.charAt(i)) + "";
				}
			}
			if (i == 3) {
				result = result + " " + OnesMap.get(strNum.charAt(i)) + "";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques7PrintNumInWords obj = new Ques7PrintNumInWords();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number of 4 digits");
		int num = s.nextInt();
		System.out.println(obj.printNumInWords(num));
		s.close();
	}

}
