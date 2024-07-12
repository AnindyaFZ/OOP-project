package com.anindya.tabledemo;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Demotablecontroller
{
    @javafx.fxml.FXML
    private TableColumn idTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student,String> nameTableColumn;
    @javafx.fxml.FXML
    private TextField cgpaTextField;
    @javafx.fxml.FXML
    private TextField departmentTextField;
    @javafx.fxml.FXML
    private TextField yearTextField;
    @javafx.fxml.FXML
    private TableColumn yearTableColumn;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableView studTableView;
    @javafx.fxml.FXML
    private TableColumn<Student,Float> cgpaTableColumn;
    @javafx.fxml.FXML
    private TableColumn deptTableColumn;
    @javafx.fxml.FXML
    private TextField idTextField;
    ArrayList<Student>studentarraylist=new ArrayList<Student>();

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("Name"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<Student,Integer>("ID"));
        cgpaTableColumn.setCellValueFactory(new PropertyValueFactory<Student,Float>("CGPA"));
        deptTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("Dept"));
        yearTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("Year"));



    }

    @javafx.fxml.FXML
    public void addstudentOnAction(ActionEvent actionEvent) {
        String name=nameTextField.getText();
        int id=Integer.parseInt(idTextField.getText());
        String department= departmentTextField.getText();
        String year= yearTextField.getText();
        Float cgpa=Float.parseFloat(cgpaTextField.getText());
        Student stud=new Student(name,department,year,cgpa,id); //sequence
        studentarraylist.add(stud);
        studTableView.getItems().add(stud);





    }

    @javafx.fxml.FXML
    public void sorttableButton(ActionEvent actionEvent) {
        studTableView.getItems().clear();
        for (int i=0; i<studentarraylist.size();i++){
            float cg= studentarraylist.get(i).getCGPA();
            if(cg>3.5){
                studTableView.getItems().add(studentarraylist.get(i));



            }



        }





    }
}