package md.springbanque.metier;

import md.springbanque.Entity.Employe;

import java.util.List;

/**
 * Created by med on 12/12/16.
 */
public interface EmployeMetier {
    public Employe saveEmploye(Employe emp);
    public List<Employe> listEmploye();
}
