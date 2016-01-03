/*
 * Creates 2 arrays of size input n and m.
 * Each array is sorted using insertion sort.
 * Outputs the number of shifts it takes to sort the array.
 */

package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class RunningTime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, m;
		int nShifts, mShifts;
		
	/*
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Size of Array 1:");
		Scanner in = new Scanner(kb);
		n = in.nextInt();
		System.out.println("Size of Array 2:");
		m = in.nextInt();
		
		list1 = generateArray(n);
		list2 = generateArray(m);
	*/
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] list2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		n = list1.length;
		m = list2.length;
		nShifts = insertionSort(list1);
		mShifts = insertionSort(list2);
		
		System.out.println("Size of Sorted Array: " + n);
		System.out.println("Number of shifts:" + nShifts);
		System.out.println("");
		System.out.println("Size of Reverse-sorted Array: " + m);
		System.out.println("Number of shifts:" + mShifts);
		
		//in.close();
		//System.out.println("Number of shifts: " + numShifts);
	}
	
	static int insertionSort(int[] A){
		int itemsSorted;
		int numShifts = 0;
		for(itemsSorted = 1; itemsSorted < A.length; itemsSorted++){
			int temp = A[itemsSorted];
			
			int loc = itemsSorted - 1;	// start at the end of the list
			
			// while you're not at the beginning of list
			// and the current location is greater than temp
			// move the current word up
			while(loc >= 0 && A[loc] > temp){
				A[loc + 1] = A[loc];
				numShifts++;
				loc--;
			}
			
			A[loc+1] = temp;
			numShifts++;
		}
		return numShifts;
	}
	
	// generates an integer array of size
	static int[] generateArray(int size){
		int[] temp = new int[size];
		
		for(int i = 0; i < size; i++){
			
			temp[i]= (int) (Math.random() * 100) + 1;

		}
		return temp;
	}

}
