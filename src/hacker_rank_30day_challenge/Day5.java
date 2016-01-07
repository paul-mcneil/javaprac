package hacker_rank_30day_challenge;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

public class Day5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int[][] inputCases = new int[numCases][3];
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		
		for(int testCase = 0; testCase < numCases; testCase++){
			
			String input = readString();
			String[] tokens = input.split(" ");
			
			inputCases[testCase][0] = Integer.parseInt(tokens[0]);
			inputCases[testCase][1] = Integer.parseInt(tokens[1]);
			inputCases[testCase][2] = Integer.parseInt(tokens[2]);
		}
		
		for(int i = 0; i < numCases; i++){
			result.add(new ArrayList<Integer>());
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
			for(int j = 0; j < result.get(i).size(); j++){
				System.out.print(result.get(i).get(j) + " ");
			}
			System.out.println("");
		}
		sc.close();
		
	}
	
	public static int computeTerm(int a, int b, int nthTerm){
		int result = a;
		
		for(int i = 0; i <= nthTerm; i++){
			
			result += (Math.pow(2,i)*b);
		}
		return result;		
	}
	
	public static String readString()
	{
		BufferedReader kb =
				new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				return kb.readLine();
			} catch (IOException e) {
				// should never happen
			}
		}
	}

}
