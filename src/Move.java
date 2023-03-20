
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Move extends Application implements EventHandler<ActionEvent>{
	RadioButton rb1,rb2,rb3;
	TextField tf,tf2;

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane pane = new GridPane();
		HBox hb = new HBox();

		pane.add(new Label("Text Field"), 0, 0);
		tf = new TextField("JavaFx");
		tf.setEditable(false);
		pane.add(tf, 1, 0);
		pane.setAlignment(Pos.CENTER);

		rb1 = new RadioButton("Left");
		rb1.setOnAction(this);
		rb2 = new RadioButton("center");
		rb2.setOnAction(this);
		rb3 = new RadioButton("Right");
		rb3.setOnAction(this);

		ToggleGroup t = new ToggleGroup();
		rb1.setToggleGroup(t);
		rb2.setToggleGroup(t);
		rb3.setToggleGroup(t);

		Label l = new Label("Column size");
		tf2 = new TextField();
		


		hb.getChildren().addAll(rb1,rb2,rb3,l,tf2);
		hb.setSpacing(5);

		pane.add(hb,1, 2);
		pane.setHgap(10);
		pane.setVgap(10);

		Scene s = new Scene(pane,500,500);
		primaryStage.setTitle("Move");
		primaryStage.setScene(s);
		primaryStage.show();



	}

	@Override
	public void handle(ActionEvent arg0) {
		if(arg0.getSource()==rb1) {
			tf.setAlignment(Pos.CENTER_LEFT);
		
		}
		else if (arg0.getSource()==rb2) {
			tf.setAlignment(Pos.CENTER);
			
		}
		
		else
		{
			tf.setAlignment(Pos.CENTER_RIGHT);
		}
		
		int size = Integer.parseInt(tf2.getText().toString());
		tf.setFont(Font.font(size));

	}

}
