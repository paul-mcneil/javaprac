package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(kb);
		int numCases = in.nextInt();
		
		String[] results = new String[numCases];
		
		for(int num = 0; num < numCases; num++){
			
			String temp = null;
			
			temp = IO.readString();
			//System.out.println(temp);
			
			String[] testInput = temp.split(" ");
			int arrSize = Integer.parseInt(testInput[0]);
			int m = Integer.parseInt(testInput[1]);
			String inputArr = IO.readString();
			
			String[] tokens = inputArr.split(" ");
			int[] numArr = new int[tokens.length];
		
			for(int i = 0; i < tokens.length; i++){
				numArr[i] = Integer.parseInt(tokens[i]);
			}
			Vertex frontVertex;
			
			int[] list = Arrays.copyOf(numArr, numArr.length+m);
			
			ArrayList<Vertex> adjLists = createAdjList(list);
			
			frontVertex = adjLists.get(0);
			findNeighbors(adjLists,m);
		
			explore(adjLists, frontVertex);
			
			if(isPossibleToWin(adjLists, m))
				results[num] = "YES";
			else
				results[num] = "NO";	
		}
		
		for(int i = 0; i < numCases; i++){
			System.out.println(results[i]);
		}
			
		in.close();
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
		// TODO Auto-generated method stub
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
		//System.out.println(V.getID());
		for(int i = 0; i < V.neighbors.size(); i++){
			//System.out.println(V.neighbors.get(i).visited);
			if(!V.neighbors.get(i).visited){
				//System.out.println("*** " + V.neighbors.get(i));
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
