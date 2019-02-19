package com.database.testing.databasetesting.Models;

import javax.persistence.*;

@Entity
//@Table(name = "Enterprise")
public class Enterprise {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="Enterprise_seq")
    @Id
    private long Id;
    @Column(name = "enterprise_document")
    private String enterpriseId;
    @Column(name = "enterprise_name")
    private String enterpriseName;
    @OneToOne
    @PrimaryKeyJoinColumn
    private RegisterUser user;


    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getEnterpriseId() {
        return enterpriseId;
    }
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    public String getEnterpriseName() {
        return enterpriseName;
    }
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }


}
