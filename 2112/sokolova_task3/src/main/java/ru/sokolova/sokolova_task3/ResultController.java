package ru.sokolova.sokolova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label Otvet;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    void OnAction(ActionEvent event) {
        int a = Integer.parseInt(aTextField.getText().toString());
        int b = Integer.parseInt(bTextField.getText().toString());
        if (a>=b){
            Otvet.setText("A должно быть меньше B");
            return;
        }
        int sum = 0;
        for (int i = a; i<=b; i++){
            sum += i * i;
        }
        Otvet.setText("" +sum);
    }
}
