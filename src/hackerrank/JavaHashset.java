package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(kb);
		
		HashSet<String> hset = new HashSet<String>(); 
		
		int num = in.nextInt();
		for(int i = 0; i < num; i++){
			String temp = in.next();
			
			if(hset.add(temp) != false)
				System.out.println("Element added.");
			
		}
	}

}
