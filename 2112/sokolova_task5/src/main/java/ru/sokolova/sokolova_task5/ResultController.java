package ru.sokolova.sokolova_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

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
        double[] a = new double[n + 1];
        double[] b = new double[n + 1];
        a[1]=1;
        b[1]=1;
        double sum = 0;
        for (int k = 2; k <= n; k++){
            a[k]= 0.5 * (sqrt(b[k-1]) + 0.5 * sqrt(a[k-1]));
            b[k]= 2 * pow(a[k-1],2) + b[k-1];
            sum += a[k]*b[k];
        }
        sum += a[1] * b[1];
        Otvet.setText(String.format("n=%.2f",sum));
    }
}
