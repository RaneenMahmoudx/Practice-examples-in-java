import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class combo extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 ComboBox cb = new ComboBox();
		 cb.getItems().add("c1");
		 cb.getItems().add("c2");
		 cb.getItems().add("c3");
		 
		 HBox hb = new HBox(cb);
		 
		 Scene s = new Scene(hb,300,300);
		 primaryStage.setScene(s);
		 primaryStage.show();

		
	}

}
