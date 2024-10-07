package com.graph.examples;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDFSExample {

	private int V;
	private LinkedList<Integer> adj[];

	public GraphDFSExample(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}

	void addEdge(int v, int w) {
		System.out.println(adj[v].add(w));
		adj[v].add(w);

	}

	void DFSUtil(int v, boolean visited[]) {
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		// Recur for all the vertices adjacent to this
		// vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	void DFS(int v) {
		// Mark all the vertices as
		// not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper
		// function to print DFS
		// traversal
		DFSUtil(v, visited);
	}

	public static void main(String[] args) {

		GraphDFSExample g = new GraphDFSExample(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		System.out.println(
	            "Following is Depth First Traversal "
	            + "(starting from vertex 2)");
	 
	        // Function call
	        g.DFS(2);
	}
}
