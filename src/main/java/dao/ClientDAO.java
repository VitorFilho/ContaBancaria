package dao;

import entities.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
    public static Client inserir(Client client){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.persist(client);
        entityTransaction.commit();
        return client;
    }
    /*public static List<Client> listAll(){
        EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        Client c = em.find(Client.class, conta);
        ArrayList<Client> listClient = new ArrayList<Client>();
        while(){
            Client u = new Client();
            u.setConta(c.getConta());
            u.setLogin(c.getLogin());
            u.setSenha(c.getSenha());
        }
        em.close();
        return listClient;
    }*/
}
