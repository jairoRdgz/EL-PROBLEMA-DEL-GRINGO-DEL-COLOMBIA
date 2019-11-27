package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControllerClass {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label ciudades;

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