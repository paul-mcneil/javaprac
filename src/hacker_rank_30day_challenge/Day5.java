package hacker_rank_30day_challenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class Day5 {

	/* int[numCases][3]
	 * A[0][0] A[0][1] A[0][2]
	 * a		b		N
	 * Case[0]
	 * Case[1]
	 * Case[2]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int[][] inputCases = new int[numCases][3];
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		
		for(int testCase = 0; testCase < numCases; testCase++){
			
			String input = IO.readString();
			String[] tokens = input.split(" ");
			
			inputCases[testCase][0] = Integer.parseInt(tokens[0]);
			inputCases[testCase][1] = Integer.parseInt(tokens[1]);
			inputCases[testCase][2] = Integer.parseInt(tokens[2]);
		}
		
		for(int i = 0; i < numCases; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(inputCases[i][j] + " ");
			}
			System.out.println("");
		}
		
		for(int i = 0; i < numCases; i++){
			int a = inputCases[i][0];
			int b = inputCases[i][1];
			int N = inputCases[i][2];
			
			for(int j = 0; j < N;j++){
				int term = computeTerm(a,b,j);
				result.get(i).add(term);
			}
		}
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
		
	}
	
	public static int computeTerm(int a, int b, int nthTerm){
		int result = a;
		
		for(int i = 0; i <= nthTerm; i++){
			
			result += (Math.pow(2,i)*b);
		}
		return result;		
	}
	
	public static int findLargestN(int[][] A){
		int largest = 0;
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A[0].length; i++){
				if(A[i][2] > largest){
					largest = A[i][2];
				}
			}
		}
		return largest;
	}

}
