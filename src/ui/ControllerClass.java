package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerClass {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Label ciudades;

	@FXML
	private Label distanciasInicial;

	@FXML
	void initialize() {
		ciudades.setText("Ciudades Capitales\r\n"
				+ "1.	Arauca\r\n" + "2.	Armenia\r\n" + "3.	Barranquilla\r\n" + "4.	Bogot�\r\n"
				+ "5.	Bucaramanga\r\n" + "6.	Cali\r\n" + "7.	Cartagena\r\n" + "8.	Florencia\r\n"
				+ "9.	Ibagu�\r\n" + "10.	In�rida\r\n" + "11.	Leticia\r\n" + "12.	Manizales\r\n"
				+ "13.	Medell�n\r\n" + "14.	Mit�\r\n" + "15.	Mocoa\r\n" + "16.	Monter�a\r\n"
				+ "17.	Neiva\r\n" + "18.	Pereira\r\n" + "19.	Popay�n\r\n" + "20.	Puerto Carre�o\r\n"
				+ "21.	Quibd�\r\n" + "22.	Riohacha\r\n" + "23.	San Andr�s\r\n" + "24.	C�cuta\r\n"
				+ "25.	Guaviare\r\n" + "26.	Pasto\r\n" + "27.	Santa Marta\r\n" + "28.	Sincelejo\r\n"
				+ "29.	Tunja\r\n" + "30.	Valledupar\r\n" + "31.	Villavicencio\r\n" + "32.	Yopal");

		distanciasInicial.setText("$$$$\r\n"
						+ "396\r\n" + "181\r\n" + "704\r\n" + "0\r\n" + "288\r\n" + "307\r\n" + "650\r\n" + "384\r\n"
						+ "133\r\n" + "687\r\n" + "1083\r\n" + "165\r\n" + "239\r\n" + "575\r\n" + "488\r\n" + "492\r\n"
						+ "239\r\n" + "181\r\n" + "378\r\n" + "750\r\n" + "312\r\n" + "770\r\n" + "1220\r\n" + "394\r\n"
						+ "286\r\n" + "518\r\n" + "726\r\n" + "542\r\n" + "122\r\n" + "659\r\n" + "79\r\n" + "198\r\n");
	}
}