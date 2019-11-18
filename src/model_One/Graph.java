package model_One;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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
	
	/*
	 * Is an algorithm for finding the shortest paths between nodes in a graph.
	 * pre The graph must be different from null
	 * @param graph[][] Matrix representing the graph
	 * @param size number of vertices (Me lo inventE jonatan no nos bajes, nunca viste esto)
	 * post The graph incidence matrix is completed
	 */
	public void dijkstra(int graph[][], int size) {
		int dist[] = new int [size];
		Boolean[] tmp = new Boolean[size];
		for (int i = 0; i < size; i++) {
			dist[i] = Integer.MAX_VALUE;
			tmp[i] = false;
		}
		
		dist[0] = 0;
		for (int i = 0; i < size; i++) {
			int temp = minDistance(dist,tmp, size);
			tmp[i] = true;
			
			for (int j = 0; j < size; j++) {
				if(!tmp[j] && graph[temp][j]!=0 && dist[temp]!=Integer.MAX_VALUE && dist[temp]+graph[temp][j] < dist[j]) {
					dist[j] = dist[temp] + graph[temp][j];
				}
			}
		}
	}
	
	protected int minDistance(int[] dist, Boolean[] tmp, int size) {
		int min = Integer.MAX_VALUE, index = -1;
		for (int i = 0; i < size; i++) {
			if(tmp[i] == false && dist[i] <= min) {
				min = dist[i];
				index = i;
			}
		}
		return index;
	}
	
	private int V;   // No. of vertices 
	  
    // Array  of lists for Adjacency List Representation 
    private LinkedList<Integer> adj[]; 
  
    // Constructor 
    Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    //Function to add an edge into the graph 
    void addEdge(int v, int w) 
    { 
        adj[v].add(w);  // Add w to v's list. 
    } 
  
    // A function used by DFS 
    void DFSUtil(int v,boolean visited[]) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFSUtil(n, visited); 
        } 
    } 
  
    // The function to do DFS traversal. It uses recursive DFSUtil() 
    void DFS(int v) 
    { 
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
  
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited); 
    } 
  
    public static void main(String args[]) 
    { 
        Graph g = new Graph(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.DFS(2); 
    } 
}
