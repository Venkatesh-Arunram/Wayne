package com.ns.Library.repository;

import com.ns.Library.model.BookCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCountRepository extends JpaRepository<BookCount, String> {

    BookCount findBybookname(String name);
   BookCount findByshortname(String name);
}