
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;




public class Project3 {


public static void main (String [] args ){
	
	
	int numbers [][] = new int [10][10];
	 File file = new File ("input.txt");
	 try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
	
			 
		    int j=0;
		    while ((line = br.readLine()) != null) {
		   	 if (j>9){
		   		 j=0;
		   		 printM(numbers);
		   		 solve_maze(numbers);
numbers = new int [10][10];
continue;
		   	 
		   	 }
		   String[] arr =line.split(" ")	;
		    
		    
		   for (int i =0;i<arr.length;i++){
			  // System.out.println(arr[i]+ " i = "+i);
			   
			if (arr[i]!=" ")   //do not parse spaces
			   numbers[j][i]= Integer.parseInt(arr[i]);
			   
		   }
		    //
		    
		 
		    	j++;
		    
		    	
		    	
		    	
	
		    	
		    }
		} catch (FileNotFoundException e) {
System.out.println("invalid file provided");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 


	
}
public static void solve_maze(int maze [] []){}

public static void printM(int args[][])	{
	System.out.println("The maze ");
	System.out.println();
	for (int i =0; i <args.length;i++){
		
		for (int j =0; j <args[0].length;j++){
			
			System.out.print(args[i][j]+" ");
		}
		
		System.out.println();
	}
	System.out.println();
}






}
