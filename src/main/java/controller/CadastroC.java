package controller;

import dao.ClientDAO;
import entities.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.Date;

public class CadastroC {
    @FXML
    TextField txtNome, txtLogin, txtPassword;
    @FXML
    Button exit,cadastro;
    public void btnCadastro(ActionEvent event){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();

        Client client = new Client();
        client.setNome(txtNome.getText().toString());
        client.setLogin(txtLogin.getText().toString());
        client.setSenha(txtPassword.getText().toString());
        client.setDatacadastro(new Date());

        //Chamar classe para DAO persistir no BD
        Long ContaCadastrada = ClientDAO.inserir(client).getConta();
        System.out.println("O número da conta cadastrada é: " + ContaCadastrada);
    }
    public void btnExit(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
        Stage stage = (Stage) exit.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

}



  /*public static Client pesquisar(Long conta){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        Client c = em.find(Client.class, conta);
        em.close();
        return c;
    }*/
   /* public static void atualizar(Client client){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.merge(client);
        em.close();
    }*/
    /*public static void excluir(Long conta){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        Client c = em.find(Client.class, conta);
        entityTransaction.begin();
        em.remove(c);
        entityTransaction.commit();
        em.close();
    }*/


