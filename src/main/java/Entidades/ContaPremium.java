package Entidades;

import Banco.Conexao;
import Controladores.ContaComumJpaController;
import Controladores.ContaPremiumJpaController;
import Entidades.ContaComum;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ContaPremium extends Conta implements Transferencia {

    private double limite;    

    public ContaPremium() {

    }

    public ContaPremium(String nome, String CPF, String telefone, Double salario, String email, String senha) {
        super(nome, CPF, telefone, salario, email, senha);
    }
    
    public ContaPremium(Double saldo) {
        super(saldo);
    }

    public boolean Limite() {
        if (this.salario <= 10000) {
            this.limite = salario + (this.salario * 0.1);
        } else {
            this.limite = salario + (this.salario * 0.5);
        }
        return true;
    }

    public void TED() {
        this.saldo = (this.saldo * 0.2);
    }

    public void atualizaSaldo() {
        Conexao conexao = new Conexao();
        ContaPremiumJpaController premiumController = new ContaPremiumJpaController(conexao.getConexao());
        try {
            premiumController.edit(this);
        } catch (Exception ex) {
            Logger.getLogger(ContaPremium.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean Transferir(double valor) {
        if (valor <= this.saldo && valor <= 5000) {
            this.saldo -= valor;
            this.TED();
            atualizaSaldo();
//            saidaValor(valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean PIX(double valor) {
        if (valor <= this.saldo && valor <= 5000) {
            this.saldo -= valor;
            atualizaSaldo();
//            saidaValor(valor);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        atualizaSaldo();
//        entradaValor(valor);     
    }
}
