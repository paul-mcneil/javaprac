package hacker_rank_30day_challenge;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double mealPrice = sc.nextDouble();
		int tipPercent = sc.nextInt();
		int taxPercent = sc.nextInt();
		
		double tip = (tipPercent * mealPrice) / 100;
		double tax = (mealPrice * taxPercent) / 100;
		int total = (int) (mealPrice + tax + tip);
		
		System.out.println("The final price of the meal is $" + total + ".");
		
		sc.close();
	}

}
