package md.springbanque.service;

import md.springbanque.Entity.Employe;
import md.springbanque.metier.EmployeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by med on 12/12/16.
 */
@RestController
public class EmployeRestService {
    @Autowired
    private EmployeMetier employeMetier;
    @RequestMapping(value = "/employes", method = RequestMethod.POST)
    public Employe saveEmploye(@RequestBody Employe emp) {
        return employeMetier.saveEmploye(emp);

    }
    @RequestMapping(value = "/employes", method = RequestMethod.GET)
    public List<Employe> listEmploye() {
        return employeMetier.listEmploye();
    }
}
