package md.springbanque.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by med on 21/11/16.
 */
@Entity
public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeEmploye;
    private String nomEmploye;
    @ManyToOne
    @JoinColumn(name="CODE_EMP_SUP")
    private Employe employeSup;
    @ManyToMany
    @JoinTable(name="EMP_GR")
    private Collection<Groupe> groupes;

    public Employe(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }
    @JsonIgnore
    public Employe getEmployeSup() {
        return employeSup;
    }
    @JsonSetter
    public void setEmployeSup(Employe employeSup) {
        this.employeSup = employeSup;
    }

    public Employe() {

    }

    public Long getCodeEmploye() {
        return codeEmploye;
    }

    public void setCodeEmploye(Long codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    @JsonIgnore
    public Collection<Groupe> getGroupes() {
        return groupes;
    }
    @JsonSetter
    public void setGroupes(Collection<Groupe> groupes) {
        this.groupes = groupes;
    }
}
