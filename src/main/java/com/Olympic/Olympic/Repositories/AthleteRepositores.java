package com.Olympic.Olympic.Repositories;

import com.Olympic.Olympic.Modles.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface AthleteRepositores extends JpaRepository<Athlete, Integer> {


    @Modifying
    @Transactional

    @Query(value = "UPDATE Athlete s SET s.isActive=0 where s.id = :id")
    Athlete getAthleteById(@Param("id") Integer id);





}
