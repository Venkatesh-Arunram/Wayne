package com.ns.Library.model;
        import javax.persistence.*;

@Entity
@Table(name="booklistsdb")
public class Booklist {

    @Id
    @Column(name="LibUserName")
    private String username;

    @Column(name="HarryPotter")
    private Integer harrypotter;
    @Column(name="Narnia")
    private Integer narnia;
    @Column(name="LOTR")
    private Integer lotr;
    @Column(name="Java")
    private Integer java;
    @Column(name="Python")
    private Integer python;

    public Booklist()
    {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getHarrypotter() {
        return harrypotter;
    }

    public void setHarrypotter(Integer harrypotter) {
        this.harrypotter = harrypotter;
    }

    public Integer getNarnia() {
        return narnia;
    }

    public void setNarnia(Integer narnia) {
        this.narnia = narnia;
    }

    public Integer getLotr() {
        return lotr;
    }

    public void setLotr(Integer lotr) {
        this.lotr = lotr;
    }

    public Integer getJava() {
        return java;
    }

    public void setJava(Integer java) {
        this.java = java;
    }

    public Integer getPython() {
        return python;
    }

    public void setPython(Integer python) {
        this.python = python;
    }
}
