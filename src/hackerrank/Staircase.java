/*
 * https://www.hackerrank.com/challenges/staircase
 * 
 * Hacker rank challenge 
 * Your teacher has given you the task to draw the structure of a staircase. 
 * Being an expert programmer, you decided to make a program for the same. 
 * You are given the height of the staircase. You need to print a staircase as shown in the 
 * example.
 * 
 * Input: 4
 * 
 * Output:
 * 
 * 		#
 * 	   ##	
 * 	  ###
 *   ####	
 *   
 */

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

	public static void main(String[] args) {

		String N = null;
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			N = kb.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// height of staircase
		int n = Integer.parseInt(N);
		
		char[][] A = new char[n][n];	// n by n matrix
		int offset = n-1;
		
		// set all A[i][j] values to spaces
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				A[i][j] = ' ';
			}
		}

		for(int i = 0; i < n; i++){
			
			for(int j = offset; j < n; j++){
				A[i][j] = '#';
			}
			offset--;
		}
		
		for(int i = 0; i < n; i++){
			
			for(int j = 0; j < n; j++){
				System.out.print(A[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}	
	}
}
