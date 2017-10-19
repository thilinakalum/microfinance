/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thilina Kalum
 */
@Entity
@Table(name = "interest_rate", catalog = "micro_finance", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InterestRate.findAll", query = "SELECT i FROM InterestRate i")
    , @NamedQuery(name = "InterestRate.findById", query = "SELECT i FROM InterestRate i WHERE i.id = :id")
    , @NamedQuery(name = "InterestRate.findByDate", query = "SELECT i FROM InterestRate i WHERE i.date = :date")
    , @NamedQuery(name = "InterestRate.findByRate", query = "SELECT i FROM InterestRate i WHERE i.rate = :rate")})
public class InterestRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private Integer rate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "interestRate", fetch = FetchType.EAGER)
    private List<Loan> loanList;

    public InterestRate() {
    }

    public InterestRate(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @XmlTransient
    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
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
        if (!(object instanceof InterestRate)) {
            return false;
        }
        InterestRate other = (InterestRate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.InterestRate[ id=" + id + " ]";
    }
    
}
