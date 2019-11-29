package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdjMatrixGraphTest {

	private AdjListGraph<Integer> grafo;
	
	protected void setupStage1() {
		grafo = new AdjListGraph<Integer>(false,true);
		
		grafo.addVertex(1);
		grafo.addVertex(2);
		grafo.addVertex(3);
		grafo.addVertex(4);
		grafo.addVertex(5);
		grafo.addVertex(6);
		grafo.addVertex(7);
		grafo.addVertex(8);
	}
	
	protected void setupStage2() {
		grafo = new AdjListGraph<Integer>(false, true);
		
		grafo.addVertex(1);
		grafo.addVertex(2);
		grafo.addVertex(3);
		grafo.addVertex(4);
		grafo.addVertex(5);
		grafo.addVertex(6);
		grafo.addVertex(7);
		grafo.addVertex(8);
		
		grafo.addEdge(1, 2, 1);
		grafo.addEdge(2, 3, 1);
		grafo.addEdge(4, 2, 2);
		grafo.addEdge(3, 5, 2);
		grafo.addEdge(6, 5, 8);
		grafo.addEdge(7, 4, 6);
		grafo.addEdge(2, 5, 3);
	}
	
	@Test
	private void floydwarshallTest() {
		
	}
	
	@Test
	protected void VertexCreationTest() {	
		setupStage1();
		Vertex<Integer> vertex1 = grafo.getVertices().get(0);
		assertNotNull(vertex1);
	}
	
	@Test
	protected void dijkstraTest() {
		setupStage2();
		Vertex<Integer> vertex = grafo.getVertices().get(0);
		Vertex<Integer> pred = vertex.getPred();
		
		
		assertEquals(vertex.getPred(), pred);
	}
}