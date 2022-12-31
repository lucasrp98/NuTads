package Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Conta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String CPF;
    private String telefone;
    protected double salario;
    protected double saldo;
    private String email;
    private String senha;
    boolean teste;
    private List <Double> entrada;
    private List <Double> saida;

    public Conta() {

    }

    public boolean tipoConta() {

        if (this.salario <= 5000) {
            return true;
        }
        return false;
    }

    public Conta(String nome, String CPF, String telefone, Double salario, String email, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.salario = salario;
        this.email = email;
        this.senha = senha;
        this.entrada = new ArrayList<Double>();
        this.saida = new ArrayList<Double>();
    }

    public Conta(Double saldo) {
        this.saldo = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        entradaValor(valor);  
    }
    
    public List<Double> getEntrada() {
        return entrada;
    }
    
    public List<Double> getSaida() {
        return saida;
    }
    
    public void entradaValor(double valor) {
        this.entrada.add(valor);
    }
    
    public void saidaValor(double valor) {
        this.saida.add(valor);
    }
}
