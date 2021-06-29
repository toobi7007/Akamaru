package controller;

import java.net.URL;
import java.util.ResourceBundle;
import data.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class GameMenueController implements Initializable{
	private Admin adm;
	
	@FXML private Button zurueck;
	@FXML private Button spielStart;
	@FXML private TextField nameS;
	@FXML private TextField nameW;
	
	@FXML private ToggleButton toggleButton9;
	@FXML private ToggleButton toggleButton13;
	@FXML private ToggleButton toggleButton19;
	
	
	@FXML
	public void zurueck_OnAction(ActionEvent event) throws Exception {
		this.adm.loadMenue();
		
	}
	
	@FXML
	public void start_OnAction(ActionEvent event) throws Exception {
		this.adm.loadSmallBoardPlay();
	}
	
	@FXML
	public void toggleB9(ActionEvent event) throws Exception{
		if(this.toggleButton19.isSelected()) {
			this.toggleButton19.setSelected(false);
		}
		if(this.toggleButton13.isSelected()) {
			this.toggleButton13.setSelected(false);
		}
	}
	
	@FXML
	public void toggleB13(ActionEvent event) throws Exception{
		if(this.toggleButton19.isSelected()) {
			this.toggleButton19.setSelected(false);
		}
		
		if(this.toggleButton9.isSelected()) {
			this.toggleButton9.setSelected(false);
		}
	}
	
	@FXML
	public void toggleB19(ActionEvent event) throws Exception{
		if(this.toggleButton9.isSelected()) {
			this.toggleButton9.setSelected(false);
		}
		
		if(this.toggleButton13.isSelected()) {
			this.toggleButton13.setSelected(false);
		}
	}
	
	public void setAdmin(Admin admin) {
		this.adm = admin;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
}
