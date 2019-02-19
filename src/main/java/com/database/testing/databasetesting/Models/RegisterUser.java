package com.database.testing.databasetesting.Models;
import javax.persistence.*;

@Entity
public class RegisterUser {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator="RegisterUser_seq")
    @Id
//    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "user_type")
    private String userType;

    @OneToOne(cascade = CascadeType.ALL)
    private Enterprise enterprise;

    public RegisterUser() {
//        super();
    }

    public RegisterUser(RegisterUser registerUser, Enterprise enterprise) {
        this.id = registerUser.getId();
        this.name = registerUser.getName();
        this.email = registerUser.getEmail();
        this.userType = registerUser.getUserType();
        this.enterprise = enterprise;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
//        enterprise.setUser(this);
    }


}
