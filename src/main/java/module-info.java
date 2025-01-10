module com.example.tp8_exercice1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.apache.poi.ooxml;

    opens com.example.tp8_exercice1 to javafx.fxml;
    exports com.example.tp8_exercice1;
}