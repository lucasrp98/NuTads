package Entidades;

import Banco.Conexao;
import Controladores.ContaComumJpaController;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ContaComum extends Conta implements Serializable, Transferencia {
    

    public ContaComum() {

    }

    public ContaComum(String nome, String CPF, String telefone, Double salario, String email, String senha) {
        super(nome, CPF, telefone, salario, email, senha);

    }

    public ContaComum(Double saldo) {
        super(saldo);
    }

    public void TED() {
        this.saldo = (this.saldo * 0.1);
    }

    public void atualizaSaldo() {
        Conexao conexao = new Conexao();
        ContaComumJpaController comumController = new ContaComumJpaController(conexao.getConexao());
        try {
            comumController.edit(this);
        } catch (Exception ex) {
            Logger.getLogger(ContaComum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean Transferir(double valor) {
        if (valor <= this.saldo && valor <= 1000) {
            this.saldo -= valor;
            this.TED();
            atualizaSaldo();
            saidaValor(valor);
            return true; 
        } else {
            return false;
        }
    }

    public boolean PIX(double valor) {
        if (valor <= this.saldo && valor <= 1000) {
            this.saldo -= valor;
            atualizaSaldo();
            saidaValor(valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        atualizaSaldo();
        entradaValor(valor);
    }

}
