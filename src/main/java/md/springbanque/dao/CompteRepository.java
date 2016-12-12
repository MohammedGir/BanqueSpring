package md.springbanque.dao;

import md.springbanque.Entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by med on 12/12/16.
 */
public interface CompteRepository extends JpaRepository<Compte, String> {
}
