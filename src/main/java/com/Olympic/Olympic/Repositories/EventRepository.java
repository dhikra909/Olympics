package com.Olympic.Olympic.Repositories;

import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Modles.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface EventRepository extends JpaRepository<Event, Integer> {


    @Modifying
    @Transactional

    @Query(value = "UPDATE Event s SET s.isActive=0 where s.id = :id")
    Event getEventById(@Param("id") Integer id);






}
