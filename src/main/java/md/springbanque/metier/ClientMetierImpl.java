package md.springbanque.metier;

import md.springbanque.Entity.Client;
import md.springbanque.dao.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by med on 12/12/16.
 */
@Service
public class ClientMetierImpl implements ClientMetier {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client saveClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public List<Client> listClient() {
        return clientRepository.findAll();
    }
}
