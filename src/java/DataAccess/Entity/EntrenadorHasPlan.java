/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "entrenador_has_plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntrenadorHasPlan.findAll", query = "SELECT e FROM EntrenadorHasPlan e"),
    @NamedQuery(name = "EntrenadorHasPlan.findById", query = "SELECT e FROM EntrenadorHasPlan e WHERE e.id = :id")})
public class EntrenadorHasPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "Entrenador_documento", referencedColumnName = "documento")
    @ManyToOne(optional = false)
    private Entrenador entrenadordocumento;
    @JoinColumn(name = "PlanEntrenamiento_numPlan", referencedColumnName = "numPlan")
    @ManyToOne(optional = false)
    private Planentrenamiento planEntrenamientonumPlan;

    public EntrenadorHasPlan() {
    }

    public EntrenadorHasPlan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Entrenador getEntrenadordocumento() {
        return entrenadordocumento;
    }

    public void setEntrenadordocumento(Entrenador entrenadordocumento) {
        this.entrenadordocumento = entrenadordocumento;
    }

    public Planentrenamiento getPlanEntrenamientonumPlan() {
        return planEntrenamientonumPlan;
    }

    public void setPlanEntrenamientonumPlan(Planentrenamiento planEntrenamientonumPlan) {
        this.planEntrenamientonumPlan = planEntrenamientonumPlan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntrenadorHasPlan)) {
            return false;
        }
        EntrenadorHasPlan other = (EntrenadorHasPlan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataAccess.Entity.EntrenadorHasPlan[ id=" + id + " ]";
    }
    
}
