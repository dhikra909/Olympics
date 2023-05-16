package com.Olympic.Olympic.Repositories;

import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Modles.Event;
import com.Olympic.Olympic.Modles.MedalStandings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface MedalStandingsRepository extends JpaRepository<MedalStandings, Integer> {

    @Modifying
    @Transactional

    @Query(value = "UPDATE MedalStandings s SET s.isActive=0 where s.id = :id")
    MedalStandings getMedalStandingsById(@Param("id") Integer id);






}
