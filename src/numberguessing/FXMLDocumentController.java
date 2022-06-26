/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessing;

import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author John
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField winsBox, guessBox, enterNumberBox;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        int numberEntered = parseInt(enterNumberBox.getText());
        int wins = parseInt(winsBox.getText());
        int guesses = parseInt(guessBox.getText());
        Random rand = new Random();
        int i = rand.nextInt(10) + 1;
        System.out.println(i);
        if (numberEntered == i){
            wins += 1;
        }
        guesses += 1;
        winsBox.setText(String.valueOf(wins));
        guessBox.setText(String.valueOf(guesses));
    }
    
    @FXML
    private void handleClearButtonAction(ActionEvent event){
        winsBox.setText("0");
        guessBox.setText("0");
        enterNumberBox.clear();
    }
    
    @FXML
    private void handleCloseButtonAction(ActionEvent event){
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
