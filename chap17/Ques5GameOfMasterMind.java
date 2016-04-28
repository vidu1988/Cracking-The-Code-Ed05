package chap17;

import java.util.*;

public class Ques5GameOfMasterMind {
	public void findHitsPseudoHits(char[] s, char[] g) {
		int hits = 0;
		int pseudoHits = 0;
		Map<Character, Integer> solMap = new HashMap<>();
		// Populating solution Map
		for (char c : s) {
			if (solMap.containsKey(c))
				solMap.put(c, solMap.get(c) + 1);
			else
				solMap.put(c, 1);
		}
		// Calculating no. of hits & Pseudo hits
		for (int i = 0; i < g.length; i++) {
			if (g[i] == s[i]) {
				hits++;
				solMap.put(g[i], (solMap.get(g[i]) - 1));
			}
			else {
				if (solMap.get(g[i]) > 0) {
					pseudoHits += 1;
					solMap.put(g[i], solMap.get(g[i]) - 1);
				}
			}
		}
		
		System.out.println("Hits: " + hits);
		System.out.println("Pseudo Hits: " + pseudoHits);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques5GameOfMasterMind obj = new Ques5GameOfMasterMind();
		char solution[] = new char[] { 'R', 'G', 'B', 'Y' };
		char guess[]    = new char[] { 'Y', 'G', 'B', 'R' };
		obj.findHitsPseudoHits(solution, guess);
	}
}
