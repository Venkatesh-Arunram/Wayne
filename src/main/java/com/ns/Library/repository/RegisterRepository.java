package com.ns.Library.repository;
import com.ns.Library.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RegisterRepository extends JpaRepository<Register, String> {

    Register findByUsernameAndPassword(String username,String password);
    Register findByUsername(String username);

}