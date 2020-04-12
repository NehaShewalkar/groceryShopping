package com.example.api.Repository;

import com.example.api.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonJpaRepository extends JpaRepository<Person, Integer> {

   // @Query("select * from People u where u.firstName =:firstName")

    List<Person> findByFirstName(String firstName);
}
