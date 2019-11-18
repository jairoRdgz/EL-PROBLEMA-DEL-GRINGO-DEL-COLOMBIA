package KruskalYPrim;
import java.util.ArrayList;

public class AlgoritmoKruskal{
	
	public Grafo aplicarKruskal(Grafo grafo){
		Grafo arbol=new Grafo();
		ArrayList<String> nodos=grafo.getCities();

		for(int j=0;j<nodos.size();j++){
			arbol.ingresarNodo(nodos.get(j));
		}

		ArrayList<Arco> L=(ArrayList<Arco>)grafo.getAristas().clone();

		Arco pro=L.get(0);
		arbol.adicionarEnlace(pro.getInicial(), pro.getTerminal(), pro.getPeso());
		L.remove(pro);

		while(L.size()!=0){
			pro=L.get(0);

			if(HayCiclo(arbol, pro,arbol.getNodo(pro.getTerminal()) , pro.getTerminal())==false)
				arbol.adicionarEnlace(pro.getInicial(), pro.getTerminal(), pro.getPeso());

			L.remove(pro);
		}

		return arbol;
	}

	public boolean HayCiclo(Grafo g,Arco aVerificar,Nodo terminal,String N){
		ArrayList<Enlace> aux=terminal.getEnlaces();

		if(aux.size()==0)
			return false;

		if(terminal.existeEnlace(aVerificar.getInicial())!=-1)
			return true;

		for(int i=0;i<aux.size();i++){
			Enlace nodo=aux.get(i);

			if(nodo.getDestino().equals(N)==false)
				if( HayCiclo(g,aVerificar,g.getNodo(nodo.getDestino()),terminal.getCity()))
									return true;
		}

		return false;
	}
}