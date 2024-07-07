module com.anindya.bazarlist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anindya.bazarlist to javafx.fxml;
    exports com.anindya.bazarlist;
}