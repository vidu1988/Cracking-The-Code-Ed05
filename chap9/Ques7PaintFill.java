package chap9;

import java.util.Scanner;

public class Ques7PaintFill {
	
	public boolean paintFill(String[][] Screen, int i, int j, String ncolor) {
		if(Screen[j][i] == ncolor) { 
			return false;
		}
		return paintFill(Screen,i,j,Screen[j][i],ncolor);
	}

	public boolean paintFill(String[][] Screen, int i, int j, String ocolor, String ncolor) {
		if(i<0 || i>=Screen[0].length || j<0 || j>=Screen.length) {
			return false;
		}
		if(Screen[j][i] == ocolor) {
			Screen[j][i] = ncolor;
			paintFill(Screen,i-1,j,ocolor,ncolor); //left
			paintFill(Screen,i+1,j,ocolor,ncolor); //right
			paintFill(Screen,i,j-1,ocolor,ncolor); //top
			paintFill(Screen,i,j+1,ocolor,ncolor); //bottom
			
		}
		return true;
	}

	public static void main(String[] args) {
		Ques7PaintFill obj = new Ques7PaintFill();
		// TODO Auto-generated method stub
		String[][] Screen = new String[10][10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter screen dimensions (nXn):");
		int n = s.nextInt();
		for(int i = 0 ;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.println("Enter color for Screen[" +i + "]["+j+"]" );
				Screen[i][j] = s.next();
			}
		}
		System.out.println("Color of Screen before is:");
		for(int i = 0 ;i<n;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(Screen[i][j] + "\t");
				
			}
			System.out.println();
		}
		System.out.println("Enter the points from where you want to start painting:");
		System.out.println("Enter i:");
		int i = s.nextInt();
		System.out.println("Enter j:");
		int j = s.nextInt();
		System.out.println("Enter new Color:");
		String ncolor= s.next();
		obj.paintFill(Screen, i, j, ncolor);
		
		
		 System.out.println("Color of Screen after is:");
			for(i = 0 ;i<n;i++) {
				for(j = 0;j<n;j++) {
					System.out.print(Screen[i][j] + "\t");
					
				}
				System.out.println();
			}
		
	}

}
