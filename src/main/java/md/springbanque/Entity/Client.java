package md.springbanque.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by med on 21/11/16.
 */
@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeClient;
    private String nomClient;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private Collection<Compte> comptes;

    public Client() {
    }

    public Client(String nomClient) {
        this.nomClient = nomClient;
    }

    public Long getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(Long codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }
}
