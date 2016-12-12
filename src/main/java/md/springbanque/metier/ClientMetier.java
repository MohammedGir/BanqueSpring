package md.springbanque.metier;

import md.springbanque.Entity.Client;

import java.util.List;

/**
 * Created by med on 12/12/16.
 */
public interface ClientMetier {
    public Client saveClient(Client c);
    public List<Client> listClient();
}
