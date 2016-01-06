/*
 * https://www.hackerrank.com/challenges/java-1d-array
 * You are playing a game on your cellphone. You are given an array of length n, indexed from 0 to n−1. 
 * Each element of the array is either 0 or 1. You can only move to an index which contains 0. 
 * At first you are at the 0th position. In each move you can do one of the following things: 
 * 		- Walk one step forward or backward.
 * 		- Make a jump of exactly length m forward.
 * You can't move backward from position 0. If you move to any position greater than n−1, you win the game.
 * Given the array and the length of the jump, you need to determine if it's possible to win the game or not.
 * 
 */

package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayGame2{

	public static void main(String[] args){
		
		int m = 3;
		Vertex frontVertex;
		// test data
		int[] numArr = { 0, 1, 0, 0, 0, 1, 1};
		
		// concatenates m zeros to the int array
		int[] list = Arrays.copyOf(numArr, numArr.length+m);
		
		// create an adjacency list from an integer array
		ArrayList<Vertex> adjLists = createAdjList(list);
		
		// set the starting vertex
		frontVertex = adjLists.get(0);
		
		// add neighbors to adjacency list
		findNeighbors(adjLists,m);
		
		// DFS subroutine find reachable vertices from the starting vertex
		explore(adjLists, frontVertex);
		
		if(isPossibleToWin(adjLists, m))
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
	
	private static void findNeighbors(ArrayList<Vertex> adjLists, int m) {
		for(int i = 0; i < adjLists.size()-m; i++){
			Vertex V = adjLists.get(i);
			while(addNextValidNeighbor(adjLists,V,m)){
				
				continue;
			}
			resetVisited(adjLists);		
		}
		
	}

	private static ArrayList<Vertex> createAdjList(int[] list) {
		ArrayList<Vertex> adjLists = new ArrayList<Vertex>();
		for(int i = 0; i < list.length; i++){
			Vertex V = new Vertex();
			V.setID(i);
			V.setValue(list[i]);
			adjLists.add(V);
		}
		return adjLists;
	}

	public static boolean isPossibleToWin(ArrayList<Vertex> AdjList, int m){
		int index = AdjList.size()-m;
		
		for(int i = index; i < index+m;i++){
			if(AdjList.get(i).visited)
				return true;
		}
		return false;
	}
	// DFS subroutine 
	public static void explore(ArrayList<Vertex> G, Vertex V){
		
		V.visited = true;
		Vertex W = new Vertex();
		W = getNextNeighbor(G,V);
		while(getNextNeighbor(G,V) != null){
			Vertex U = getNextNeighbor(G,V);
			if(!U.visited){
				explore(G,U);
			}
		}
	}
	
	public static Vertex getNextNeighbor(ArrayList<Vertex> G, Vertex V){

		for(int i = 0; i < V.neighbors.size(); i++){
			if(!V.neighbors.get(i).visited){
				return V.neighbors.get(i);
			}
			
		}
		return null;
	}
	
	public static void addNeighbor(Vertex V, Vertex U){
		
		V.neighbors.add(U);
		U.visited = true;
	}
	
	public static ArrayList<Vertex> getNeighbors(Vertex V){
		
		return V.neighbors;
	}
	
	public static boolean addNextValidNeighbor(ArrayList<Vertex>list, Vertex V, int m){
		Vertex nextVertex;
		
		if(V.getID() > 0 && V.getID() < list.size() - m){
			nextVertex = list.get(V.getID()+1);
			if(!nextVertex.visited){
				if(nextVertex.getValue() == 0){
					addNeighbor(V,nextVertex);
					return true;
				}
				
			}
			nextVertex = list.get(V.getID()-1);
			if(!nextVertex.visited){
				if(nextVertex.getValue() == 0){
					addNeighbor(V,nextVertex);
					return true;
				}
			}
			nextVertex = list.get(V.getID()+m);
			if(!nextVertex.visited){
				if(nextVertex.getValue() == 0){
					addNeighbor(V,nextVertex);
					return true;
				}
			}
			return false;
		}
		else if(V.getID() < list.size()-m){
			nextVertex = list.get(V.getID()+1);
			if(!nextVertex.visited){
				if(nextVertex.getValue() == 0){
					addNeighbor(V,nextVertex);
					return true;
				}
				
			}
			nextVertex = list.get(V.getID()+m);
			if(!nextVertex.visited){
				if(nextVertex.getValue() == 0){
					addNeighbor(V,nextVertex);
					return true;
				}
			}
			return false;
		}
		else{
			return false;
		}
	}
	
	public static void resetVisited(ArrayList<Vertex> adjList){
		Vertex V;
		for(int i = 0; i < adjList.size(); i++){
			V = adjList.get(i);
			V.visited = false;
		}
	}
	
}
