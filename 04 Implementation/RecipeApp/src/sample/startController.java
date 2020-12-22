package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

/**
 * *****************************************************************************************************
 * 1. Semester exam                                                                                    *
 * Creating recipe app, holding 3 recipes                                                              *
 * 1. Burger                                                                                           *
 * 2. Pizza                                                                                            *
 * 3. Tomato Soup                                                                                      *
 * *
 * Using fxml files to create UI                                                                        *
 * Using startController to manage button click.                                                        *
 * Implemented persistence inside GUI, sadly. Was ment to split apart and kept in persistence package.  *
 * *
 * *
 *******************************************************************************************************/

public class startController {
    @FXML
    private ChoiceBox recipe;
    @FXML
    private Text errorText;

    //Method that handles recipe choice click
    //Checks user value and returns the specific one.
    @FXML
    public void handleRecipes(ActionEvent event) throws Exception {
        try {
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
        } catch (NullPointerException n) {
            errorText.setText("Please choice a recipe");
            errorText.setVisible(true);
        }

        //FileWriter saving user recipe choice in valueLog.txt proof of persistence
        try {
            FileWriter fileWriter = new FileWriter("valueLog.txt", true);
            String value = recipe.getValue().toString();
            fileWriter.write("Recipe chosen: " + value + "\n");
            fileWriter.close();
            System.out.println("Succesfully saved data value");
        } catch (IOException e) {
            System.out.println("Error occured, data value safe failed");
            e.printStackTrace();
        } catch (NullPointerException n) {
            System.out.println("No value exists");
        }
    }

    //Fast way to reset the window, setting current value to null, clears Container choice.
    public void reset(ActionEvent event) throws Exception {
        recipe.setValue(null);
        errorText.setText(null);
    }
}
