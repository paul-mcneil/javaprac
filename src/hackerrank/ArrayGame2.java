package hackerrank;

import java.util.ArrayList;

public class ArrayGame2{

	public static void main(String[] args){
		
		// m = 3
		int[] list = { 0, 1, 0, 0, 0, 1, 1};
		
		
		ArrayList<Vertex> adjLists = new ArrayList<Vertex>();
		System.out.println("List length:" + list.length);
		for(int i = 0; i < list.length; i++){
			Vertex V = new Vertex();
			V.setID(i);
			V.setValue(list[i]);
			adjLists.add(V);
		}
		
		
		explore(adjLists, adjLists.get(2));
		System.out.println("adjList length:" + adjLists.size());
		
		addNeighbor(adjLists.get(1), adjLists.get(2));
		addNeighbor(adjLists.get(1), adjLists.get(3));
		
		addNeighbor(adjLists.get(2), adjLists.get(3));
		addNeighbor(adjLists.get(2), adjLists.get(4));
		
		addNeighbor(adjLists.get(4), adjLists.get(5));
		addNeighbor(adjLists.get(5), adjLists.get(6));
	
		System.out.println("Adjacency List:");
		
		for(int i = 0; i < adjLists.size(); i++){
			
			
			System.out.print(i + " visited (");
			System.out.print(adjLists.get(i).visited + "): ");
			
			for(Vertex V : adjLists.get(i).neighbors){
				System.out.print(V.getID() + " ");
			}
			System.out.println("");
			//System.out.println(i + ": " + adjLists.get(i).neighbors);
			
		}
		
	}
	
	public static void explore(ArrayList<Vertex> G, Vertex V){
		
		V.visited = true;
		//System.out.print("getNextNeighbor call on " + V.getID() + " returns: ");
		//System.out.println(getNextNeighbor(G,V));
		Vertex W = new Vertex();
		W = getNextNeighbor(G,V);
		System.out.println(W.getID());
		while(getNextNeighbor(G,V) != null){
			Vertex U = getNextNeighbor(G,V);
			System.out.println("Inside explore");
			if(!U.visited){
				explore(G,U);
			}
		}
	}
	
	public static boolean hasUnvisitedNeighbors(Vertex V){
		
		for(Vertex U : V.neighbors){
			if(!U.visited)
				return true;
		}
		return false;
	}
	
	public static Vertex getNextNeighbor(ArrayList<Vertex> G, Vertex V){
		//System.out.println(V.getID());
		for(int i = 0; i < V.neighbors.size(); i++){
			//System.out.println(V.neighbors.get(i).visited);
			if(!V.neighbors.get(i).visited){
				System.out.println("*** " + V.neighbors.get(i));
				return V.neighbors.get(i);
			}
			
		}
		return null;
	}
	public static void addNeighbor(Vertex V, Vertex U){
		
		V.neighbors.add(U);
	}
	
	public static ArrayList<Vertex> getNeighbors(Vertex V){
		
		return V.neighbors;
	}
	public static int validMove(int index, int[] list, int m){
		
		if(index > 0){
			
			if(list[index+1] == 0){
				return index+1;
			}
			else if(list[index+m] == 0){
				return index+m;
			}
			else if(list[index-1] == 0){
				return validMove(index-1, list, m);
			}
			else{
				return -2;
			}
		}
		else{
			if(list[index+1] == 0){
				return index+1;
			}
			else if(list[index+m] == 0){
				return index+m;
			}
			else{
				return -2;
			}
		}
	}
	
}
