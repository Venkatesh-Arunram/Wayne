package com.ns.Library.model;

import javax.persistence.*;

@Entity
@Table(name="bookcountdb")
public class BookCount
{

    @Id
    @Column(name="Bookname")
    private String bookname;
    @Column(name="Shortname")
    private String shortname;
    @Column(name="Countnumber")
    private Integer count;
    @Transient
    private String check;

    public BookCount()
    {}

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
}
