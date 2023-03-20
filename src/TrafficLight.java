import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Traffic extends Application implements EventHandler<ActionEvent> {

	RadioButton rb1,rb2,rb3;
	Circle c,c1,c2;

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane1 = new BorderPane();
		Pane pane = new Pane();
		Rectangle r1 = new Rectangle(120, 240);
		r1.setX(80);
		r1.setY(50);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.BLACK);

		c = new Circle(140, 90, 30);
		c.setStroke(Color.BLACK);
		c.setFill(Color.BLACK);


		c1 = new Circle(140, 160, 30);
		c1.setStroke(Color.BLACK);
		c1.setFill(Color.BLACK);


		c2 = new Circle(140, 230, 30);
		c2.setStroke(Color.BLACK);
		c2.setFill(Color.BLACK);


		rb1 = new RadioButton("Red");
		rb1.setOnAction(this);
		rb2 = new RadioButton("orange");
		rb2.setOnAction(this);
		rb3 = new RadioButton("green");
		rb3.setOnAction(this);

		ToggleGroup t = new ToggleGroup();
		rb1.setToggleGroup(t);
		rb2.setToggleGroup(t);
		rb3.setToggleGroup(t);


		HBox hb = new HBox(rb1,rb2,rb3);
		pane.getChildren().addAll(r1,c,c1,c2);

		pane1.setCenter(pane);
		pane1.setBottom(hb);


		Scene s = new Scene(pane1,300,400);
		primaryStage.setTitle("Traffic");
		primaryStage.setScene(s);
		primaryStage.show();

	}

	@Override
	public void handle(ActionEvent arg0) {
		if(arg0.getSource()==rb1) {
			c.setFill(Color.RED);
			c2.setFill(Color.BLACK);
			c1.setFill(Color.BLACK);
		}
		else if(arg0.getSource()==rb2) {
		c1.setFill(Color.ORANGE);
		c.setFill(Color.BLACK);
		c2.setFill(Color.BLACK);
		}
		

		else {
		c2.setFill(Color.GREEN);
		c1.setFill(Color.BLACK);
		c.setFill(Color.BLACK);
		}
		
	}

}
