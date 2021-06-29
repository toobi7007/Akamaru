package controller;

import java.net.URL;
import java.util.ResourceBundle;

import data.Admin;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class MenueController implements Initializable {
	private Admin adm;
	
	@FXML public Button startSpiel;
	@FXML public Button startTurnier;
	@FXML public Button beenden;
	
	public void setAdmin(Admin admin) {
		this.adm = admin;
	}
	
	public void startSpiel(ActionEvent event) throws Exception{	
		this.adm.loadGameMenue();
	}
	
	
	/**
	 * Diese Methode soll die Applikation beenden, auch ohne über den Window Manager zu gehen.
	 * 
	 * @param event
	 * @throws Exception
	 */
	public void endSpiel(ActionEvent event) throws Exception {
		Platform.exit();
//		System.exit(0);
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
