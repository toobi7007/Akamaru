package controller;

import java.net.URL;
import java.util.ResourceBundle;
import data.Admin;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class SmallBoardController implements Initializable{
	private Admin adm;

	public void setAdmin(Admin admin) {
		this.adm = admin;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
