package model;

public class Edge<T> implements Comparable<Edge<T>>{

	private double weight;

	private Vertex<T> source;
	private Vertex<T> destination;

	public Edge(Vertex<T> source, Vertex<T> destination) {
		this(source, destination, 1D);
	}

	public Edge(Vertex<T> source, Vertex<T> destination, double weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Vertex<T> getSource() {
		return source;
	}

	public Vertex<T> getDestination() {
		return destination;
	}

	@Override
	public int compareTo(Edge<T> o) {
		return Double.compare(weight, o.weight);
	}
}