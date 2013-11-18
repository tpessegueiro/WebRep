/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author User
 */
@Embeddable
public class ProjectUserPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USER")
    private BigInteger idUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PROJECT")
    private BigInteger idProject;

    public ProjectUserPK() {
    }

    public ProjectUserPK(BigInteger idUser, BigInteger idProject) {
        this.idUser = idUser;
        this.idProject = idProject;
    }

    public BigInteger getIdUser() {
        return idUser;
    }

    public void setIdUser(BigInteger idUser) {
        this.idUser = idUser;
    }

    public BigInteger getIdProject() {
        return idProject;
    }

    public void setIdProject(BigInteger idProject) {
        this.idProject = idProject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        hash += (idProject != null ? idProject.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjectUserPK)) {
            return false;
        }
        ProjectUserPK other = (ProjectUserPK) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        if ((this.idProject == null && other.idProject != null) || (this.idProject != null && !this.idProject.equals(other.idProject))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.ProjectUserPK[ idUser=" + idUser + ", idProject=" + idProject + " ]";
    }
    
}
