package ds.graph;

import java.util.Arrays;

public class AppGraph {

	public static void main(String[] args) {
		Graph graph = new Graph(10);
		
		graph.addEdge(0, 200);
		graph.addEdge(1, 300);
		graph.addEdge(0, 300);
		
		System.out.println(graph.getVertexCount());
		System.out.println(Arrays.toString(graph.adj(0)));
	}

}
