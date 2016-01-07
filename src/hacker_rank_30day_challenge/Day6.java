package hacker_rank_30day_challenge;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		String[][] A = new String[height][height];
		int offset = height-1;;
		
		fillWithSpaces(A);
		
		for(int i = 0; i < A.length; i++){
			for(int j = offset; j < A[0].length; j++){
				A[i][j] = "#";
			}
			offset--;
		}
		
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A[0].length; j++){
				System.out.print(A[i][j]);
			}
			System.out.println("");
		}
		sc.close();
	}
	
	public static void fillWithSpaces(String[][] A){
		
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A[0].length; j++){
				A[i][j] = " ";
			}
		}
		
	}

}
