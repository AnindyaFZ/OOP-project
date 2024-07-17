module com.anindya.library_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anindya.library_management to javafx.fxml;
    exports com.anindya.library_management;
}