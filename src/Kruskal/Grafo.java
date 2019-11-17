package Kruskal;

import java.util.ArrayList;
import java.util.Hashtable;

public class Grafo
{
	ArrayList <String>nombres;
	ArrayList <Arco>aristas;
	Hashtable <String,Nodo> nodos;

	public Grafo()
	{
		nombres=new ArrayList<String>();
		nodos=new Hashtable <String,Nodo>();
		aristas=new ArrayList <Arco>();
	}

	public void ingresarNodo(String nombre)
	{
		nombres.add(nombre);
		nodos.put(nombre,new Nodo(nombre));
	}
	public void adicionarEnlace(String nodoInicial,String nodoTerminal,float peso)
	{
		Arco nuevo=new Arco(nodoInicial,nodoTerminal,peso);
		int i=buscarIndice(nuevo.getPeso());

		if(i==-1)
			aristas.add(nuevo);
		else
			aristas.add(i,nuevo);

		nodos.get(nodoInicial).agregarEnlace(nodoTerminal,peso);
		nodos.get(nodoTerminal).agregarEnlace(nodoInicial,peso);
	}
	public boolean busarArista(Arco arco)
	{
		for(int i=0;i<aristas.size();i++)
		{
			Arco otro=aristas.get(i);
			if(arco.getInicial().equals(otro.getInicial())&&arco.getTerminal().equals(otro.getTerminal())&&arco.getPeso()==otro.getPeso())
			{
				aristas.remove(otro);
				return true;
			}
		}
		return false;
	}
	public int buscarIndice(float peso)
	{
		for(int i=0;i<aristas.size();i++)
		{
 			if(peso<aristas.get(i).getPeso())
				return i;
		}
		return -1;
	}
	public Hashtable getNodos()
	{
		return nodos;
	}
	public void setNodos(Hashtable<String,Nodo > muchos)
	{
		nodos=muchos;
	}
	public ArrayList<String> getNombres()
	{
		return nombres;
	}
	public Nodo getNodo(String nombre)
	{
		return (Nodo)nodos.get(nombre);
	}

	public ArrayList<Arco> getAristas() {
		return aristas;
	}

	public void setAristas(ArrayList<Arco> aristas) {
		this.aristas = aristas;
	}

	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}

}