package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {
		
		
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(kb);
		int numCases = in.nextInt();
		boolean[] results = new boolean[numCases];
		int testNum;
		String temp = null;
		
		temp = IO.readString();
		//System.out.println(temp);
		
		String[] testInput = temp.split(" ");
		int arrSize = Integer.parseInt(testInput[0]);
		int m = Integer.parseInt(testInput[1]);
		String inputArr = IO.readString();
		
		String[] tokens = inputArr.split(" ");
		
		int[] numArr = new int[arrSize];
		int[] validArr = new int[arrSize + m];
		int highIndex = 0;
		int lowIndex = arrSize;
		
		for(int i = 0; i < arrSize; i++){
			
			if(i > 0){
				if(numArr[i] == 0){
					if(i < lowIndex)
						lowIndex = i;
				}
			}
			numArr[i] = Integer.parseInt(tokens[i]);
			if(numArr[i] == 0)
				highIndex = i;
		}
		
		validArr = Arrays.copyOf(numArr, arrSize+m);
		
		
/*		
		for(int i = arrSize; i < arrSize + m; i++){
			validArr[i] = 0;
		}
*/		
		for(int i = 0; i < validArr.length; i++){
			System.out.println(validArr[i]);
		}
		System.out.println("high index = " + highIndex);
		System.out.println("low index = " + lowIndex);
		
		// check if validArr[highIndex+m] == 0
		if(validArr[highIndex+m] == 0){
			
		}
		// find next highestIndex
		for(int i = 0; i < validArr.length; i++){
			
		}
	}
	
	public static boolean canWin(){
		
		
	}
	
	public static int validMove(int index, int[] list, int m){
		
		if(index > 0){
			if(list[index+1] == 0 || list[index+m] == 0 || list[index-1] == 0){
				
			}
			if(list[index+1] == 0){
				return index+1;
			}
			else if(list[index+m] == 0){
				return index+m;
			}
			else if(list[index-1] == 0){
				return validMove(index-1, list, m);
			}
			else{
				return -2;
			}
		}
		else{
			if(list[index+1] == 0){
				return index+1;
			}
			else if(list[index+m] == 0){
				return index+m;
			}
			else{
				return -2;
			}
		}
	}

}
