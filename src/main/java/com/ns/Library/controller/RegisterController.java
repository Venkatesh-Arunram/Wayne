package com.ns.Library.controller;

import com.ns.Library.model.BookCount;
import com.ns.Library.model.Register;
import com.ns.Library.model.SpringException;
import com.ns.Library.repository.BookCountRepository;
import com.ns.Library.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class RegisterController
{
    @Autowired
    RegisterRepository registerRepository;

    @Autowired
    BookCountRepository bookCountRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/register")
    @ExceptionHandler({SpringException.class})
    public void register(@RequestBody Register register)
    {
        registerRepository.save(register);
    }

    @RequestMapping("/addbook")
    public void addbook(@RequestBody BookCount bookCount)
    {
        bookCountRepository.save(bookCount);
    }

    @RequestMapping("/login")
    public Register getCustomers(@RequestParam Map<String,String> allParams)
    {
        System.out.println();
        Register customer = registerRepository.findByUsernameAndPassword(allParams.get("username"),allParams.get("password"));
        return  customer;
    }

    @GetMapping("/issue")
    public List<BookCount> getissue()
    {
        List<BookCount>bookcount=new ArrayList<BookCount>();
        bookCountRepository.findAll().forEach(bookcount::add);
        return bookcount;
    }

    @GetMapping("/user/{shortname}")
    public BookCount getbookname(@PathVariable("shortname") String shortname)
    {
        BookCount bcount = bookCountRepository.findByshortname(shortname);
        return bcount;
    }

    @PostMapping("/updatebook")
    public void updatecontact(@RequestBody BookCount bookcount)
    {
        BookCount bookCount= bookCountRepository.findBybookname(bookcount.getBookname());
        int data=bookCount.getCount();
        String SQL="update bookcountdb set Countnumber=? where Bookname=?";
        if(bookcount.getCheck().equals("issue")) {
            jdbcTemplate.update(SQL, data - bookcount.getCount(), bookcount.getBookname());
        }
        else
        {
            jdbcTemplate.update(SQL, data + bookcount.getCount(), bookcount.getBookname());
        }
    }
    
    @PostMapping("/forgotpassword")
    public void forgotpassword(@RequestBody Register register)
    {
        System.out.println(register.getPassword());
        Register register1=registerRepository.findByUsername(register.getUsername());
        
        String SQL="update librarydb set password=? where username=?";
        
        jdbcTemplate.update(SQL,register.getPassword(),register.getUsername() );
   }
}