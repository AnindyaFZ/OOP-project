package com.anindya.library_management;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class LibraryManagementController
{
    @javafx.fxml.FXML
    private Label totalcopyLabel;
    @javafx.fxml.FXML
    private Label booknameLabel;
    @javafx.fxml.FXML
    private Label authornameLabel;
    @javafx.fxml.FXML
    private Label publicationLabel;
    @javafx.fxml.FXML
    private Label totalborrowedLabel;
    @javafx.fxml.FXML
    private CheckBox YesCheckBox;
    @javafx.fxml.FXML
    private Label membertypeLabel;
    @javafx.fxml.FXML
    private ComboBox membershipidComboBox;
    @javafx.fxml.FXML
    private Label totalmemberLabel;
    @javafx.fxml.FXML
    private ComboBox bookidComboBox;
    @javafx.fxml.FXML
    private RadioButton adultRadiobutton;
    @javafx.fxml.FXML
    private RadioButton childrenRadiobutton;
    @javafx.fxml.FXML
    private Label membernameLabel;
    @javafx.fxml.FXML
    private Label totalbookborrowedLabel;
    ToggleGroup tg=new ToggleGroup();
    @javafx.fxml.FXML
    public void initialize() {
        childrenRadiobutton.setToggleGroup(tg);
        adultRadiobutton.setToggleGroup(tg);





    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void borrowedbookButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void bookidComboBoxOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void membershipidComboBoxOnAction(ActionEvent actionEvent) {
    }
}