package md.springbanque.metier;

import md.springbanque.Entity.Employe;
import md.springbanque.dao.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by med on 12/12/16.
 */
@Service
public class EmployeMetierImpl implements EmployeMetier {
    @Autowired
    private EmployeRepository employeRepository;
    @Override
    public Employe saveEmploye(Employe emp) {
        return employeRepository.save(emp);
    }

    @Override
    public List<Employe> listEmploye() {
        return employeRepository.findAll();
    }
}
