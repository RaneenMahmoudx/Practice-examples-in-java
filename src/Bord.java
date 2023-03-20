

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Bord extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		pane.setCenter(new Button("center"));
		pane.setBottom(new Button("button"));
		pane.setTop(new Button("top"));
		pane.setRight(new Button("right"));
		pane.setLeft(new Button("left"));
		
		Scene s = new Scene(pane,400,400);
		primaryStage.setScene(s);
		primaryStage.show();
		

		
	}

}
