module com.example.malware {
    requires javafx.controls;
    requires javafx.fxml;

    exports malware;
    opens malware to javafx.fxml;
}