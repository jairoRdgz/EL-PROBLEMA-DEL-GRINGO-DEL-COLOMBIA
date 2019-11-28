package model;

import java.util.List;

public interface IGraph<T> {
	
	public static final int INF = 12345678;

	public List<Vertex<T>> getVertices();
	
	public boolean isDirected();
	
	public boolean isWeighted();
	
	public void addVertex(T value);

	public void addEdge(T x, T y);
	
	public void addEdge(T x, T y, double w);
	
	public void removeVertex(T v);
	
	public void removeEdge(T x, T y);
	
	public List<Vertex<T>> getNeighbors(Vertex<T> x);
	
	public int getNumberOfVertices();
	
	public int getNumberOfEdges();
	
	public boolean areAdjacent(Vertex<T> x, Vertex<T> y);
	
	public boolean isInGraph(T value);
	
	public double getEdgeWeight(Vertex<T> x, Vertex<T> y);
	
	public void setEdgeWeight(Vertex<T> x, Vertex<T> y, double w);
	
	public void bfs(Vertex<T> s);
	
	public void dfs();	
}