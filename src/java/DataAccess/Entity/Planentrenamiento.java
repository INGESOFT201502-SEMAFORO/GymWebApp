/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "planentrenamiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planentrenamiento.findAll", query = "SELECT p FROM Planentrenamiento p"),
    @NamedQuery(name = "Planentrenamiento.findByNumPlan", query = "SELECT p FROM Planentrenamiento p WHERE p.numPlan = :numPlan"),
    @NamedQuery(name = "Planentrenamiento.findByNombre", query = "SELECT p FROM Planentrenamiento p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Planentrenamiento.findByCosto", query = "SELECT p FROM Planentrenamiento p WHERE p.costo = :costo")})
public class Planentrenamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numPlan")
    private Integer numPlan;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Size(max = 65535)
    @Column(name = "instrucciones")
    private String instrucciones;
    @Column(name = "costo")
    private Long costo;
    @OneToMany(mappedBy = "numPlan")
    private Collection<Inscripcion> inscripcionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planEntrenamientonumPlan")
    private Collection<EntrenadorHasPlan> entrenadorHasPlanCollection;

    public Planentrenamiento() {
    }

    public Planentrenamiento(Integer numPlan) {
        this.numPlan = numPlan;
    }

    public Integer getNumPlan() {
        return numPlan;
    }

    public void setNumPlan(Integer numPlan) {
        this.numPlan = numPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Long getCosto() {
        return costo;
    }

    public void setCosto(Long costo) {
        this.costo = costo;
    }

    @XmlTransient
    public Collection<Inscripcion> getInscripcionCollection() {
        return inscripcionCollection;
    }

    public void setInscripcionCollection(Collection<Inscripcion> inscripcionCollection) {
        this.inscripcionCollection = inscripcionCollection;
    }

    @XmlTransient
    public Collection<EntrenadorHasPlan> getEntrenadorHasPlanCollection() {
        return entrenadorHasPlanCollection;
    }

    public void setEntrenadorHasPlanCollection(Collection<EntrenadorHasPlan> entrenadorHasPlanCollection) {
        this.entrenadorHasPlanCollection = entrenadorHasPlanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numPlan != null ? numPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planentrenamiento)) {
            return false;
        }
        Planentrenamiento other = (Planentrenamiento) object;
        if ((this.numPlan == null && other.numPlan != null) || (this.numPlan != null && !this.numPlan.equals(other.numPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataAccess.Entity.Planentrenamiento[ numPlan=" + numPlan + " ]";
    }
    
}
