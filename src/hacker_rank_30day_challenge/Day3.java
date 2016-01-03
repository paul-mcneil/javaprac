package hacker_rank_30day_challenge;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String ans = "";
		
		if(n % 2 != 0){
			ans = "Weird";
		}
		else if(n >= 2 && n <= 5 ){
			ans = "Not Weird";
		}
		else if(n >= 6 && n <= 20){
			ans = "Weird";
		}
		else{
			ans = "Not Weird";
		}
		
		System.out.println(ans);
	}

}
