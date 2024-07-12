module com.anindya.tabledemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anindya.tabledemo to javafx.fxml;
    exports com.anindya.tabledemo;
}