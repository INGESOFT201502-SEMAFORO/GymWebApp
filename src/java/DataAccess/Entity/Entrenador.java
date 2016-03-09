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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "entrenador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrenador.findAll", query = "SELECT e FROM Entrenador e"),
    @NamedQuery(name = "Entrenador.findByDocumento", query = "SELECT e FROM Entrenador e WHERE e.documento = :documento"),
    @NamedQuery(name = "Entrenador.findByNombre", query = "SELECT e FROM Entrenador e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Entrenador.findBySalario", query = "SELECT e FROM Entrenador e WHERE e.salario = :salario")})
public class Entrenador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "documento")
    private Long documento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "salario")
    private double salario;
    @JoinColumn(name = "usuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entrenadordocumento")
    private Collection<EntrenadorHasPlan> entrenadorHasPlanCollection;

    public Entrenador() {
    }

    public Entrenador(Long documento) {
        this.documento = documento;
    }

    public Entrenador(Long documento, String nombre, double salario) {
        this.documento = documento;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        hash += (documento != null ? documento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrenador)) {
            return false;
        }
        Entrenador other = (Entrenador) object;
        if ((this.documento == null && other.documento != null) || (this.documento != null && !this.documento.equals(other.documento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataAccess.Entity.Entrenador[ documento=" + documento + " ]";
    }
    
}
