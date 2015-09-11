package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ICPC_Team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(kb);
		
		//String input = in.nextLine();
		
		
		int numPeople = in.nextInt(); // 4
		int numTopics = in.nextInt(); // 5
		String[] lines = new String[numPeople];
		for(int i = 0; i < numPeople; i++){
			lines[i] = in.next();
		}
		//System.out.println(input);
	
		
		
		char[][] A = new char[numPeople][numTopics];

		for(int i = 0; i < numPeople; i++){
			for(int j = 0; j < numTopics; j++){
				char[] temp = lines[i].toCharArray();
				A[i][j] = temp[j];
			}
		}
		// numPeople = 4
		// numTopics = 5
		for(int i = 0; i < numPeople; i++){
			for(int j = 0; j < numTopics; j++){
				System.out.print(A[i][j]);
			}
			System.out.println("");
		}
		int count = 0;
		int indexTracker = 0;

		for(int i = 0; i < numPeople-1; i++){
			for(int j = 0; j < numTopics; j++){
				
				for(int k = indexTracker; k < numPeople;k++){
					
					count++;
					System.out.print("*Comparing ");
					System.out.print("[" + i + "][" + j + "]");
					System.out.print(" and " );
					System.out.print("[" + (i+1) + "][" + j + "]");
					System.out.println("");
					
					if(A[i][j] == A[i+1][j]){
						
					}
					
					if(A[i][j] == A[i][k]){
						
					}
						
				}
				indexTracker++;
				
			
				
			/*	
				System.out.print("Comparing ");
				System.out.print("[" + i + "][" + j + "] = ");
				System.out.print(A[i][j] + " and " );
				System.out.print("[" + (i+1) + "][" + j + "] = " + A[i+1][j]);
				System.out.println("");
				
				if(A[i][j] == A[i+1][j]){
					//something
				}
							
				for(int k = i+1; k < numPeople;k++){
					count++;
					System.out.print("*Comparing ");
					System.out.print("[" + i + "][" + j + "]");
					System.out.print(" and " );
					System.out.print("[" + (k) + "][" + j + "]");
					System.out.println("");
					
					if(A[i][j] == A[k][j]){
						
					}
					
					if(A[i][j] == A[i][k]){
						
					}
						
				}
			*/	
				
				
				
				//count++;
			}
			System.out.println("");
		}
		System.out.print(count);
	
		
	}

}
