package com.francilio.spring.repository.user;

import com.francilio.spring.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {



    @Query(" select u from User u where u.name = :dsNomeUsuario ")
    User  findBydsNomeUsuario(@Param("dsNomeUsuario") String dsNomeUsuario);


    @Query("""
            select u from User u
            where   u.name      = :name
            and     u.password  = :password
            and     u.status    =   'A'
            """)
    List<User> getUserLogin(
                @Param("name") String name,
                @Param("password") String password
    );


}
