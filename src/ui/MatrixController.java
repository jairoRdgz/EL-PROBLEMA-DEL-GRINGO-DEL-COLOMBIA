package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import model.AdjMatrixGraph;
import model.Vertex;

public class MatrixController {
	protected static AdjMatrixGraph<Integer> grafo;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label matrix;
    
   public void dijkstra(int origin) {
	   Vertex<Integer> vertice=null;
	   if(origin==-1) {
		   //Bogota a default value 
		   vertice = new Vertex<Integer>(4);   
	   }else {
		   //when you choose from where to start
		   vertice = new Vertex<Integer>(origin);
	   }
	   grafo.dijkstra(vertice);
   }

    @FXML
    private ComboBox<String> origen;

    @FXML
    private ComboBox<String> destino;

    @FXML
    private Label distancia;
	
	@FXML
	void initialize() {
		grafo = new AdjMatrixGraph<Integer>(false, true);
		
		inicializarComboBox();
		
		
		inicializarGrafo();
		
		
	}
	
    @FXML
    void calcular(ActionEvent event) {
    	
    }

    private void inicializarComboBox() {
    	origen.getItems().add("Arauca");
    	origen.getItems().add("Armenia");
    	origen.getItems().add("Barranquilla");
    	origen.getItems().add("Bogota");
    	origen.getItems().add("Bucaramanga");
    	origen.getItems().add("Cali");
    	origen.getItems().add("Cartagena");
    	origen.getItems().add("Florencia");
    	origen.getItems().add("Ibague");
    	origen.getItems().add("Inirida");
    	origen.getItems().add("Leticia");
    	origen.getItems().add("Manizales");
    	origen.getItems().add("Medellin");
    	origen.getItems().add("Mitu");
    	origen.getItems().add("Mocoa");
    	origen.getItems().add("Monteria");
    	origen.getItems().add("Neiva");
    	origen.getItems().add("Pereira");
    	origen.getItems().add("Popayan");
    	origen.getItems().add("Puerto Carre�o");
    	origen.getItems().add("Quibdo");
    	origen.getItems().add("Riohacha");
    	origen.getItems().add("San Andres");
    	origen.getItems().add("Cucuta");
    	origen.getItems().add("Guaviare");
    	origen.getItems().add("Pasto");
    	origen.getItems().add("Santa Marta");
    	origen.getItems().add("Sincelejo");
    	origen.getItems().add("Tunja");
    	origen.getItems().add("Valledupar");
    	origen.getItems().add("Villavicencio");
    	origen.getItems().add("Yopal");
    	
    	destino.getItems().add("Arauca");
    	destino.getItems().add("Armenia");
    	destino.getItems().add("Barranquilla");
    	destino.getItems().add("Bogota");
    	destino.getItems().add("Bucaramanga");
    	destino.getItems().add("Cali");
    	destino.getItems().add("Cartagena");
    	destino.getItems().add("Florencia");
    	destino.getItems().add("Ibague");
    	destino.getItems().add("Inirida");
    	destino.getItems().add("Leticia");
    	destino.getItems().add("Manizales");
    	destino.getItems().add("Medellin");
    	destino.getItems().add("Mitu");
    	destino.getItems().add("Mocoa");
    	destino.getItems().add("Monteria");
    	destino.getItems().add("Neiva");
    	destino.getItems().add("Pereira");
    	destino.getItems().add("Popayan");
    	destino.getItems().add("Puerto Carre�o");
    	destino.getItems().add("Quibdo");
    	destino.getItems().add("Riohacha");
    	destino.getItems().add("San Andres");
    	destino.getItems().add("Cucuta");
    	destino.getItems().add("Guaviare");
    	destino.getItems().add("Pasto");
    	destino.getItems().add("Santa Marta");
    	destino.getItems().add("Sincelejo");
    	destino.getItems().add("Tunja");
    	destino.getItems().add("Valledupar");
    	destino.getItems().add("Villavicencio");
    	destino.getItems().add("Yopal");
    }
    
    
	private void inicializarGrafo() {
		String f = "Arauca;Armenia;Barranquilla;Bogot�;Bucaramanga;Cali;Cartagena;Florencia;Ibagu�;In�rida;Leticia;Manizales;Medell�n;Mit�;Mocoa;Monter�a;Neiva;Pereira;Popay�n;Puerto Carre�o;Quibd�;Riohacha;San Andr�s;C�cuta;Guaviare;Pasto;Santa Marta;Sincelejo;Valledupar;Villavicencio;Yopal";

		String[] cities = f.split(";");
		for (int i = 0; i < cities.length; i++) {
			// grafo.addVertex(1+i, cities[i]);
		}

		grafo.addEdge(1, 2, 20);
		grafo.addEdge(1, 3, 177);
		grafo.addEdge(1, 4, 199);
		grafo.addEdge(1, 5, 199);
		grafo.addEdge(1, 6, 90);
		grafo.addEdge(1, 7, 48);
		grafo.addEdge(1, 8, 41);
		grafo.addEdge(1, 9, 80);
		grafo.addEdge(1, 10, 184);
		grafo.addEdge(1, 11, 48);
		grafo.addEdge(1, 12, 24);
		grafo.addEdge(1, 13, 196);
		grafo.addEdge(1, 14, 157);
		grafo.addEdge(1, 15, 11);
		grafo.addEdge(1, 16, 145);
		grafo.addEdge(1, 17, 40);
		grafo.addEdge(1, 18, 198);
		grafo.addEdge(1, 19, 69);
		grafo.addEdge(1, 20, 199);
		grafo.addEdge(1, 21, 200);
		grafo.addEdge(1, 22, 194);
		grafo.addEdge(1, 23, 200);
		grafo.addEdge(1, 24, 137);
		grafo.addEdge(1, 25, 111);
		grafo.addEdge(1, 26, 94);
		grafo.addEdge(1, 27, 82);
		grafo.addEdge(1, 28, 37);
		grafo.addEdge(1, 29, 54);
		grafo.addEdge(1, 30, 197);
		grafo.addEdge(1, 31, 58);
		grafo.addEdge(1, 32, 35);
		grafo.addEdge(2, 3, 60);
		grafo.addEdge(2, 4, 107);
		grafo.addEdge(2, 5, 132);
		grafo.addEdge(2, 6, 139);
		grafo.addEdge(2, 7, 193);
		grafo.addEdge(2, 8, 127);
		grafo.addEdge(2, 9, 132);
		grafo.addEdge(2, 10, 181);
		grafo.addEdge(2, 11, 75);
		grafo.addEdge(2, 12, 61);
		grafo.addEdge(2, 13, 135);
		grafo.addEdge(2, 14, 188);
		grafo.addEdge(2, 15, 130);
		grafo.addEdge(2, 16, 141);
		grafo.addEdge(2, 17, 74);
		grafo.addEdge(2, 18, 116);
		grafo.addEdge(2, 19, 180);
		grafo.addEdge(2, 20, 117);
		grafo.addEdge(2, 21, 18);
		grafo.addEdge(2, 22, 192);
		grafo.addEdge(2, 23, 111);
		grafo.addEdge(2, 24, 167);
		grafo.addEdge(2, 25, 111);
		grafo.addEdge(2, 26, 11);
		grafo.addEdge(2, 27, 13);
		grafo.addEdge(2, 28, 114);
		grafo.addEdge(2, 29, 144);
		grafo.addEdge(2, 30, 45);
		grafo.addEdge(2, 31, 151);
		grafo.addEdge(2, 32, 143);
		grafo.addEdge(3, 4, 42);
		grafo.addEdge(3, 5, 170);
		grafo.addEdge(3, 6, 82);
		grafo.addEdge(3, 7, 184);
		grafo.addEdge(3, 8, 78);
		grafo.addEdge(3, 9, 180);
		grafo.addEdge(3, 10, 59);
		grafo.addEdge(3, 11, 120);
		grafo.addEdge(3, 12, 87);
		grafo.addEdge(3, 13, 43);
		grafo.addEdge(3, 14, 128);
		grafo.addEdge(3, 15, 38);
		grafo.addEdge(3, 16, 91);
		grafo.addEdge(3, 17, 79);
		grafo.addEdge(3, 18, 37);
		grafo.addEdge(3, 19, 64);
		grafo.addEdge(3, 20, 189);
		grafo.addEdge(3, 21, 75);
		grafo.addEdge(3, 22, 118);
		grafo.addEdge(3, 23, 64);
		grafo.addEdge(3, 24, 9);
		grafo.addEdge(3, 25, 148);
		grafo.addEdge(3, 26, 62);
		grafo.addEdge(3, 27, 140);
		grafo.addEdge(3, 28, 54);
		grafo.addEdge(3, 29, 80);
		grafo.addEdge(3, 30, 63);
		grafo.addEdge(3, 31, 198);
		grafo.addEdge(3, 32, 143);
		grafo.addEdge(4, 5, 71);
		grafo.addEdge(4, 6, 155);
		grafo.addEdge(4, 7, 60);
		grafo.addEdge(4, 8, 40);
		grafo.addEdge(4, 9, 110);
		grafo.addEdge(4, 10, 35);
		grafo.addEdge(4, 11, 127);
		grafo.addEdge(4, 12, 153);
		grafo.addEdge(4, 13, 182);
		grafo.addEdge(4, 14, 158);
		grafo.addEdge(4, 15, 5);
		grafo.addEdge(4, 16, 175);
		grafo.addEdge(4, 17, 26);
		grafo.addEdge(4, 18, 152);
		grafo.addEdge(4, 19, 73);
		grafo.addEdge(4, 20, 173);
		grafo.addEdge(4, 21, 76);
		grafo.addEdge(4, 22, 44);
		grafo.addEdge(4, 23, 141);
		grafo.addEdge(4, 24, 15);
		grafo.addEdge(4, 25, 188);
		grafo.addEdge(4, 26, 186);
		grafo.addEdge(4, 27, 48);
		grafo.addEdge(4, 28, 173);
		grafo.addEdge(4, 29, 138);
		grafo.addEdge(4, 30, 95);
		grafo.addEdge(4, 31, 135);
		grafo.addEdge(4, 32, 137);
		grafo.addEdge(5, 6, 176);
		grafo.addEdge(5, 7, 41);
		grafo.addEdge(5, 8, 199);
		grafo.addEdge(5, 9, 49);
		grafo.addEdge(5, 10, 13);
		grafo.addEdge(5, 11, 131);
		grafo.addEdge(5, 12, 91);
		grafo.addEdge(5, 13, 41);
		grafo.addEdge(5, 14, 14);
		grafo.addEdge(5, 15, 18);
		grafo.addEdge(5, 16, 115);
		grafo.addEdge(5, 17, 20);
		grafo.addEdge(5, 18, 109);
		grafo.addEdge(5, 19, 197);
		grafo.addEdge(5, 20, 172);
		grafo.addEdge(5, 21, 24);
		grafo.addEdge(5, 22, 26);
		grafo.addEdge(5, 23, 132);
		grafo.addEdge(5, 24, 88);
		grafo.addEdge(5, 25, 171);
		grafo.addEdge(5, 26, 17);
		grafo.addEdge(5, 27, 180);
		grafo.addEdge(5, 28, 15);
		grafo.addEdge(5, 29, 114);
		grafo.addEdge(5, 30, 10);
		grafo.addEdge(5, 31, 63);
		grafo.addEdge(5, 32, 183);
		grafo.addEdge(6, 7, 47);
		grafo.addEdge(6, 8, 199);
		grafo.addEdge(6, 9, 6);
		grafo.addEdge(6, 10, 10);
		grafo.addEdge(6, 11, 91);
		grafo.addEdge(6, 12, 52);
		grafo.addEdge(6, 13, 78);
		grafo.addEdge(6, 14, 176);
		grafo.addEdge(6, 15, 20);
		grafo.addEdge(6, 16, 28);
		grafo.addEdge(6, 17, 44);
		grafo.addEdge(6, 18, 9);
		grafo.addEdge(6, 19, 169);
		grafo.addEdge(6, 20, 70);
		grafo.addEdge(6, 21, 32);
		grafo.addEdge(6, 22, 33);
		grafo.addEdge(6, 23, 96);
		grafo.addEdge(6, 24, 103);
		grafo.addEdge(6, 25, 106);
		grafo.addEdge(6, 26, 136);
		grafo.addEdge(6, 27, 164);
		grafo.addEdge(6, 28, 75);
		grafo.addEdge(6, 29, 64);
		grafo.addEdge(6, 30, 47);
		grafo.addEdge(6, 31, 34);
		grafo.addEdge(6, 32, 166);
		grafo.addEdge(7, 8, 177);
		grafo.addEdge(7, 9, 183);
		grafo.addEdge(7, 10, 9);
		grafo.addEdge(7, 11, 163);
		grafo.addEdge(7, 12, 119);
		grafo.addEdge(7, 13, 128);
		grafo.addEdge(7, 14, 198);
		grafo.addEdge(7, 15, 84);
		grafo.addEdge(7, 16, 140);
		grafo.addEdge(7, 17, 142);
		grafo.addEdge(7, 18, 112);
		grafo.addEdge(7, 19, 189);
		grafo.addEdge(7, 20, 152);
		grafo.addEdge(7, 21, 136);
		grafo.addEdge(7, 22, 174);
		grafo.addEdge(7, 23, 148);
		grafo.addEdge(7, 24, 126);
		grafo.addEdge(7, 25, 197);
		grafo.addEdge(7, 26, 170);
		grafo.addEdge(7, 27, 21);
		grafo.addEdge(7, 28, 58);
		grafo.addEdge(7, 29, 168);
		grafo.addEdge(7, 30, 119);
		grafo.addEdge(7, 31, 39);
		grafo.addEdge(7, 32, 175);
		grafo.addEdge(8,9,138);
		grafo.addEdge(8,10,32);
		grafo.addEdge(8,11,113);
		grafo.addEdge(8,12,80);
		grafo.addEdge(8,13,169);
		grafo.addEdge(8,14,146);
		grafo.addEdge(8,15,191);
		grafo.addEdge(8,16,85);
		grafo.addEdge(8,17,183);
		grafo.addEdge(8,18,183);
		grafo.addEdge(8,19,30);
		grafo.addEdge(8,20,116);
		grafo.addEdge(8,21,51);
		grafo.addEdge(8,22,199);
		grafo.addEdge(8,23,82);
		grafo.addEdge(8,24,76);
		grafo.addEdge(8,25,200);
		grafo.addEdge(8,26,57);
		grafo.addEdge(8,27,114);
		grafo.addEdge(8,28,67);
		grafo.addEdge(8,29,113);
		grafo.addEdge(8,30,133);
		grafo.addEdge(8,31,6);
		grafo.addEdge(8,32,125);
		grafo.addEdge(9,10,146);
		grafo.addEdge(9,11,104);
		grafo.addEdge(9,12,23);
		grafo.addEdge(9,13,162);
		grafo.addEdge(9,14,172);
		grafo.addEdge(9,15,88);
		grafo.addEdge(9,16,31);
		grafo.addEdge(9,17,170);
		grafo.addEdge(9,18,66);
		grafo.addEdge(9,19,139);
		grafo.addEdge(9,20,78);
		grafo.addEdge(9,21,45);
		grafo.addEdge(9,22,117);
		grafo.addEdge(9,23,127);
		grafo.addEdge(9,24,146);
		grafo.addEdge(9,25,136);
		grafo.addEdge(9,26,8);
		grafo.addEdge(9,27,36);
		grafo.addEdge(9,28,149);
		grafo.addEdge(9,29,105);
		grafo.addEdge(9,30,7);
		grafo.addEdge(9,31,23);
		grafo.addEdge(9,32,113);
		grafo.addEdge(10,11,39);
		grafo.addEdge(10,12,177);
		grafo.addEdge(10,13,189);
		grafo.addEdge(10,14,127);
		grafo.addEdge(10,15,26);
		grafo.addEdge(10,16,28);
		grafo.addEdge(10,17,63);
		grafo.addEdge(10,18,155);
		grafo.addEdge(10,19,60);
		grafo.addEdge(10,20,61);
		grafo.addEdge(10,21,121);
		grafo.addEdge(10,22,199);
		grafo.addEdge(10,23,198);
		grafo.addEdge(10,24,46);
		grafo.addEdge(10,25,145);
		grafo.addEdge(10,26,77);
		grafo.addEdge(10,27,40);
		grafo.addEdge(10,28,27);
		grafo.addEdge(10,29,165);
		grafo.addEdge(10,30,77);
		grafo.addEdge(10,31,73);
		grafo.addEdge(10,32,16);
		grafo.addEdge(11,12,35);
		grafo.addEdge(11,13,118);
		grafo.addEdge(11,14,175);
		grafo.addEdge(11,15,110);
		grafo.addEdge(11,16,69);
		grafo.addEdge(11,17,97);
		grafo.addEdge(11,18,162);
		grafo.addEdge(11,19,114);
		grafo.addEdge(11,20,80);
		grafo.addEdge(11,21,28);
		grafo.addEdge(11,22,197);
		grafo.addEdge(11,23,132);
		grafo.addEdge(11,24,11);
		grafo.addEdge(11,25,200);
		grafo.addEdge(11,26,77);
		grafo.addEdge(11,27,53);
		grafo.addEdge(11,28,26);
		grafo.addEdge(11,29,109);
		grafo.addEdge(11,30,93);
		grafo.addEdge(11,31,135);
		grafo.addEdge(11,32,75);
		grafo.addEdge(12,13,151);
		grafo.addEdge(12,14,46);
		grafo.addEdge(12,15,121);
		grafo.addEdge(12,16,63);
	}
}