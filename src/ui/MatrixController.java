package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.StageStyle;
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
	
	private double distance;

	public void dijkstra(int origin) {
		Vertex<Integer> vertice = null;
		if (origin == -1) {
			// Bogota a default value
			vertice = new Vertex<Integer>(4);
		} else {
			// when you choose from where to start
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
		String tmp = origen.getValue();
		String vojabes = destino.getValue();
		boolean one = false;
		boolean two = false;
		
		int origin = 0;
		int destination = 0;

		try {
			if (tmp.equals("Arauca")) {
				origin = 1;
			} else if (tmp.equals("Armenia")) {
				origin = 2;
			} else if (tmp.equals("Barranquilla")) {
				origin = 3;
			} else if (tmp.equals("Bogota")) {
				origin = 4;
			} else if (tmp.equals("Bucaramanga")) {
				origin = 5;
			} else if (tmp.equals("Cali")) {
				origin = 6;
			} else if (tmp.equals("Cartagena")) {
				origin = 7;
			} else if (tmp.equals("Florencia")) {
				origin = 8;
			} else if (tmp.equals("Ibague")) {
				origin = 9;
			} else if (tmp.equals("Inirida")) {
				origin = 10;
			} else if (tmp.equals("Leticia")) {
				origin = 11;
			} else if (tmp.equals("Manizales")) {
				origin = 12;
			} else if (tmp.equals("Medellin")) {
				origin = 13;
			} else if (tmp.equals("Mitu")) {
				origin = 14;
			} else if (tmp.equals("Mocoa")) {
				origin = 15;
			} else if (tmp.equals("Monteria")) {
				origin = 16;
			} else if (tmp.equals("Neiva")) {
				origin = 17;
			} else if (tmp.equals("Pereira")) {
				origin = 18;
			} else if (tmp.equals("Popayan")) {
				origin = 19;
			} else if (tmp.equals("Puerto Carreño")) {
				origin = 20;
			} else if (tmp.equals("Quibdo")) {
				origin = 21;
			} else if (tmp.equals("Riohacha")) {
				origin = 22;
			} else if (tmp.equals("San Andres")) {
				origin = 23;
			} else if (tmp.equals("Cucuta")) {
				origin = 24;
			} else if (tmp.equals("Guaviare")) {
				origin = 25;
			} else if (tmp.equals("Pasto")) {
				origin = 26;
			} else if (tmp.equals("Santa Marta")) {
				origin = 27;
			} else if (tmp.equals("Sincelejo")) {
				origin = 28;
			} else if (tmp.equals("Tunja")) {
				origin = 29;
			} else if (tmp.equals("Valledupar")) {
				origin = 30;
			} else if (tmp.equals("Villavicencio")) {
				origin = 31;
			} else if (tmp.equals("Yopal")) {
				origin = 32;
			}
			one = true;
		} catch (NullPointerException e) {
			Alert info = new Alert(AlertType.ERROR);
			info.setTitle("ERROR");
			info.setHeaderText(null);
			info.initStyle(StageStyle.UTILITY);
			info.setContentText("Choose an origin");
			info.show();
		}

		try {
			if (vojabes.equals("Arauca")) {
				destination = 1;
			} else if (vojabes.equals("Armenia")) {
				destination = 2;
			} else if (vojabes.equals("Barranquilla")) {
				destination = 3;
			} else if (vojabes.equals("Bogota")) {
				destination = 4;
			} else if (vojabes.equals("Bucaramanga")) {
				destination = 5;
			} else if (vojabes.equals("Cali")) {
				destination = 6;
			} else if (vojabes.equals("Cartagena")) {
				destination = 7;
			} else if (vojabes.equals("Florencia")) {
				destination = 8;
			} else if (vojabes.equals("Ibague")) {
				destination = 9;
			} else if (vojabes.equals("Inirida")) {
				destination = 10;
			} else if (vojabes.equals("Leticia")) {
				destination = 11;
			} else if (vojabes.equals("Manizales")) {
				destination = 12;
			} else if (vojabes.equals("Medellin")) {
				destination = 13;
			} else if (vojabes.equals("Mitu")) {
				destination = 14;
			} else if (vojabes.equals("Mocoa")) {
				destination = 15;
			} else if (vojabes.equals("Monteria")) {
				destination = 16;
			} else if (vojabes.equals("Neiva")) {
				destination = 17;
			} else if (vojabes.equals("Pereira")) {
				destination = 18;
			} else if (vojabes.equals("Popayan")) {
				destination = 19;
			} else if (vojabes.equals("Puerto Carreño")) {
				destination = 20;
			} else if (vojabes.equals("Quibdo")) {
				destination = 21;
			} else if (vojabes.equals("Riohacha")) {
				destination = 22;
			} else if (vojabes.equals("San Andres")) {
				destination = 23;
			} else if (vojabes.equals("Cucuta")) {
				destination = 24;
			} else if (vojabes.equals("Guaviare")) {
				destination = 25;
			} else if (vojabes.equals("Pasto")) {
				destination = 26;
			} else if (vojabes.equals("Santa Marta")) {
				destination = 27;
			} else if (vojabes.equals("Sincelejo")) {
				destination = 28;
			} else if (vojabes.equals("Tunja")) {
				destination = 29;
			} else if (vojabes.equals("Valledupar")) {
				destination = 30;
			} else if (vojabes.equals("Villavicencio")) {
				destination = 31;
			} else if (vojabes.equals("Yopal")) {
				destination = 32;
			}
			two = true;
		} catch (NullPointerException e) {
			Alert info = new Alert(AlertType.ERROR);
			info.setTitle("ERROR");
			info.setHeaderText(null);
			info.initStyle(StageStyle.UTILITY);
			info.setContentText("Choose a destination");
			info.show();
		}
		
		if(one == true && two == true) {
			double[][] matrixxx = grafo.floydwarshall();

			distance = matrixxx[origin-1][destination-1];
			
			distancia.setText(distance + "");
		}	
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
		origen.getItems().add("Puerto Carreño");
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
		destino.getItems().add("Puerto Carreño");
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
		String f = "Arauca;Armenia;Barranquilla;Bogotá;" + "Bucaramanga;Cali;Cartagena;Florencia;Ibagué"
				+ ";Inírida;Leticia;Manizales;Medellín;Mitú;Mocoa" + ";Montería;Neiva;Pereira;Popayán;Puerto Carreño;"
				+ "Quibdó;Riohacha;San Andrés;Cúcuta;Guaviare;Pasto;" + "Santa Marta;Sincelejo;Valledupar;"
				+ "Villavicencio;Yopal";

		String[] cities = f.split(";");
		for (int i = 0; i < cities.length; i++) {
			grafo.addVertex(1 + i);
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
		grafo.addEdge(8, 9, 138);
		grafo.addEdge(8, 10, 32);
		grafo.addEdge(8, 11, 113);
		grafo.addEdge(8, 12, 80);
		grafo.addEdge(8, 13, 169);
		grafo.addEdge(8, 14, 146);
		grafo.addEdge(8, 15, 191);
		grafo.addEdge(8, 16, 85);
		grafo.addEdge(8, 17, 183);
		grafo.addEdge(8, 18, 183);
		grafo.addEdge(8, 19, 30);
		grafo.addEdge(8, 20, 116);
		grafo.addEdge(8, 21, 51);
		grafo.addEdge(8, 22, 199);
		grafo.addEdge(8, 23, 82);
		grafo.addEdge(8, 24, 76);
		grafo.addEdge(8, 25, 200);
		grafo.addEdge(8, 26, 57);
		grafo.addEdge(8, 27, 114);
		grafo.addEdge(8, 28, 67);
		grafo.addEdge(8, 29, 113);
		grafo.addEdge(8, 30, 133);
		grafo.addEdge(8, 31, 6);
		grafo.addEdge(8, 32, 125);
		grafo.addEdge(9, 10, 146);
		grafo.addEdge(9, 11, 104);
		grafo.addEdge(9, 12, 23);
		grafo.addEdge(9, 13, 162);
		grafo.addEdge(9, 14, 172);
		grafo.addEdge(9, 15, 88);
		grafo.addEdge(9, 16, 31);
		grafo.addEdge(9, 17, 170);
		grafo.addEdge(9, 18, 66);
		grafo.addEdge(9, 19, 139);
		grafo.addEdge(9, 20, 78);
		grafo.addEdge(9, 21, 45);
		grafo.addEdge(9, 22, 117);
		grafo.addEdge(9, 23, 127);
		grafo.addEdge(9, 24, 146);
		grafo.addEdge(9, 25, 136);
		grafo.addEdge(9, 26, 8);
		grafo.addEdge(9, 27, 36);
		grafo.addEdge(9, 28, 149);
		grafo.addEdge(9, 29, 105);
		grafo.addEdge(9, 30, 7);
		grafo.addEdge(9, 31, 23);
		grafo.addEdge(9, 32, 113);
		grafo.addEdge(10, 11, 39);
		grafo.addEdge(10, 12, 177);
		grafo.addEdge(10, 13, 189);
		grafo.addEdge(10, 14, 127);
		grafo.addEdge(10, 15, 26);
		grafo.addEdge(10, 16, 28);
		grafo.addEdge(10, 17, 63);
		grafo.addEdge(10, 18, 155);
		grafo.addEdge(10, 19, 60);
		grafo.addEdge(10, 20, 61);
		grafo.addEdge(10, 21, 121);
		grafo.addEdge(10, 22, 199);
		grafo.addEdge(10, 23, 198);
		grafo.addEdge(10, 24, 46);
		grafo.addEdge(10, 25, 145);
		grafo.addEdge(10, 26, 77);
		grafo.addEdge(10, 27, 40);
		grafo.addEdge(10, 28, 27);
		grafo.addEdge(10, 29, 165);
		grafo.addEdge(10, 30, 77);
		grafo.addEdge(10, 31, 73);
		grafo.addEdge(10, 32, 16);
		grafo.addEdge(11, 12, 35);
		grafo.addEdge(11, 13, 118);
		grafo.addEdge(11, 14, 175);
		grafo.addEdge(11, 15, 110);
		grafo.addEdge(11, 16, 69);
		grafo.addEdge(11, 17, 97);
		grafo.addEdge(11, 18, 162);
		grafo.addEdge(11, 19, 114);
		grafo.addEdge(11, 20, 80);
		grafo.addEdge(11, 21, 28);
		grafo.addEdge(11, 22, 197);
		grafo.addEdge(11, 23, 132);
		grafo.addEdge(11, 24, 11);
		grafo.addEdge(11, 25, 200);
		grafo.addEdge(11, 26, 77);
		grafo.addEdge(11, 27, 53);
		grafo.addEdge(11, 28, 26);
		grafo.addEdge(11, 29, 109);
		grafo.addEdge(11, 30, 93);
		grafo.addEdge(11, 31, 135);
		grafo.addEdge(11, 32, 75);
		grafo.addEdge(12, 13, 151);
		grafo.addEdge(12, 14, 46);
		grafo.addEdge(12, 15, 121);
		grafo.addEdge(12, 16, 63);
		grafo.addEdge(12, 17, 55);
		grafo.addEdge(12, 18, 111);
		grafo.addEdge(12, 19, 117);
		grafo.addEdge(12, 20, 127);
		grafo.addEdge(12, 21, 193);
		grafo.addEdge(12, 22, 30);
		grafo.addEdge(12, 23, 66);
		grafo.addEdge(12, 24, 155);
		grafo.addEdge(12, 25, 131);
		grafo.addEdge(12, 26, 9);
		grafo.addEdge(12, 27, 193);
		grafo.addEdge(12, 28, 193);
		grafo.addEdge(12, 29, 161);
		grafo.addEdge(12, 30, 179);
		grafo.addEdge(12, 31, 39);
		grafo.addEdge(12, 32, 31);
		grafo.addEdge(13, 14, 7);
		grafo.addEdge(13, 15, 46);
		grafo.addEdge(13, 16, 161);
		grafo.addEdge(13, 17, 134);
		grafo.addEdge(13, 18, 171);
		grafo.addEdge(13, 19, 73);
		grafo.addEdge(13, 20, 20);
		grafo.addEdge(13, 21, 139);
		grafo.addEdge(13, 22, 194);
		grafo.addEdge(13, 23, 16);
		grafo.addEdge(13, 24, 174);
		grafo.addEdge(13, 25, 110);
		grafo.addEdge(13, 26, 147);
		grafo.addEdge(13, 27, 31);
		grafo.addEdge(13, 28, 108);
		grafo.addEdge(13, 29, 69);
		grafo.addEdge(13, 30, 43);
		grafo.addEdge(13, 31, 187);
		grafo.addEdge(13, 32, 189);
		grafo.addEdge(14, 15, 69);
		grafo.addEdge(14, 16, 169);
		grafo.addEdge(14, 17, 41);
		grafo.addEdge(14, 18, 125);
		grafo.addEdge(14, 19, 62);
		grafo.addEdge(14, 20, 50);
		grafo.addEdge(14, 21, 144);
		grafo.addEdge(14, 22, 79);
		grafo.addEdge(14, 23, 67);
		grafo.addEdge(14, 24, 84);
		grafo.addEdge(14, 25, 171);
		grafo.addEdge(14, 26, 33);
		grafo.addEdge(14, 27, 176);
		grafo.addEdge(14, 28, 186);
		grafo.addEdge(14, 29, 149);
		grafo.addEdge(14, 30, 56);
		grafo.addEdge(14, 31, 193);
		grafo.addEdge(14, 32, 111);
		grafo.addEdge(15, 16, 16);
		grafo.addEdge(15, 17, 6);
		grafo.addEdge(15, 18, 102);
		grafo.addEdge(15, 19, 48);
		grafo.addEdge(15, 20, 38);
		grafo.addEdge(15, 21, 142);
		grafo.addEdge(15, 22, 175);
		grafo.addEdge(15, 23, 152);
		grafo.addEdge(15, 24, 78);
		grafo.addEdge(15, 25, 10);
		grafo.addEdge(15, 26, 62);
		grafo.addEdge(15, 27, 168);
		grafo.addEdge(15, 28, 116);
		grafo.addEdge(15, 29, 142);
		grafo.addEdge(15, 30, 104);
		grafo.addEdge(15, 31, 126);
		grafo.addEdge(15, 32, 28);
		grafo.addEdge(16, 17, 25);
		grafo.addEdge(16, 18, 72);
		grafo.addEdge(16, 19, 172);
		grafo.addEdge(16, 20, 169);
		grafo.addEdge(16, 21, 25);
		grafo.addEdge(16, 22, 69);
		grafo.addEdge(16, 23, 172);
		grafo.addEdge(16, 24, 95);
		grafo.addEdge(16, 25, 126);
		grafo.addEdge(16, 26, 80);
		grafo.addEdge(16, 27, 61);
		grafo.addEdge(16, 28, 47);
		grafo.addEdge(16, 29, 199);
		grafo.addEdge(16, 30, 67);
		grafo.addEdge(16, 31, 11);
		grafo.addEdge(16, 32, 193);
		grafo.addEdge(17, 18, 69);
		grafo.addEdge(17, 19, 63);
		grafo.addEdge(17, 20, 137);
		grafo.addEdge(17, 21, 106);
		grafo.addEdge(17, 22, 170);
		grafo.addEdge(17, 23, 142);
		grafo.addEdge(17, 24, 153);
		grafo.addEdge(17, 25, 107);
		grafo.addEdge(17, 26, 96);
		grafo.addEdge(17, 27, 148);
		grafo.addEdge(17, 28, 34);
		grafo.addEdge(17, 29, 30);
		grafo.addEdge(17, 30, 101);
		grafo.addEdge(17, 31, 180);
		grafo.addEdge(17, 32, 61);
		grafo.addEdge(18, 19, 86);
		grafo.addEdge(18, 20, 160);
		grafo.addEdge(18, 21, 41);
		grafo.addEdge(18, 22, 59);
		grafo.addEdge(18, 23, 14);
		grafo.addEdge(18, 24, 46);
		grafo.addEdge(18, 25, 89);
		grafo.addEdge(18, 26, 78);
		grafo.addEdge(18, 27, 92);
		grafo.addEdge(18, 28, 190);
		grafo.addEdge(18, 29, 49);
		grafo.addEdge(18, 30, 64);
		grafo.addEdge(18, 31, 22);
		grafo.addEdge(18, 32, 181);
		grafo.addEdge(19, 20, 103);
		grafo.addEdge(19, 21, 105);
		grafo.addEdge(19, 22, 131);
		grafo.addEdge(19, 23, 63);
		grafo.addEdge(19, 24, 197);
		grafo.addEdge(19, 25, 144);
		grafo.addEdge(19, 26, 194);
		grafo.addEdge(19, 27, 75);
		grafo.addEdge(19, 28, 17);
		grafo.addEdge(19, 29, 180);
		grafo.addEdge(19, 30, 98);
		grafo.addEdge(19, 31, 119);
		grafo.addEdge(19, 32, 82);
		grafo.addEdge(20, 21, 116);
		grafo.addEdge(20, 22, 142);
		grafo.addEdge(20, 23, 147);
		grafo.addEdge(20, 24, 88);
		grafo.addEdge(20, 25, 149);
		grafo.addEdge(20, 26, 6);
		grafo.addEdge(20, 27, 6);
		grafo.addEdge(20, 28, 17);
		grafo.addEdge(20, 29, 135);
		grafo.addEdge(20, 30, 73);
		grafo.addEdge(20, 31, 177);
		grafo.addEdge(20, 32, 128);
		grafo.addEdge(21, 22, 129);
		grafo.addEdge(21, 23, 167);
		grafo.addEdge(21, 24, 35);
		grafo.addEdge(21, 25, 107);
		grafo.addEdge(21, 26, 144);
		grafo.addEdge(21, 27, 129);
		grafo.addEdge(21, 28, 84);
		grafo.addEdge(21, 29, 107);
		grafo.addEdge(21, 30, 19);
		grafo.addEdge(21, 31, 192);
		grafo.addEdge(21, 32, 123);
		grafo.addEdge(22, 23, 167);
		grafo.addEdge(22, 24, 37);
		grafo.addEdge(22, 25, 45);
		grafo.addEdge(22, 26, 194);
		grafo.addEdge(22, 27, 35);
		grafo.addEdge(22, 28, 171);
		grafo.addEdge(22, 29, 183);
		grafo.addEdge(22, 30, 113);
		grafo.addEdge(22, 31, 13);
		grafo.addEdge(22, 32, 172);
		grafo.addEdge(23, 24, 104);
		grafo.addEdge(23, 25, 68);
		grafo.addEdge(23, 26, 163);
		grafo.addEdge(23, 27, 196);
		grafo.addEdge(23, 28, 174);
		grafo.addEdge(23, 29, 16);
		grafo.addEdge(23, 30, 70);
		grafo.addEdge(23, 31, 100);
		grafo.addEdge(23, 32, 24);
		grafo.addEdge(24, 25, 181);
		grafo.addEdge(24, 26, 103);
		grafo.addEdge(24, 27, 182);
		grafo.addEdge(24, 28, 56);
		grafo.addEdge(24, 29, 91);
		grafo.addEdge(24, 30, 156);
		grafo.addEdge(24, 31, 52);
		grafo.addEdge(24, 32, 97);
		grafo.addEdge(25, 26, 200);
		grafo.addEdge(25, 27, 41);
		grafo.addEdge(25, 28, 165);
		grafo.addEdge(25, 29, 119);
		grafo.addEdge(25, 30, 179);
		grafo.addEdge(25, 31, 31);
		grafo.addEdge(25, 32, 9);
		grafo.addEdge(26, 27, 149);
		grafo.addEdge(26, 28, 97);
		grafo.addEdge(26, 29, 167);
		grafo.addEdge(26, 30, 87);
		grafo.addEdge(26, 31, 134);
		grafo.addEdge(26, 32, 13);
		grafo.addEdge(27, 28, 52);
		grafo.addEdge(27, 29, 68);
		grafo.addEdge(27, 30, 64);
		grafo.addEdge(27, 31, 194);
		grafo.addEdge(27, 32, 66);
		grafo.addEdge(28, 29, 182);
		grafo.addEdge(28, 30, 163);
		grafo.addEdge(28, 31, 65);
		grafo.addEdge(28, 32, 30);
		grafo.addEdge(29, 30, 45);
		grafo.addEdge(29, 31, 88);
		grafo.addEdge(29, 32, 67);
		grafo.addEdge(30, 31, 192);
		grafo.addEdge(30, 32, 153);
		grafo.addEdge(31, 32, 9);
	}
}