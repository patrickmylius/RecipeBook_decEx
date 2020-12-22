/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 22-12-2020
 */
package sample.Persistence;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.io.*;

public class FileReaderClass extends LogDate {
    @FXML
    private ChoiceBox recipe;

    void fileReader() {
        try {
            FileWriter fileWriter = new FileWriter("valueLog.txt", true);
            String value = recipe.getValue().toString();
            fileWriter.write("Recipe chosen: " + value + " | " + "Date: " + dateTime + "\n");
            fileWriter.close();
            System.out.println("Succesfully saved data value");
        } catch (IOException e) {
            System.out.println("Error occured, data value safe failed");
            e.printStackTrace();
        }
    }

}
