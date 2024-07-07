package com.anindya.bazarlist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class BazarController
{
    @javafx.fxml.FXML
    private TableView productTableView;
    @javafx.fxml.FXML
    private TableColumn productNameTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> materialComboBox;
    @javafx.fxml.FXML
    private TableColumn idTableColumn;
    @javafx.fxml.FXML
    private TextField productIdTextField;
    @javafx.fxml.FXML
    private TextField productnameTextField;
    @javafx.fxml.FXML
    private TableColumn quantityTableColumn;
    @javafx.fxml.FXML
    private TableColumn materialTableColumn;
    @javafx.fxml.FXML
    private DatePicker deliverydateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<Integer> quantityComboBox;
    ArrayList<Product>product=new ArrayList<Product>();

    @javafx.fxml.FXML
    public void initialize() {
        quantityComboBox.getItems().addAll(1,2,3,4,5);
        materialComboBox.getItems().addAll("Wood","Metal","Board","Cloth","Other");
        productNameTableColumn.setCellValueFactory(new PropertyValueFactory<Product,String>("Pname"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<Product,Integer>("id"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<Product,Integer>("quantity"));
        materialTableColumn.setCellValueFactory(new PropertyValueFactory<Product,String>("material"));
    }

    @javafx.fxml.FXML
    public void addproductOnActionButton(ActionEvent actionEvent) {
        String pname=productnameTextField.getText();
        String material=materialComboBox.getValue();
        int quantity=quantityComboBox.getValue();
        int id=Integer.parseInt(productIdTextField.getText());
        LocalDate date=deliverydateDatePicker.getValue();
        Product berhoise=new Product(pname,material,id,quantity,date);
        productTableView.getItems().add(berhoise);







    }
}