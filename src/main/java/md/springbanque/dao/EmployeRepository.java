package md.springbanque.dao;

import md.springbanque.Entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by med on 12/12/16.
 */
public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
