import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkbord extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		boolean isBlack = false ;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				Rectangle r = new Rectangle(70, 70, (isBlack)?Color.BLACK:Color.WHITE);
				pane.add(r, i, j);
				isBlack =! isBlack;
				
			}
			isBlack =! isBlack;

			
		}
		
		
		Scene s = new Scene(pane,400,400);
		primaryStage.setTitle("My checkBorder");
		primaryStage.setScene(s);
		primaryStage.show();
		
	}

}
