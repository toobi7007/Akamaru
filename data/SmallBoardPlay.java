package data;

import java.io.IOException;
import controller.SmallBoardController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

public class SmallBoardPlay {
	private Admin adm;
	
	private String path_fxml;
	private SmallBoardController controller;
	private Scene mainScene;
	
	public SmallBoardPlay() {
		this.path_fxml = "/fxml/smallBoardPlay.fxml";
		this.controller = new SmallBoardController();
		this.mainScene = null;
		
	}
		
	/**
	 * Laedt die "Small Board" - Scene.
	 * 
	 * @throws IOException 
	 */
	public void load(Admin adm) throws IOException {
		this.adm = adm;
		
		if(mainScene == null) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(this.path_fxml));
			this.controller.setAdmin(this.adm);
			loader.setController(this.controller);
			HBox root = (HBox)loader.load();
			this.mainScene = new Scene(root);
		}
		
		this.adm.p_setScene(this.mainScene);
		this.adm.p_show();
	}
	
	
	
}
