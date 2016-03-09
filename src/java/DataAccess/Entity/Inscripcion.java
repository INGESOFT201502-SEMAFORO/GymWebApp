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
@Table(name = "inscripcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i"),
    @NamedQuery(name = "Inscripcion.findByNumInscripcion", query = "SELECT i FROM Inscripcion i WHERE i.numInscripcion = :numInscripcion")})
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numInscripcion")
    private Integer numInscripcion;
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne
    private Cliente documento;
    @JoinColumn(name = "numPlan", referencedColumnName = "numPlan")
    @ManyToOne
    private Planentrenamiento numPlan;

    public Inscripcion() {
    }

    public Inscripcion(Integer numInscripcion) {
        this.numInscripcion = numInscripcion;
    }

    public Integer getNumInscripcion() {
        return numInscripcion;
    }

    public void setNumInscripcion(Integer numInscripcion) {
        this.numInscripcion = numInscripcion;
    }

    public Cliente getDocumento() {
        return documento;
    }

    public void setDocumento(Cliente documento) {
        this.documento = documento;
    }

    public Planentrenamiento getNumPlan() {
        return numPlan;
    }

    public void setNumPlan(Planentrenamiento numPlan) {
        this.numPlan = numPlan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numInscripcion != null ? numInscripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.numInscripcion == null && other.numInscripcion != null) || (this.numInscripcion != null && !this.numInscripcion.equals(other.numInscripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataAccess.Entity.Inscripcion[ numInscripcion=" + numInscripcion + " ]";
    }
    
}
