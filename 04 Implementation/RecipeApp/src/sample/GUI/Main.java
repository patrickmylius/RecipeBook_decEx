package sample.GUI;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Persistence.FileReaderClass;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("start.fxml"));
        primaryStage.setTitle("Recipe Generator");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
