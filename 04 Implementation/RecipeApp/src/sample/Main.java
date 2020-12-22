package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** ******************************************************************************************************
 *   1. Semester exam                                                                                    *
 *   Creating recipe app, holding 3 recipes                                                              *
 *   1. Burger                                                                                           *
 *   2. Pizza                                                                                            *
 *   3. Tomato Soup                                                                                      *
 *                                                                                                       *
 *  Using fxml files to create UI                                                                        *
 *  Using startController to manage button click.                                                        *
 *  Implemented persistence inside GUI, sadly. Was ment to split apart and kept in persistence package.  *
 *                                                                                                       *
 *                                                                                                       *
 * *******************************************************************************************************/


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
