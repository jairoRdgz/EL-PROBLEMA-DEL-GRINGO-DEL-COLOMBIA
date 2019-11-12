package model_One;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    private String city;
    private List<Vertice> vertices;
 
    public Nodo(String city) {
        this.city = city;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public List<Vertice> getVertices() {
        return vertices;
    }
 
    public void addEdge(Vertice vertice) {
        if (vertices == null) {
        	vertices = new ArrayList<>();
        }
        vertices.add(vertice);
    }
}