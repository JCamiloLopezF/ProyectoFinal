package co.edu.uniquindio.proyectofinal.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class clienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnComprar0;

    @FXML
    private Button btnComprar1;

    @FXML
    private Button btnComprar2;

    @FXML
    private Button btnComprar3;

    @FXML
    private AnchorPane camisa11;

    @FXML
    private AnchorPane camisa21;

    @FXML
    private AnchorPane camisa31;

    @FXML
    private AnchorPane camisa41;

    @FXML
    private Label home;

    @FXML
    void comprarProducto(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnComprar0 != null : "fx:id=\"btnComprar0\" was not injected: check your FXML file 'clienteView.fxml'.";
        assert btnComprar1 != null : "fx:id=\"btnComprar1\" was not injected: check your FXML file 'clienteView.fxml'.";
        assert btnComprar2 != null : "fx:id=\"btnComprar2\" was not injected: check your FXML file 'clienteView.fxml'.";
        assert btnComprar3 != null : "fx:id=\"btnComprar3\" was not injected: check your FXML file 'clienteView.fxml'.";
        assert camisa11 != null : "fx:id=\"camisa11\" was not injected: check your FXML file 'clienteView.fxml'.";
        assert camisa21 != null : "fx:id=\"camisa21\" was not injected: check your FXML file 'clienteView.fxml'.";
        assert camisa31 != null : "fx:id=\"camisa31\" was not injected: check your FXML file 'clienteView.fxml'.";
        assert camisa41 != null : "fx:id=\"camisa41\" was not injected: check your FXML file 'clienteView.fxml'.";
        assert home != null : "fx:id=\"home\" was not injected: check your FXML file 'clienteView.fxml'.";

    }

}
