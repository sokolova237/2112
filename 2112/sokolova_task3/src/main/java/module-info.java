module ru.sokolova.sokolova_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_task3 to javafx.fxml;
    exports ru.sokolova.sokolova_task3;
}