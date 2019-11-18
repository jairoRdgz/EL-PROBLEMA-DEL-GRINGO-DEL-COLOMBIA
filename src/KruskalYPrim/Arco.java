package KruskalYPrim;

public class Arco{
	
	private String inicial;
	private String terminal;
	private float peso;

	public Arco(String ini, String ter, float pes){
		inicial = ini;
		terminal = ter;
		peso = pes;
	}

	public float getPeso(){
		return peso;
	}

	public void setPeso(float peso){
		this.peso = peso;
	}

	public String getInicial(){
		return inicial;
	}

	public void setInicial(String inicial){
		this.inicial = inicial;
	}

	public String getTerminal(){
		return terminal;
	}

	public void setTerminal(String terminal){
		this.terminal = terminal;
	}

	public String toString(){
		return "(" + inicial + ", " + terminal + ", " + peso + ")";
	}
}