package sample.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class startController {
    @FXML
    private ChoiceBox recipe;

    public void handleRecipes(ActionEvent event) throws Exception {
        String recipeChoice = (String) recipe.getValue();
        switch (recipeChoice.toLowerCase()) {
            case "burger":
                FXMLLoader fxmlLoaderBurger = new FXMLLoader(getClass().getResource("showRecipeBurger.fxml"));
                Stage showBurger = fxmlLoaderBurger.load();
                showBurger.initModality(Modality.APPLICATION_MODAL); //Locks primaryStage
                showBurger.show();
                break;
            case "pizza":
                FXMLLoader fxmlLoaderPizza = new FXMLLoader(getClass().getResource("showRecipePizza.fxml"));
                Stage showPizza = fxmlLoaderPizza.load();
                showPizza.initModality(Modality.APPLICATION_MODAL); //Locks primaryStage
                showPizza.show();
                break;
            case "tomato soup":
                FXMLLoader fxmlLoaderTomatoSoup = new FXMLLoader(getClass().getResource("showRecipeTomatoSoup.fxml"));
                Stage showSoup = fxmlLoaderTomatoSoup.load();
                showSoup.initModality(Modality.APPLICATION_MODAL); //Locks primaryStage
                showSoup.show();

        }

    }
}
