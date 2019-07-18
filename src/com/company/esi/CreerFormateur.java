package com.company.esi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class CreerFormateur {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private DatePicker dateBirth;
    @FXML
    private Button btnValid;

    @FXML
    public void CreerFormateur (ActionEvent event) throws Exception{
        ESIQUIZ application = new ESIQUIZ();
        LocalDate ld = dateBirth.getValue();
        application.creerCompteFormateur(txtUsername.getText(), txtPassword.getText(), ld.toString());
        Stage stage = (Stage) btnValid.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("ESI QUIZ");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
