package algo_hw2;

import java.util.ArrayList;
import java.util.BitSet;

public class GoldbachConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit = (int) Math.pow(10, 7);
		boolean[] result = new boolean[limit];

		BitSet list = computePrimes(limit);
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int i = 0; i < list.length(); i++){
			
			if(list.get(i)){
				primeList.add(i);
			}
			//System.out.println(list.get(i));
		}
		int count = 0;
		for(int i = 1; i < primeList.size(); i++){
			for(int j = i; j < primeList.size(); j++){
				
				int sum = primeList.get(i) + primeList.get(j);
				count++;
				//System.out.println(sum);
				if(sum > limit){
					break;
				}
				if(sum < limit){
					result[sum] = true;
				}			
			}
		}
		//System.out.println(count);
		for(int i = 0; i < result.length; i=i+2){
			//System.out.println(i + ", " + result[i]);
		}
		System.out.println("I win");
		
	}
	
	public static BitSet computePrimes(int limit)
	{
	    final BitSet primes = new BitSet();
	    primes.set(0, false);
	    primes.set(1, false);
	    primes.set(2, limit, true);
	    for (int i = 0; i * i < limit; i++)
	    {
	        if (primes.get(i))
	        {
	            for (int j = i * i; j < limit; j += i)
	            {
	                primes.clear(j);
	            }
	        }
	    }
	    return primes;
	}

}
