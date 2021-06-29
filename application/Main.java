package application;
	
import data.Admin;
import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Admin main = new Admin(primaryStage);
			main.loadMenue();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
