package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client")
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conta;
    private String nome;
    private int nrcartao;
    private String login;
    private String senha;
    private Double saldo;
    private Date datacadastro;

    //private byte [] imagem;

    //contrutor padrão
    public Client() {
    }

    public Client(String nome, int nrcartao, String login, String senha, Double saldo, Date datacadastro) {
        this.nome = nome;
        this.nrcartao = nrcartao;
        this.login = login;
        this.senha = senha;
        this.saldo = saldo;
        this.datacadastro = datacadastro;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrcartao() {
        return nrcartao;
    }

    public void setNrcartao(int nrcartao) {
        this.nrcartao = nrcartao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }
}