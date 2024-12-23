module ru.sokolova.sokolova_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.sokolova.sokolova_task5 to javafx.fxml;
    exports ru.sokolova.sokolova_task5;
}