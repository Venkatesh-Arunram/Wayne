package com.ns.Library.model;

import javax.persistence.*;

@Entity
@Table(name="libraryDB")
public class Register
{
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;
    @Column(name="Username")
    private String username;
    @Column(name="Email")
    private String email;
    @Column(name="Password")
    private String password;
    @Transient
    private String repassword;

    public Register() {
        // TODO Auto-generated constructor stub
    }
    public Register(String username, String password, String email) {
        this.password = password;
        this.username = username;
        this.email=email;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
