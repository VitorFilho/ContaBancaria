package controller;

import dao.ClientDAO;
import entities.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.List;


public class MainController {
    @FXML
    TextField txtPassword,texLogin;
    @FXML
    Button pass;
    //onAction para Login
    public void btnLogin(ActionEvent event) throws IOException {
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        PreparedStatement stmt;
        /*List<Client> userList = ClientDAO.listAll();
        String Login = texLogin.getText().toString();
        String password = txtPassword.getText().toString();
        for (Client u : userList){
          if(Login.equals(u.getLogin()) && password.equals(u.getSenha())){
              Stage stage = new Stage();
              Parent root =FXMLLoader.load(getClass().getResource("/fxml/"));

          }
        }*/

    }



    public void btnPass(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/cadastro.fxml"));
        Stage stage = (Stage) pass.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

    public void btnLimpar(ActionEvent event) {
        texLogin.setText("");
        txtPassword.setText("");
    }
}

