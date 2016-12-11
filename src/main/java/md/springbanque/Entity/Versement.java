package md.springbanque.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by med on 21/11/16.
 */
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {
}
