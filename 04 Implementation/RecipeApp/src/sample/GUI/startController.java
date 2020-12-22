package sample.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class startController {

    public void handleRecipes(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("recipes.fxml"));
        Stage showRecipe = fxmlLoader.load();
        showRecipe.initModality(Modality.APPLICATION_MODAL); //Locks primaryStage
        showRecipe.show();

    }
}
