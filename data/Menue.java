package data;

import java.io.IOException;

import controller.MenueController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

/**
 * Diese Klasse soll die Handhabung der Scene "Hauptmenue"
 * repraesentieren.
 * 
 * 
 * @author alex
 *
 */
public class Menue {
	private Admin adm;
	
	private String path_fxml;
	private MenueController controller;
	private Scene mainScene;
	
	public Menue() {
		this.path_fxml = "/fxml/Hauptmenue.fxml";
		this.controller = new MenueController();
		this.mainScene = null;
		
	}
		
	/**
	 * Laedt die "Hauptmenue" - Scene.
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
