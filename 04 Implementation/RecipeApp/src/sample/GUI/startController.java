package sample.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class startController {
    @FXML
    private ChoiceBox recipe;

    //Method that handles recipe choice click
    //Checks user value and returns the specific one.
    @FXML
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
        //FileWriter saving user recipe choice in valueLog.txt
        try {
            FileWriter fileWriter = new FileWriter("valueLog.txt", true);
            String value = recipe.getValue().toString();
            fileWriter.write("Recipe chosen: " + value + "\n");
            fileWriter.close();
            System.out.println("Succesfully saved data value");
        } catch (IOException e) {
            System.out.println("Error occured, data value safe failed");
            e.printStackTrace();
        }
    }
}
