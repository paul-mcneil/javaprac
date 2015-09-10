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
		
		
		int numPeople = in.nextInt();
		int numTopics = in.nextInt();
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
		
		for(int i = 0; i < numPeople; i++){
			for(int j = 0; j < numTopics; j++){
				System.out.print(A[i][j]);
			}
			System.out.println("");
		}
		int count = 0;
		for(int i = 0; i < numPeople; i++){
			for(int j = 0; j < numTopics; j++){
				int k = j+1;
				if(A[i][j] == A[k][j])
					count++;
			}
			System.out.println("");
		}
		System.out.print(count);
	
		
	}

}
