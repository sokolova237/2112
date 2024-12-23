module ru.sokolova.sokolova_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_task1 to javafx.fxml;
    exports ru.sokolova.sokolova_task1;
}