import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Clique aqui...");
        btn.setOnAction(e -> System.out.println("Foi aqui que clicou..."));

        StackPane root = new StackPane(btn);

        Scene scene = new Scene(root);
        primaryStage.setTitle("ADS - AGES");
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
