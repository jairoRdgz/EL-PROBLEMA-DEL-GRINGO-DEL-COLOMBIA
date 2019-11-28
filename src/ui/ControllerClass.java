package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.AdjMatrixGraph;
import model.Vertex;

public class ControllerClass {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label ciudades;
    
    protected static AdjMatrixGraph<Integer> grafo;

    @FXML
    void mostrarMatrizInicial(ActionEvent event) {
    	Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("window.fxml"));
			Scene s = new Scene(root);
			Stage st = new Stage();
			st.setTitle("Matriz de Adyancencia");
			st.setScene(s);
			st.setResizable(false);
			st.showAndWait();
		} catch (IOException e) {}
    }
    @FXML
    void caminoMinimo(ActionEvent event) {
    	
    	List<String> choices = new ArrayList<>();
    	choices.add("1. Arauca");
    	choices.add("2. Armenia");
    	choices.add("3. Barranquilla");
    	choices.add("4. Bogota");
    	choices.add("5. Bucaramanga");
    	choices.add("6. Cali");
    	choices.add("7. Cartagena");
    	choices.add("8. Florencia");
    	choices.add("9. Ibague");
    	choices.add("10. Inirida");
    	choices.add("11. Leticia");
    	choices.add("12. Manizales");
    	choices.add("13. Medellin");
    	choices.add("14. Mitu");
    	choices.add("15. Mocoa");
    	choices.add("16. Monteria");
    	choices.add("17. Neiva");
    	choices.add("18. Pereira");
    	choices.add("19. Popayan");
    	choices.add("20. Puerto Carreño");
    	choices.add("21. Quibdo");
    	choices.add("22. Riohacha");
    	choices.add("23. San Andres");
    	choices.add("24. Cucuta");
    	choices.add("25. Guaviare");
    	choices.add("26. Pasto");
    	choices.add("27. Santa Marta");
    	choices.add("28. Sincelejo");
    	choices.add("29. Tunja");
    	choices.add("30. Valledupar");
    	choices.add("31. Villavicencio");
    	choices.add("32. Yopal");

    	ChoiceDialog<String> dialog = new ChoiceDialog<>("Bogota", choices);
    	dialog.setTitle("Dijkstra");
    	dialog.setHeaderText("Desde que ciudad desea Buscar Pasajes");
    	dialog.setContentText("Escoga la ciudad de destino:");

    	// Traditional way to get the response value.
    	Optional<String> result = dialog.showAndWait();
    	
    	if (result.isPresent()){
    		String[] values = result.get().split(". ");
        	int origin = Integer.parseInt(values[0]);
    	    System.out.println("Your choice: " + origin);
    	    dijkstra(origin);
    	}
    }
    
    public void dijkstra(int origin) {
    	
 	   	Vertex<Integer> vertice;
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
    void printMatix(ActionEvent event) {
    	Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("matrix.fxml"));
			Scene s = new Scene(root);
			Stage st = new Stage();
			st.setTitle("Precio de los boletos minimos entre las ciudades");
			st.setScene(s);
			st.setResizable(false);
			st.showAndWait();
		} catch (IOException e) {}
    }
    
    public static void inicializarGrafo() {
		String f = "Arauca;Armenia;Barranquilla;Bogotá;Bucaramanga;Cali;Cartagena;Florencia;Ibagué;Inírida;Leticia;Manizales;Medellín;Mitú;Mocoa;Montería;Neiva;Pereira;Popayán;Puerto Carreño;Quibdó;Riohacha;San Andrés;Cúcuta;Guaviare;Pasto;Santa Marta;Sincelejo;Valledupar;Villavicencio;Yopal";

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
	}

	@FXML
	void initialize() {
		ciudades.setText("Ciudades Capitales\r\n"
				+ "1.	Arauca\r\n" + "2.	Armenia\r\n" + "3.	Barranquilla\r\n" + "4.	Bogotá\r\n"
				+ "5.	Bucaramanga\r\n" + "6.	Cali\r\n" + "7.	Cartagena\r\n" + "8.	Florencia\r\n"
				+ "9.	Ibagué\r\n" + "10.	Inírida\r\n" + "11.	Leticia\r\n" + "12.	Manizales\r\n"
				+ "13.	Medellín\r\n" + "14.	Mitú\r\n" + "15.	Mocoa\r\n" + "16.	Montería\r\n"
				+ "17.	Neiva\r\n" + "18.	Pereira\r\n" + "19.	Popayán\r\n" + "20.	Puerto Carreño\r\n"
				+ "21.	Quibdó\r\n" + "22.	Riohacha\r\n" + "23.	San Andrés\r\n" + "24.	Cúcuta\r\n"
				+ "25.	Guaviare\r\n" + "26.	Pasto\r\n" + "27.	Santa Marta\r\n" + "28.	Sincelejo\r\n"
				+ "29.	Tunja\r\n" + "30.	Valledupar\r\n" + "31.	Villavicencio\r\n" + "32.	Yopal");
	}
}