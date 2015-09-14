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
	/*	
		for(int i = 0; i < numPeople; i++){
			for(int j = 0; j < numTopics; j++){
				System.out.print(A[i][j]);
			}
			System.out.println("");
		}
	*/
		int count = 0;
		int temp = 0;
		int max = 0;
		int totalMaxCount = 0;
		for(int i = 0; i < numPeople-1; i++){
			
			temp = i;
			count = 0;
			for(int j = 0; j < numTopics; j++){
			/*
				System.out.print("Comparing ");
				System.out.print("[" + i + "][" + j + "] = ");
				System.out.print(A[i][j] + " and " );
				System.out.print("[" + (temp+1) + "][" + j + "] = " + A[temp+1][j]);
				System.out.println("");
			*/	
				if(A[i][j] == '1' || A[temp+1][j] == '1'){
					count++;
					if(count >= max){
						
						if(count > max){
							max = count;
							totalMaxCount = 1;
						}else{
							totalMaxCount++;
						}
					}
				}
					
				
				if( j != 0 && j % numPeople == 0 && temp < numPeople-2){
					
				//	System.out.println("");
					count = 0;
					j = -1;
					temp++;
				}
				
			}
			//System.out.println("");
		}
		System.out.println(max);
		System.out.println(totalMaxCount);
	
		
	}
}
