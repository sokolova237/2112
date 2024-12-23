module ru.sokolova.sokolova_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_task2 to javafx.fxml;
    exports ru.sokolova.sokolova_task2;
}