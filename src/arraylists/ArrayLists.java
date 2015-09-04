package arraylists;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int[] numbers = { 1, 2, 3 ,4 };
		
		for(int i = 0; i < numbers.length; i++){
			list.add(numbers[i]);
		}
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}
