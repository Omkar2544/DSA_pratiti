package com.om.dsa;

import java.util.ArrayList;

public class Graph {

	public static void main(String[] args) {
		int size = 5;
		graphMatrix grph = new graphMatrix(size);
		grph.addEdge(0, 1);
		grph.addEdge(1, 2);
		grph.addEdge(1, 4);
		grph.addEdge(2, 3);
		grph.addEdge(2, 4);
		grph.addEdge(4, 2);
		grph.addEdge(4, 0);
		
		grph.print();
	   System.out.println( grph.isEdgePresent(4, 2));
		
	}
}

class graphMatrix{
	private int[][] graph;
	
	public graphMatrix(int size) {
		graph = new int[size][size];
	}
	
	public void addEdge(int src,int dest) {
		graph[src][dest]=1;
	}
	
	public Boolean isEdgePresent(int src,int dest) {
		if(graph[src][dest] == 1)return true;
		return false;
	}
	
	public void print() {
		for(int i=0;i<graph.length;i++) {
			for(int j=0;j<graph[0].length;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

class Nodes{
	ArrayList<String> node = new ArrayList<>();
	public void addNode(String node) {
		this.node.add(node);
	}
	
	public String getNode(int i) {
		return this.node.get(i);
	}
	
}