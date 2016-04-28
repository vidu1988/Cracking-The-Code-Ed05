package chap9;

import java.util.*;

public class Ques6RecursiveParenthesis {
    public static void main(String[] args) {
    	int n = 3;
        System.out.println("Valid combinations of " + n + " pairs of " +
        "parentheses:");
        ArrayList<String> validParens = generateParens(n);

        for(String parens : validParens)
            System.out.println(parens);
    }
    public static ArrayList<String> generateParens(int n) {
    	ArrayList<String> list = new ArrayList<String>();
        char[] str = new char[2 * n];
        generateParens(list, n, n, str, 0);
        return list;
    }

    public static void generateParens(ArrayList<String> list, int left,
        int right, char[] str, int count) {
        if(left == 0 && right == 0) {
            String parens = new String(str);
            list.add(parens);
            return;
        }

        if(left > 0) {
            str[count] = '(';
            generateParens(list, left - 1, right, str, count + 1);
        }

        if(left < right) {
            str[count] = ')';
            generateParens(list, left, right - 1, str, count + 1);
        }
    }
}
