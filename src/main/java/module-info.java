module com.example.malware {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;

    exports malware.server;
    opens malware.server to javafx.fxml;
    exports malware.client;
    opens malware.client to javafx.fxml;
}