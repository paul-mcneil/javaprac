package hackerrank;

import java.util.ArrayList;

public class Graph {

	public static void main(String[] args){
		
		ArrayList<ArrayList<Integer>> adjLists = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < 6; i++){
			adjLists.add(new ArrayList<Integer>());
		}
		
		adjLists.get(0).add(1);
		adjLists.get(0).add(2);
		
		adjLists.get(1).add(2);
		adjLists.get(1).add(3);
		
		adjLists.get(3).add(4);
		adjLists.get(3).add(5);
		
		adjLists.get(4).add(5);
		
		System.out.println("Neighbors of vertex 0: " + adjLists.get(0));
		System.out.println("Neighbors of vertex 5: " + adjLists.get(5));
		
		System.out.println("Adjacency List:");
		for(int i = 0; i < adjLists.size(); i++){
			System.out.println(i + ": " + adjLists.get(i));
		}
		
	}
	
}
