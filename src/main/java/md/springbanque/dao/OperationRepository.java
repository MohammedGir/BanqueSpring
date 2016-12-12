package md.springbanque.dao;

import md.springbanque.Entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by med on 12/12/16.
 */
public interface OperationRepository extends JpaRepository<Operation,Long> {
}
