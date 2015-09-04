package io;

public class Judge {

		private int ID;
		private double score;
		
		public void setID(int jid) {
			ID = jid;
		}
		
		public int getID() {
			return ID; // blah
		}
		
		public void setScore(double s) {
			score = s;
		}
		
		public double getScore() {
			return score;
		}
		
		public boolean isValidScore(double score){
			if(score >= 0 && score <= 10){
				return true;
			}
			else{
				return false;
			}
		}
}