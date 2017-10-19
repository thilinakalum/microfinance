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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author kalum
 */
@Entity
@Table(name = "`group`")
public class Group1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(length = 45)
    private String name;

    @Size(max = 45)
    @Column(name = "max_group_members", length = 45)
    private String maxGroupMembers;

    @Size(max = 45)
    @Column(name = "min_group_members", length = 45)
    private String minGroupMembers;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @OneToMany(mappedBy = "group1", fetch = FetchType.LAZY)
    private List<Client> clientList;

    public Group1() {
    }

    public Group1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaxGroupMembers() {
        return maxGroupMembers;
    }

    public void setMaxGroupMembers(String maxGroupMembers) {
        this.maxGroupMembers = maxGroupMembers;
    }

    public String getMinGroupMembers() {
        return minGroupMembers;
    }

    public void setMinGroupMembers(String minGroupMembers) {
        this.minGroupMembers = minGroupMembers;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public String toString() {
        return "Group1{" + "id=" + id + ", name=" + name + ", maxGroupMembers=" + maxGroupMembers + ", minGroupMembers=" + minGroupMembers + ", date=" + date + '}';
    }
}
