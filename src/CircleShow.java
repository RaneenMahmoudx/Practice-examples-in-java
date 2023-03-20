import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleShow extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Circle c = new Circle(150, 150, 80);
		c.setFill(Color.color(0.25, 0.14, 0.333, 0.51));
		c.setStroke(Color.BLACK);
		
		Pane pane = new Pane();
		pane.getChildren().add(c);
		Scene s = new Scene(pane,300,300);
		primaryStage.setTitle("CIRCLE");
		primaryStage.setScene(s);
		primaryStage.show();
		
		
	}

}
