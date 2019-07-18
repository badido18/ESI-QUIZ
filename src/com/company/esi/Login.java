package com.company.esi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login {
    @FXML
    private Label lblStatut;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private Button btnLogin;

    @FXML
    public void loginFormateur (ActionEvent event) throws Exception{
        ESIQUIZ application = new ESIQUIZ();
        application.seConecter(txtUsername.getText(), txtPassword.getText(), 1);
        Formateur f = (Formateur) application.compteConnecte;
        if (txtUsername.getText().equals("Formateur") && txtPassword.getText().equals("Formateur")){
            Stage stage = (Stage) btnLogin.getScene().getWindow();
            stage.close();
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("EcranFormateur.fxml"));
            primaryStage.setTitle("ESI QUIZ");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.show();

        }else{
            lblStatut.setText("Nom d'utilisateur ou mot de passe incorrect");
        }
    }

    public void CreerFormateur (ActionEvent event) throws Exception{
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CreerFormateur.fxml"));
        primaryStage.setTitle("ESI QUIZ");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
