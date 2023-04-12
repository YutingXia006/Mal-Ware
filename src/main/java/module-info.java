module com.example.malware {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.malware to javafx.fxml;
    exports com.example.malware;
}