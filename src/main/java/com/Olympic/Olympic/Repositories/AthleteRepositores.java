package com.Olympic.Olympic.Repositories;

import com.Olympic.Olympic.Modles.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepositores extends JpaRepository<Athlete, Integer> {
}
