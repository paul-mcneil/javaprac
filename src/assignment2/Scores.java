package assignment2;

/*
 * 1. Get the number of judges
 * 2. create an array of judges objects
 * 3.
 */


public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get the number of Judges
		int numJudges = 0;
		do{
			System.out.print("Enter number of Judges: ");
			numJudges = IO.readInt();
			if(numJudges <= 0){
				IO.reportBadInput();
			}
			
		}while(numJudges <= 0);
		
		
		Judge[] judges = new Judge[numJudges];
		
		for(int i = 0; i < numJudges; i++) {
			judges[i] = new Judge();
			judges[i].setID(i+1);
		}
		
		for(int i =0; i < numJudges; i++) {
			
			System.out.print("Enter score for Judge " + judges[i].getID() + ": ");
			double temp = IO.readDouble();
			judges[i].setScore(temp);
			
			
		}
	
/*		for(int i = 0; i < numJudges; i++) {
			System.out.print("Judge " + judges[i].getID() + " score is " + judges[i].getScore());
			System.out.println("");
		}
*/
	
			// get high
			double currentLow = 10;
			double currentHigh = 0;
			
			for(int i = 0; i < numJudges; i++) {
				
				if(judges[i].getScore() > currentHigh) {
					currentHigh = judges[i].getScore();
				}
				else {
					continue;
				}
				
			}
			// get low 
			for(int i = 0; i < numJudges; i++) {
				
				if(judges[i].getScore() < currentLow) {
					//System.out.println("inside " + judges[i].getScore());
					currentLow = judges[i].getScore();
				}
				else {
					//System.out.println(judges[i].getScore() + " is not lower than the current low");
					continue;
				}
			}
			
			double average = 0;
			for(int i = 0; i < numJudges; i++) {
				
				average += judges[i].getScore();
			}
			average = average / numJudges;
			
			double finalAverage = 0;
			
			for(int i = 0; i < numJudges; i++) {
				
				if(judges[i].getScore() == currentLow || judges[i].getScore() == currentHigh) {
					continue;
				}
				else {
					finalAverage += judges[i].getScore();
				}
			}
			finalAverage = finalAverage / (numJudges - 2);
			
			System.out.println("Average: "+ average);
			System.out.println("Final Average: " + finalAverage);
			System.out.println("Low is: " + currentLow);
			System.out.println("High is: " + currentHigh);
			
			
		
		
	}
 
}
