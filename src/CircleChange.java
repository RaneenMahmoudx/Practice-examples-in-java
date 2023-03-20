
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleChange extends Application implements EventHandler<ActionEvent>{

	Button larger,smaller;
	Circle c;
	int radius=50;

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox();
		BorderPane pane1 = new BorderPane();
		Pane pane = new Pane();

		c = new Circle(190,150, 50);
		c.setStroke(Color.BLACK);
		c.setFill(Color.BLACK);
		pane.getChildren().add(c);

		larger = new Button("larger");
		larger.setOnAction(this);
		smaller = new Button("Smaller");
		smaller.setOnAction(this);

		hb.getChildren().addAll(larger,smaller);
		hb.setSpacing(10);

		pane1.setCenter(pane);
		pane1.setBottom(hb);



		Scene s = new Scene(pane1,400,400);
		primaryStage.setTitle("Change size");
		primaryStage.setScene(s);
		primaryStage.show();

	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource()==larger) {
			c.setRadius(radius++);
		}
		else  {
			c.setRadius(radius--);
		}
		
		

	}

}
