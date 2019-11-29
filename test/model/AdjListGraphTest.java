package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdjListGraphTest {

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
	
	@Test
	private void floydwarshallTest() {
		
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	
	
}