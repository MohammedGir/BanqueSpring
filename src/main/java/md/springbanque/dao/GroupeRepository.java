package md.springbanque.dao;

import md.springbanque.Entity.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by med on 12/12/16.
 */
public interface GroupeRepository extends JpaRepository<Groupe, Long> {
}
