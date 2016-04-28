package chap9;

import java.util.*;


class Point{
	int i;
	int j;
	public Point(int x,int y) {
		i = x;
		j = y;
	}
	public int getX() {
		return i;
	}
	public int getY() {
		return j;
	}
}

public class Ques2RecursiveRobotPath {
	public boolean grid[][] = new boolean[10][10];
	Scanner s = new Scanner(System.in);
	public void setGrid(int r,int c) {
		System.out.println("Setting limits to each cell of grid");
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				System.out.println("Enter true/false for cell["+i+"]["+j+"]");
				grid[i][j] = s.nextBoolean();
			}
		}
	}
	
	public void showGrid(int r,int c) {
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				System.out.print(grid[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	public boolean getPath(int x,int y,ArrayList<Point> path, HashMap<Point,Boolean> cache) {
		Point p = new Point(x,y);
		if(cache.containsKey(p)) { //Already visited that cell
			return cache.get(p);
		}
		if(x==0 && y ==0 ){
			return true;
		}
		boolean success = false;
		if(x>=1 && grid[x-1][y] == true) {
			success = getPath(x-1,y,path,cache);
		}
		if(!success && y >=1 && grid[x][y-1]) {
			success = getPath(x,y-1,path,cache);
		}
		if(success) {
			path.add(p);
		}
		cache.put(p, success);
		return success;
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques2RecursiveRobotPath obj = new Ques2RecursiveRobotPath();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of grid: ");
		System.out.println("Enter Rows:");
		int r = s.nextInt();
		System.out.println("Enter Columns:");
		int c = s.nextInt();
		obj.setGrid(r,c);
		
		System.out.println("The grid with permission is as follows:");
		obj.showGrid(r,c);
		
		ArrayList<Point> path = new ArrayList<>();
		HashMap<Point,Boolean> cache = new HashMap<>();
		obj.getPath(r-1,c-1,path,cache);
		System.out.println("the path is as follows:");
		for(int i = 0;i<path.size();i++) {
			System.out.print("\n("+path.get(i).getX() +"," +path.get(i).getY() +")");
		}

	}

}
