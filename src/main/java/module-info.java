module com.example.locationcenter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.locationcenter to javafx.fxml;
    exports com.example.locationcenter;
}