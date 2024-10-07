package com.graph.examples;

import java.util.ArrayList;
import java.util.List;

public class DFSImplementation {

	static class Node {
		String name;
		List<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

		public List<String> depthFirstSearch(List<String> array) {
			array.add(name);
			children.forEach(child -> child.depthFirstSearch(array));
			System.out.println(array);
			return array;
		}

		public Node addChild(String name) {
			Node child = new Node(name);
			children.add(child);
			return this;
		}
	}
}
