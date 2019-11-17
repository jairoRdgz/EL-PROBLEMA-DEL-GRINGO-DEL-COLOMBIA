package model_One;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<Nodo> nodes;

	public void addNode(Nodo node) {
		if (nodes == null) {
			nodes = new ArrayList<>();
		}
		nodes.add(node);
	}

	public List<Nodo> getNodes() {
		return nodes;
	}

	public void dijkstra() {

	}

	/*
	 * the method implements the Floyd algorithm - Warshall. This is an algorithm
	 * for finding shortest paths in a weighted graph with positive or negative edge
	 * weights (but with no negative cycles). A single execution of the algorithm
	 * will find the lengths (summed weights) of shortest paths between all pairs of
	 * vertices.
	 * 
	 * pre The graph must be different from null
	 * @param graph[][] Matrix representing the graph
	 * post The graph incidence matrix is completed.
	 */
	public void floydWarshall(int graph[][]) {
		int v = 4;
		
		int dist[][] = new int[v][v];
		int i, j, k;

		for (i = 0; i < v; i++) {
			for (j = 0; j < v; j++) {
				dist[i][j] = graph[i][j];
			}
		}

		for (k = 0; k < v; k++) {
			for (i = 0; i < v; i++) {
				for (j = 0; j < v; j++) {
					if (dist[i][k] + dist[k][j] < dist[i][j])
						dist[i][j] = dist[i][k] + dist[k][j];
				}
			}
		}
	}
}