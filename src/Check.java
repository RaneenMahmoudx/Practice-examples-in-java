import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Check extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		CheckBox cb = new CheckBox("green");
		CheckBox cb1 = new CheckBox("red");
		CheckBox cb2 = new CheckBox("blue");
		
		RadioButton rb1 = new RadioButton("hi");
		RadioButton rb2 = new RadioButton("welcome");
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb2.setToggleGroup(tg);

		
		VBox vb = new VBox(cb,cb1,cb2,rb1,rb2);
		
		
		
		Scene s = new Scene(vb,300,300);
		primaryStage.setScene(s);
		primaryStage.show();

		
	}

}
