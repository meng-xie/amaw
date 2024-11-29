package org.example.amaw.repository;

import org.example.amaw.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

     User  findByUserId(Integer userId);

    // Custom query

    @Query("SELECT b FROM User b WHERE b.userName = :username and b.passwords =:password")
      User  login(@Param("username") String username,@Param("password") String password);

}