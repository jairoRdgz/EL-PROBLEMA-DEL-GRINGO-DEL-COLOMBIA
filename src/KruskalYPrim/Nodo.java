package KruskalYPrim;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Nodo{
	private String city;
	private ArrayList<Enlace> enlaces;
	private int enlacesExistentes;

	public ArrayList<Enlace> getEnlaces(){
		return enlaces;
	}

	public Nodo(String newName){
		city = newName;
		enlacesExistentes = -1;
		enlaces = new ArrayList<Enlace>();
	}

	public int getEnlacesExistentes(){
		return enlacesExistentes;
	}

	public String getCity(){
		return city;
	}

	public void agregarEnlace(String enlazar,double peso){
		if (enlacesExistentes == -1){
			enlaces.add(new Enlace(enlazar,peso));
			enlacesExistentes++;
		}
		else{
			int posicion;
			posicion = existeEnlace(enlazar);
			if (posicion == -1){
				enlaces.add(new Enlace(enlazar,peso));
				enlacesExistentes++;
			}
		}
	}

	public int existeEnlace(String enlazar){
		for (int i = 0; i < enlaces.size(); i++){
			Enlace miEnlace;
			miEnlace = enlaces.get(i);
			if (miEnlace.getDestino().equals(enlazar))
				return i;
		}
		return -1;
	}

	public double enlacePosicion(int posi){
		Enlace miEnlace;
		miEnlace = enlaces.get(posi);
		return miEnlace.getPeso();
	}

	public String NodoPosicion(int posi){
		Enlace miEnlace;
		miEnlace = enlaces.get(posi);
		return miEnlace.getDestino();
	}

	boolean eliminarEnlace(int posicion){
		if (posicion >= 0 && posicion <= enlaces.size()){
			enlaces.remove(posicion);
			enlacesExistentes--;
			return true;
		}
		else
			JOptionPane.showMessageDialog(null, "No hay enlace en la posicion " + posicion); 
	 	return false;
	}
}
