/*	hacker rank Angry Professor problem:
 * 	https://www.hackerrank.com/challenges/angry-professor
 * 
 
Input Format

The first line of the input contains T, the number of test cases. Each test case contains two lines. 
The first line of each test case contains two space-separated integers, N and K. 
The next line contains N space-separated integers, a1,a2,...,aN, representing the arrival time of each student.

If the arrival time of a given student is a non-positive integer (ai <= 0), then the student enters before the class starts. 
If the arrival time of a given student is a positive integer (ai>0), the student enters after the class has started.

Output Format

For each test case, print "YES" (without quotes) if the class gets cancelled and "NO" (without quotes) otherwise.
 */
package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {

		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		int numCases = 0, numStudents = 0, numRequired = 0;
		int caseNum;
		String temp = null;
		boolean isCancelled = true;
		
		Scanner in = new Scanner(kb);
		numCases = in.nextInt();
		String[] result = new String[numCases];

		for(caseNum = 0; caseNum < numCases; caseNum++){
			
			temp = in.nextLine();
			numStudents = in.nextInt();
			numRequired = in.nextInt();
			
			temp = in.nextLine();
			
			int[] arrivalTimes = new int[numStudents];
			
			for(int i = 0; i < numStudents; i++){
				arrivalTimes[i] = in.nextInt();
			}
						
			int onTime = 0;
			for(int i = 0; i < numStudents && isCancelled == true; i++){
				if(arrivalTimes[i] <= 0)
					onTime++;
				if(onTime >= numRequired){
					isCancelled = false;
				}	
			}
			
			if(isCancelled)
				result[caseNum] = "YES";
			else
				result[caseNum] = "NO";
		}
		
		for(int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

}
