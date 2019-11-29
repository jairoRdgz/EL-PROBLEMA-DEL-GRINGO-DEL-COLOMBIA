package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AdjMatrixGraphTest {
	private AdjMatrixGraph<Integer> grafo;

	protected void setupStage1() {
		grafo = new AdjMatrixGraph<Integer>(true, true);
		
		grafo.addVertex(1);
		grafo.addVertex(2);
		grafo.addVertex(3);
		grafo.addVertex(4);

		grafo.addEdge(1, 3, -2.0);
		grafo.addEdge(3, 4, 2.0);
		grafo.addEdge(4, 2, -1.0);
		grafo.addEdge(2, 1, 4.0);
		grafo.addEdge(2, 3, 3.0);
	}

	@Test
	private void floydwarshallTest() {
		setupStage1();

		double[][] product = grafo.floydwarshall();

		double[][] asItShouldBe = new double[3][3];

		asItShouldBe[0][0] = 0;
		asItShouldBe[1][1] = 0;
		asItShouldBe[2][2] = 0;
		asItShouldBe[3][3] = 0;
		
		asItShouldBe[0][1] = -1;
		asItShouldBe[0][2] = -2;
		asItShouldBe[0][3] = 0;
		
		asItShouldBe[1][0] = 4;
		asItShouldBe[1][2] = 2;
		asItShouldBe[1][3] = 4;
		
		asItShouldBe[2][0] = 5;
		asItShouldBe[2][1] = 1;
		asItShouldBe[2][3] = 2;
		
		asItShouldBe[3][0] = 3;
		asItShouldBe[3][1] = -1;
		asItShouldBe[3][2] = 1;
		
		for (int i = 0; i < product.length; i++) {
			for (int j = 0; j < product.length; j++) {
				assertTrue(asItShouldBe[i][j] == product[i][j], "La ruta minima entre " + i + " y " + j + " debería ser " + asItShouldBe[i][j] + " pero es " + product[i][j]);
			}
		}
	}
	
	protected void setupStage3() {
		grafo = new AdjMatrixGraph<Integer>(false, true);
		
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
	protected void VertexCreationTest() {	
		setupStage1();
		Vertex<Integer> vertex1 = grafo.getVertices().get(0);
		assertNotNull(vertex1);
	}
	
	@Test
	protected void dijkstraTest() {
		setupStage3();
		Vertex<Integer> vertex = grafo.getVertices().get(0);
		Vertex<Integer> pred = vertex.getPred();
		
		
		assertEquals(vertex.getPred(), pred);
	}
}