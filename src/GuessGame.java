
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Guess extends Application implements EventHandler<ActionEvent>{
	Button b;
	int secretnumber = ((int)Math.random()*100);
	TextField tf,tf2;
	int Counter=0;
	Label l;


	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane pane = new GridPane();
		pane.add(new Label("Guess the number (0-100)"), 0, 0);
		tf = new TextField();
		pane.add(tf, 1, 0);

		b = new Button("Guess");
		pane.add(b, 1, 1);
		b.setOnAction(this);


		pane.add(new Label("Guess Counter "), 0, 2);
		tf2 = new TextField();
		pane.add(tf2, 1, 2);
		l = new Label("you have 5 trials to win");
		pane.add(new Label("Hint:"), 0, 3);
		pane.add(l, 1, 3);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5);
		pane.setVgap(5);



		Scene s = new Scene(pane,400,400);
		primaryStage.setTitle("My Guess Game");
		primaryStage.setScene(s);
		primaryStage.show();

	}

	@Override
	public void handle(ActionEvent arg0) {
		if(arg0.getSource()==b && Counter!=5) {

			int number = Integer.parseInt(tf.getText().toString());
			if(number==secretnumber) {

				l.setText("yahoo you guess the number!! ");
				Counter++;
				tf2.setText(Counter+"");

			}
			else if(number>secretnumber) {

				l.setText("please try smaller number");	
				Counter++;
				tf2.setText(Counter+"");

			}

			else
			{
				l.setText("please try number bigger");
				Counter++;
				tf2.setText(Counter+"");

			}

			if(Counter==5) {
				l.setText("sorry you lose");
			}






		}


	}

}
