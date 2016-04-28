package chap9;

import java.util.*;

public class Ques4RecursiveSubset {
	public ArrayList<ArrayList<Integer>> findSubsets(ArrayList<Integer> set, int index) {
		ArrayList<ArrayList<Integer>> allSubsets;
		if(set.size() == index) {
			allSubsets = new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>()); //empty set
		}
		else {
			allSubsets = findSubsets(set,index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset: allSubsets) {
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(subset);
				newSubset.add(item);
				moreSubsets.add(newSubset);
			}
			allSubsets.addAll(moreSubsets);
		}
		return allSubsets;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques4RecursiveSubset obj = new Ques4RecursiveSubset();
		ArrayList<Integer> set = new ArrayList<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(obj.findSubsets(set,0));
		
		

	}

}
