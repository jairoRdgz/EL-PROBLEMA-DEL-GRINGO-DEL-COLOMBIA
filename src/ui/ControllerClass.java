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
       ciudades.setText("1.	Arauca\r\n" + 
       		"2.	Armenia\r\n" + 
       		"3.	Barranquilla\r\n" + 
       		"4.	Bogot�\r\n" + 
       		"5.	Bucaramanga\r\n" + 
       		"6.	Cali\r\n" + 
       		"7.	Cartagena\r\n" + 
       		"8.	Florencia\r\n" + 
       		"9.	Ibagu�\r\n" + 
       		"10.	In�rida\r\n" + 
       		"11.	Leticia\r\n" + 
       		"12.	Manizales\r\n" + 
       		"13.	Medell�n\r\n" + 
       		"14.	Mit�\r\n" + 
       		"15.	Mocoa\r\n" + 
       		"16.	Monter�a\r\n" + 
       		"17.	Neiva\r\n" + 
       		"18.	Pereira\r\n" + 
       		"19.	Popay�n\r\n" + 
       		"20.	Puerto Carre�o\r\n" + 
       		"21.	Quibd�\r\n" + 
       		"22.	Riohacha\r\n" + 
       		"23.	San Andr�s\r\n" + 
       		"24.	C�cuta\r\n" + 
       		"25.	Guaviare\r\n" + 
       		"26.	Pasto\r\n" + 
       		"27.	Santa Marta\r\n" + 
       		"28.	Sincelejo\r\n" + 
       		"29.	Tunja\r\n" + 
       		"30.	Valledupar\r\n" + 
       		"31.	Villavicencio\r\n" + 
       		"32.	Yopal");
       
       distanciasInicial.setText("396 km\r\n" +
       		"181 km\r\n" +
       		"704 km\r\n" +
       		"0 km\r\n" +
       		"288 km\r\n" +
       		"307 km\r\n" +
       		"650 km\r\n" + 
       		"384 km\r\n"+
       		"133 km\r\n"+
       		"687 km\r\n"+
       		"1083 km\r\n"+
       		"165 km\r\n"+
       		"239 km\r\n"+
       		"575 km\r\n"+
       		"488 km\r\n"+
       		"492 km\r\n"+
       		"239 km\r\n"+
       		"181 km\r\n"+
       		"378 km\r\n"+
       		"750 km\r\n"+
       		"312 km\r\n"+
       		"770 km\r\n"+
       		"1220 km\r\n"+
       		"394 km\r\n"+
       		"286 km\r\n"+
       		"518 km\r\n"+
       		"726 km\r\n"+
       		"542 km\r\n"+
       		"122 km\r\n"+
       		"659 km\r\n" +
       		"79 km\r\n" +
    		"198 km\r\n");
    }
}