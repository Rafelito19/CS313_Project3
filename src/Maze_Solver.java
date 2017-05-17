
/// this class handles solving the maze


public class Maze_Solver {
	 final static int N = 10;// array size
	private static int nr=0;
	private static int nc=0;
	private static boolean found = false;
	private static int temp [][]=new int [N][N];
	private static int maze [][]=new int [N][N];
	
private static boolean backtrack=false;
	
	public static void solve_maze(int ma [] []){
		
maze = ma;
temp=maze;			
	find_way(0,0,9,9);
	ma=maze;
	
	}
		
private static void find_way(int sr , int sc , int dr ,int dc){

		
		if (sr==dr && sc==dc)
			found = true;
		
		
		else {
			temp [sr][sc]=1;
		
			while (!found &&possible_tomove(sr,sc)){
				if (backtrack==true){
					backtrack=false;
					System.out.println("Stop backtracking");
					
				}
				find_way(nr,nc,dr,dc);
				
			}
			if (backtrack==true) //if we are backtracking print_previous 
			System.out.println(sr+","+sc);
			}
		if (found ){ maze[sr][sc]=2;
		return;
		}
		if (sr==nr&&sc==nc){
			System.out.println("Dead-END  reached");
			System.out.println(">>> Start backtracking from  "+ sr+","+sc);
		backtrack=true;
		}
		System.out.print("Backtracking from "+ sr+","+sc+" to ");
		}
	
	
	
	public static boolean possible_tomove(int sr, int sc){
		
		
		if ((sc<9)&&temp[sr][sc+1]!=1){
			nr=sr;
		nc=sc+1;
		//System.out.println("moving from " +sr+","+sc+ " to "+nr+","+ nc );
			return true;}
		
		
		if (sc>0&&temp[sr][sc-1]!=1){
			
			nr=sr;
			nc=sc-1;
		//	System.out.println("moving from " +sr+","+sc+ " to "+nr+","+ nc );
			return true;
		}
		if (sr<9&&temp[sr+1][sc]!=1){
			
			nr=sr+1;
			nc=sc;
			//System.out.println("moving from " +sr+","+sc+ " to "+nr+","+ nc );
			return true;}
		
		if (sr>0&&temp[sr-1][sc]!=1){
			nr=sr-1;
			nc=sc;
		//	System.out.println("moving from " +sr+","+sc+ " to "+nr+","+ nc );
			return true;
		}
		
	//	if (sr==nr&nc==sc){
		//	System.out.println("Dead-end reached");
			//System.out.println(">>> Start Backtracking from "+sr+","+sc);
			//return false;}
		//when it is not possible to move we backtrack
		//System.out.print(">>> Backtracking from "+ sr+","+sc +" to ");
		return false; 
	}
	
	
	boolean isSafe(int maze[][], int x, int y)
    {
        // if (x,y outside maze) return false
        return (x >= 0 && x < N && y >= 0 &&
                y < N && maze[x][y] == 1);
    }
	
	
	
	
	
	

}
