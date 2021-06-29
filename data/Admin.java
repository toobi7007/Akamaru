package data;

import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Der Sinn dieser Hauptklasse ist die Bündelung aller
 * Scenes zum einfachen Wechseln innerhalb der Scenes.
 * 
 * In dem Objekt sind die jeweiligen Scenes noch mal in einem 
 * Objekt, um Kontextinformationen zu speichern und nicht ständig
 * die FXML Dateien und Controller zu laden.
 * 
 * @author alex
 *
 */
public class Admin {
	private Stage primaryStage;
		
	private Menue menue;
	private GameMenue gMenue;
	private SmallBoardPlay sBoard;
	
	
	public Admin(Stage primStage) throws IOException {
		this.menue = new Menue();
		this.gMenue = new GameMenue();
		this.sBoard = new SmallBoardPlay();
		this.primaryStage = primStage;
		this.primaryStage.setTitle("Akamaru");
	}
	
	public void loadMenue() throws IOException {
		this.menue.load(this);
	}
	
	public void loadGameMenue() throws IOException {
		this.gMenue.load(this);
	}
	
	public void loadSmallBoardPlay() throws IOException {
		this.sBoard.load(this);
	}
	
	public void p_setScene(Scene scene) {
		this.primaryStage.setScene(scene);
	}
	
	public void p_show() {
		this.primaryStage.show();
	}
}









