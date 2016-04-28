package chap17;

import java.util.*;

public class Ques12FindAllPairs {
	public List<List<Integer>> findPairs(int arr[], int sum) {
		Map<Integer, Integer> diffMap = new HashMap<>();
		for (int i : arr) {
			if (!(i == sum - i))
				diffMap.put(i, sum - i);
		}
		List<List<Integer>> resultList = new ArrayList<>();
		for (int i : arr) {
			if (diffMap.containsValue(i)) {
				List<Integer> innerList = new ArrayList<>();
				innerList.add(i);
				innerList.add(sum - i);
				resultList.add(innerList);
				diffMap.remove(i, sum - i);
				diffMap.remove(sum - i, i);
			}
		}
		return resultList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques12FindAllPairs obj = new Ques12FindAllPairs();
		int arr[] = new int[] { 1, 6, 5, 2, 3, 4 };
		System.out.println("Pairs of array which sums to given number are : " + obj.findPairs(arr, 8));
	}
}
