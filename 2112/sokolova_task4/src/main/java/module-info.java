module ru.sokolova.sokolova_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_task4 to javafx.fxml;
    exports ru.sokolova.sokolova_task4;
}