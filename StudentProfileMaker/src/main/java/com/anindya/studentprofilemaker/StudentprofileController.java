package com.anindya.studentprofilemaker;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class StudentprofileController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private ComboBox<String> nationalityComboBox;
    @javafx.fxml.FXML
    private TextArea displayTextArea;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private TextField nameTexField;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        nationalityComboBox.getItems().addAll("Bangladeshi","Indian","Pakistani");
        ToggleGroup toggleGroup=new ToggleGroup();
        maleRadioButton.setToggleGroup(toggleGroup);
        femaleRadioButton.setToggleGroup(toggleGroup);


    }

    @javafx.fxml.FXML
    public void createProfileOnAction(ActionEvent actionEvent) {
        String name=nameTexField.getText();
        String id=idTextField.getText();
        String dob=dobDatePicker.getValue().toString(); //method chaining
        String nationality=nationalityComboBox.getValue();
        String gender;
        if (maleRadioButton.isSelected()){
            gender="Male";
        }
        else{
            gender="Female";
        }

        Student student=new Student(name,id,dob,nationality,gender);

        displayTextArea.setText(student.toString());


    }
}