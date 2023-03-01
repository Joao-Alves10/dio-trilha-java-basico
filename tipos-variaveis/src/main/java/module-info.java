module com.example.tiposvariaveis {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tiposvariaveis to javafx.fxml;
    exports com.example.tiposvariaveis;
}