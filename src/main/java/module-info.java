module com.example.malware {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;
    requires org.apache.logging.log4j;

    exports malware.server;
    opens malware.server to javafx.fxml;
    exports malware.client;
    opens malware.client to javafx.fxml;
    exports malware;
    opens malware to javafx.fxml;
}