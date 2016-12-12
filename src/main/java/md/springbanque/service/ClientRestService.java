package md.springbanque.service;

import md.springbanque.Entity.Client;
import md.springbanque.metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by med on 12/12/16.
 */
@RestController
public class ClientRestService {
    @Autowired
    private ClientMetier clientMetier;

@RequestMapping(value = "/clients", method = RequestMethod.POST)
@ResponseBody
    public Client saveClient(@RequestBody Client c) {
        return clientMetier.saveClient(c);
    }
    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public List<Client> listClient() {
        return clientMetier.listClient();
    }


}
