import javafx.application.Application;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HelloController controller = new HelloController();
        controller.start(primaryStage);
    }
}