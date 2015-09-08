package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SherlockSquares {

	public static void main(String[] args) {

		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(kb);
		
		int numCases = in.nextInt();
		int A, B;
		int[] result = new int[numCases];
		
		String[] input = new String[numCases];
		for(int i = 0; i < numCases; i++){
			input[i] = in.nextLine();
			A = in.nextInt();
			B = in.nextInt();
			result[i] = getNumSquareInts(A, B);
		}
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
		
	}
	
	static int getNumSquareInts(int A, int B){
		int low, high, count = 0;
		
		low = (int) Math.sqrt(A);
		high = (int) Math.sqrt(B);
		
		while(low <= high){
			int temp = low * low;
			if(isInBetween(temp, A, B))
				count++;
			low++;
		}
		// low = square root A and round down 
		// high = square root B and round down
		//
		
		return count;
	}
	
	static boolean isInBetween(int num, int low, int high){
		
		if(num >= low && num <= high)
			return true;
		else
			return false;
	}

}
