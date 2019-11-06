package model;

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
}
