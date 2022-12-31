package Banco;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Banco {

    public EntityManagerFactory getConexao() {
        return Persistence.createEntityManagerFactory("SistemaPu");
    }
}
