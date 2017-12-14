package vt.smt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene scene = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Статическое электрическое поле");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icons/icon64.png")));
        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/styles/violet.css").toExternalForm());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
