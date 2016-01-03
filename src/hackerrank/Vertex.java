package hackerrank;

import java.util.ArrayList;

public class Vertex {

	private int ID;
	private int value;
	boolean visited = false;
	
	ArrayList<Vertex> neighbors = new ArrayList<Vertex>();
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
