/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thilina Kalum
 */
@Entity
@Table(name = "payment_information", catalog = "micro_finance", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentInformation.findAll", query = "SELECT p FROM PaymentInformation p")
    , @NamedQuery(name = "PaymentInformation.findById", query = "SELECT p FROM PaymentInformation p WHERE p.id = :id")
    , @NamedQuery(name = "PaymentInformation.findByAmount", query = "SELECT p FROM PaymentInformation p WHERE p.amount = :amount")
    , @NamedQuery(name = "PaymentInformation.findByType", query = "SELECT p FROM PaymentInformation p WHERE p.type = :type")
    , @NamedQuery(name = "PaymentInformation.findByCardNo", query = "SELECT p FROM PaymentInformation p WHERE p.cardNo = :cardNo")
    , @NamedQuery(name = "PaymentInformation.findByBank", query = "SELECT p FROM PaymentInformation p WHERE p.bank = :bank")
    , @NamedQuery(name = "PaymentInformation.findByCardType", query = "SELECT p FROM PaymentInformation p WHERE p.cardType = :cardType")
    , @NamedQuery(name = "PaymentInformation.findByChequeNo", query = "SELECT p FROM PaymentInformation p WHERE p.chequeNo = :chequeNo")
    , @NamedQuery(name = "PaymentInformation.findByChequeDate", query = "SELECT p FROM PaymentInformation p WHERE p.chequeDate = :chequeDate")})
public class PaymentInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 10, scale = 2)
    private BigDecimal amount;
    @Column(length = 45)
    private String type;
    @Column(name = "card_no")
    private Integer cardNo;
    @Column(length = 45)
    private String bank;
    @Column(name = "card_type", length = 45)
    private String cardType;
    @Column(name = "cheque_no")
    private Integer chequeNo;
    @Column(name = "cheque_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chequeDate;
    @JoinColumn(name = "payment", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Payment payment;

    public PaymentInformation() {
    }

    public PaymentInformation(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCardNo() {
        return cardNo;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(Integer chequeNo) {
        this.chequeNo = chequeNo;
    }

    public Date getChequeDate() {
        return chequeDate;
    }

    public void setChequeDate(Date chequeDate) {
        this.chequeDate = chequeDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
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
        if (!(object instanceof PaymentInformation)) {
            return false;
        }
        PaymentInformation other = (PaymentInformation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.PaymentInformation[ id=" + id + " ]";
    }
    
}
