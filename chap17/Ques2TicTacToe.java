package chap17;

import java.util.Scanner;

public class Ques2TicTacToe {
	public String win(char game[][]) {
		int i = 0;
		int j = 0;
		while (i < 3 && j < 3) {
			if ((game[i][0] == game[i][1] && game[i][1] == game[i][2])
					|| (game[0][j] == game[1][j] && game[1][j] == game[2][j]))
				return "Someone has won.";

			else {
				i++;
				j++;
			}
		}

		if((game[0][0] == game[1][1] && game[1][1]==game[2][2]) || (game[0][2]==game[1][1] && game[1][1] == game[2][0]))
			return "Someone has won.";
		return "Nobody won.";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char game[][] = new char[3][3];
		System.out.println("*********Lets play tic tac toe**********");
		System.out.println("Enter 'X' or 'O'");
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter your move:");
				game[i][j] = s.next().charAt(0);
			}
		}
		System.out.println("\n\n Your game board:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();
		}
		Ques2TicTacToe obj = new Ques2TicTacToe();
		System.out.println(obj.win(game));
		s.close();

	}

}
