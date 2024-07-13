module com.anindya.studentprofilemaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anindya.studentprofilemaker to javafx.fxml;
    exports com.anindya.studentprofilemaker;
}