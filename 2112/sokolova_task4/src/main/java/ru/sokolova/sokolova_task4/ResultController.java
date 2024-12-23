package ru.sokolova.sokolova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private Label Otvet;

    @FXML
    private TextField NTextField;

    @FXML
    void OnAction(ActionEvent event) {
        int n = Integer.parseInt(NTextField.getText().toString());
        if (n <= 0){
            Otvet.setText("N должно быть больше 0");
        }
        double factorial = 1;
        for (int i = 2; i <= n; i++){
            factorial *= i;
        }
        Otvet.setText("" +factorial);
    }
}
