package io;
import java.util.*;

public class Averages {

	public static int mostFrequentCount = 0;
	
	public static double getMean(double[] list){
		double total = 0;
		for(int i = 0; i < list.length; i++){
			total += list[i];
		}
		return total / list.length;
	}
	
	public static double getMin(double[] list){
		double min = Double.longBitsToDouble(0x7fefffffffffffffL);
		
		for(int i = 0; i < list.length; i++){
			if(list[i] < min)
				min = list[i];
			else
				continue;
		}
		return min;
	}
	
	public static double getMax(double[] list){
		double max = 0;
		
		for(int i = 0; i < list.length; i++){
			if(list[i] > max)
				max = list[i];
			else
				continue;
		}
		return max;
	}
	
	public static double getSum(double[] list){
		double sum = 0;
		for(int i = 0; i < list.length; i++){
			sum += list[i];
		}
		return sum;
	}

	public static double getMedian(double[] list){
		int len = list.length;
		double median;
		int index;
		Arrays.sort(list);
	
		// if its an even amount of numbers
		if(len % 2 == 0){
			// index of the higher middle number
			index = (int) (Math.floor(len / 2));
			double total = list[index] + list[index-1];
			median = total / 2;
			
		}
		// its an odd amount of numbers
		else{
			index = (int) (Math.floor(len / 2));
			median = list[index];
		}
		return median;
	}
	public static double getMostFrequent(HashMap<Double, Integer> hm){
		int highestFrequency = 0;
		double mostFrequentDouble = 0;
		for(Double key : hm.keySet()){
			
			if(hm.get(key) >= highestFrequency){
				mostFrequentCount = 1;
				if(hm.get(key) > highestFrequency){
					highestFrequency = hm.get(key);
					mostFrequentDouble = key;
					
				}
				else{
					mostFrequentCount++;
				}
				
			}
		}
		return mostFrequentDouble;
	}
	
	public static double getMode(double[] list){
		double mode;
		HashMap<Double, Integer> hm = new HashMap<Double, Integer>();
		
		for(int i = 0; i < list.length; i++){
			hm.put(list[i], 1);
		}

		for(Double key : hm.keySet()){
			int frequency = 0;
			for(int i = 0; i < list.length; i++){
				
				if(list[i] == key){
					frequency++;
				}
			}
			hm.put(key, frequency);
		}
		
		mode = getMostFrequent(hm);
		return mode;
	}
	
	public static void main(String[] args) {

		int amountOfNumbers;
		amountOfNumbers = IO.readInt();
		double[] list = new double[amountOfNumbers];
	
		for(int i = 0; i < amountOfNumbers; i++){
			
			list[i] = IO.readDouble();
		}
	
		Arrays.sort(list);
		
		//System.out.println("Min: "); 
		IO.outputDoubleAnswer(getMin(list));
		//System.out.println("Max: "); 
		IO.outputDoubleAnswer(getMax(list));
		//System.out.println("Sum: "); 
		IO.outputDoubleAnswer(getSum(list));
		//System.out.println("Mean: "); 
		IO.outputDoubleAnswer(getMean(list));
		//System.out.println("Median: "); 
		IO.outputDoubleAnswer(getMedian(list));
		//System.out.println("Mode: "); 
		getMode(list);
		if(mostFrequentCount > 1){
			System.out.println("none");
		}else{
			IO.outputDoubleAnswer(getMode(list));
		}
		
	}

}
