package data;

import java.io.IOException;

import controller.GameMenueController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class GameMenue {
	
private Admin adm;
	
	private String path_fxml;
	private GameMenueController controller;
	private Scene mainScene;
	
	public GameMenue() {
		this.path_fxml = "/fxml/Gamemenue.fxml";
		this.controller = new GameMenueController();
		this.mainScene = null;
		
	}
		
	/**
	 * Laedt die "Gamemenue" - Scene.
	 * 
	 * @throws IOException 
	 */
	public void load(Admin adm) throws IOException {
		this.adm = adm;
		
		if(mainScene == null) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(this.path_fxml));
			this.controller.setAdmin(this.adm);
			loader.setController(this.controller);
			VBox root = (VBox)loader.load();
			this.mainScene = new Scene(root);
		}
		
		this.adm.p_setScene(this.mainScene);
		this.adm.p_show();
	}
}
