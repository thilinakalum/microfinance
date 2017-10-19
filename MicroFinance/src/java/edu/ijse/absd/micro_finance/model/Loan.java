/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Thilina Kalum
 */
@Entity
@Table(catalog = "micro_finance")
public class Loan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 10, scale = 2)
    private BigDecimal amount;
    
    @Column(name = "installment_count")
    private Integer installmentCount;
    
    @Column(length = 45)
    private String status;
    
    @Column(precision = 10, scale = 2)
    private BigDecimal fine;
    
    @Column(name = "fine_rate", precision = 10, scale = 2)
    private BigDecimal fineRate;
    
    @JoinColumn(name = "interest_rate", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private InterestRate interestRate;
    
    @JoinColumn(name = "loan_request", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private LoanRequest loanRequest;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "loanId", fetch = FetchType.EAGER)
    private List<PaymentDetail> paymentDetailList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "loanId", fetch = FetchType.EAGER)
    private List<Fine> fineList;

    public Loan() {
    }

    public Loan(Integer id) {
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getInstallmentCount() {
        return installmentCount;
    }

    public void setInstallmentCount(Integer installmentCount) {
        this.installmentCount = installmentCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    public BigDecimal getFineRate() {
        return fineRate;
    }

    public void setFineRate(BigDecimal fineRate) {
        this.fineRate = fineRate;
    }

    public InterestRate getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(InterestRate interestRate) {
        this.interestRate = interestRate;
    }

    public LoanRequest getLoanRequest() {
        return loanRequest;
    }

    public void setLoanRequest(LoanRequest loanRequest) {
        this.loanRequest = loanRequest;
    }

    public List<PaymentDetail> getPaymentDetailList() {
        return paymentDetailList;
    }

    public void setPaymentDetailList(List<PaymentDetail> paymentDetailList) {
        this.paymentDetailList = paymentDetailList;
    }

    public List<Fine> getFineList() {
        return fineList;
    }

    public void setFineList(List<Fine> fineList) {
        this.fineList = fineList;
    }

}
