module org.example.module9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.module9 to javafx.fxml;
    exports org.example.module9;
}