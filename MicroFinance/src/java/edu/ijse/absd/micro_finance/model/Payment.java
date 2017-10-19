/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thilina Kalum
 */
@Entity
@Table(catalog = "micro_finance", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p")
    , @NamedQuery(name = "Payment.findById", query = "SELECT p FROM Payment p WHERE p.id = :id")
    , @NamedQuery(name = "Payment.findByTotal", query = "SELECT p FROM Payment p WHERE p.total = :total")
    , @NamedQuery(name = "Payment.findByCashTotal", query = "SELECT p FROM Payment p WHERE p.cashTotal = :cashTotal")
    , @NamedQuery(name = "Payment.findByCardTotal", query = "SELECT p FROM Payment p WHERE p.cardTotal = :cardTotal")
    , @NamedQuery(name = "Payment.findByChequeTotal", query = "SELECT p FROM Payment p WHERE p.chequeTotal = :chequeTotal")})
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 10, scale = 2)
    private BigDecimal total;
    @Column(name = "cash_total", precision = 10, scale = 2)
    private BigDecimal cashTotal;
    @Column(name = "card_total", precision = 10, scale = 2)
    private BigDecimal cardTotal;
    @Column(name = "cheque_total", precision = 10, scale = 2)
    private BigDecimal chequeTotal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentId", fetch = FetchType.EAGER)
    private List<PaymentDetail> paymentDetailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payment", fetch = FetchType.EAGER)
    private List<PaymentInformation> paymentInformationList;

    public Payment() {
    }

    public Payment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getCashTotal() {
        return cashTotal;
    }

    public void setCashTotal(BigDecimal cashTotal) {
        this.cashTotal = cashTotal;
    }

    public BigDecimal getCardTotal() {
        return cardTotal;
    }

    public void setCardTotal(BigDecimal cardTotal) {
        this.cardTotal = cardTotal;
    }

    public BigDecimal getChequeTotal() {
        return chequeTotal;
    }

    public void setChequeTotal(BigDecimal chequeTotal) {
        this.chequeTotal = chequeTotal;
    }

    @XmlTransient
    public List<PaymentDetail> getPaymentDetailList() {
        return paymentDetailList;
    }

    public void setPaymentDetailList(List<PaymentDetail> paymentDetailList) {
        this.paymentDetailList = paymentDetailList;
    }

    @XmlTransient
    public List<PaymentInformation> getPaymentInformationList() {
        return paymentInformationList;
    }

    public void setPaymentInformationList(List<PaymentInformation> paymentInformationList) {
        this.paymentInformationList = paymentInformationList;
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
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Payment[ id=" + id + " ]";
    }
    
}
