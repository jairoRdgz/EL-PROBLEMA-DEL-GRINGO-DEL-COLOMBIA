package model_One;

public class Vertice {
  
	private Nodo origen;
    private Nodo destino;
    private double precioBoleto;
 
    public Vertice(Nodo origin, Nodo destino, double precioBoleto) {
        this.origen = origin;
        this.destino = destino;
        this.precioBoleto = precioBoleto;
    }
 
    public Nodo getOrigen() {
        return origen;
    }
 
    public void setOrigen(Nodo origin) {
        this.origen = origin;
    }
 
    public Nodo getDestino() {
        return destino;
    }
 
    public void setDestino(Nodo destino) {
        this.destino = destino;
    }
 
    public double getPrecioBoleto() {
        return precioBoleto;
    }
 
    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

	
	public double comparacionDePrecios(Vertice o) {
		return precioBoleto - o.precioBoleto;
	}
}
