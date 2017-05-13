import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project3 {

	
	static int [][] maze = 
		{ {1,1,1,1,1,1,1,1,1,1,1,1,1},
		  {1,0,1,0,1,0,1,0,0,0,0,0,1},
		  {1,0,1,0,0,0,1,0,1,1,1,0,1},
		  {1,0,0,0,1,1,1,0,0,0,0,0,1},
		  {1,0,1,0,0,0,0,0,1,1,1,0,1},
		  {1,0,1,0,1,1,1,0,1,0,0,0,1},
		  {1,0,1,0,1,0,0,0,1,1,1,0,1},
		  {1,0,1,0,1,1,1,0,1,0,1,0,1},
		  {1,0,0,0,0,0,0,0,0,0,1,0,1},
		  {1,1,1,1,1,1,1,1,1,1,1,1,1}

		};
	public static void main (String []  args)
	
	{
	 String FILENAME = "input.txt";



			BufferedReader br = null;
			FileReader fr = null;

			try {

				fr = new FileReader(FILENAME);
				br = new BufferedReader(fr);

				String sCurrentLine;

				br = new BufferedReader(new FileReader(FILENAME));

				while ((sCurrentLine = br.readLine()) != null) {
					System.out.println(sCurrentLine);
				}

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (br != null)
						br.close();

					if (fr != null)
						fr.close();
					
					
					
					
					
					
					
					
					
					
			printM(maze);
					
					

				} catch (IOException ex) {

					ex.printStackTrace();

				}

			}
			
			

			

	}
public static void printM(int args[][])	{
	
	for (int i =0; i <args.length;i++){
		
		for (int j =0; j <args[0].length;j++){
			
			System.out.print(args[i][j]+" |");
		}
		
		System.out.println();
	}
	
	
	
	
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

