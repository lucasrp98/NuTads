package Banco;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

    private EntityManagerFactory emf;

    public Conexao() {
        this.emf = Persistence.createEntityManagerFactory("SistemaPU");
    }

    public EntityManagerFactory getConexao() {

        return this.emf;
    }
}
