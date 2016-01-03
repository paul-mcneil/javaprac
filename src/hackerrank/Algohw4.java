package hackerrank;

import java.io.*;

/*
 * Input: n, followed by n lines of n zeroes and ones
 */
public class Algohw4 {

	public static void main(String[] args) throws IOException {
		
		String size;
		String[] temp;
		int[][] B;
		
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		size = kb.readLine();
		
		int n = Integer.parseInt(size);
		
		temp = new String[n];
		
		for(int i = 0; i < n; i++){
			temp[i] = kb.readLine();
		}
		
		B = new int[n][n];
		char[] cArray = new char[n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				
				cArray = temp[i].toCharArray();
				B[i][j] = Character.getNumericValue(cArray[j]);
				
			}
		}
		
		//System.out.println("HI");
		int[][] R = new int[n][n];
		
		for(int i = 0; i < n-1; i++){
			int moveCount = 0;
			
			while(moveCount < 2){
				
				for(int j = 0; j < n-1; j++){
					System.out.println("here");
					
					if(B[i][j] == 1){
						R[i][j] = 0;
						i = j-1;
						break;
					}
					else{
						R[i][j] = 1;
					}
					moveCount++;
					
				}
			}
			
		}
		
		System.out.println("");
		System.out.println("Output: ");
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(R[i][j]);
			}
			System.out.println("");
		}
	
	}
	
	public static boolean checkRight(int[][] A, int i, int j){
		
		if(j+1 <= A[j].length){
			
			if(A[i][j+1] != 1){
				return true;
			}
			else{
				return false;
			}
		}
		else
			return false;
		
	}
	
public static boolean checkDown(int[][] A, int i, int j){
		
		if(i+1 <= A[i].length){
			
			if(A[i+1][j] != 1){
				return true;
			}
			else{
				return false;
			}
		}
		else
			return false;
		
	}

public static void printMatrix(int[][] B){
	
	for(int i = 0; i < B.length; i++){
		for(int j = 0; j < B.length; j++){
			System.out.print(B[i][j]);
		}
		System.out.println("");
	}
}

}
