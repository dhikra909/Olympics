package com.Olympic.Olympic.Repositories;

import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Modles.MedalStandings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedalStandingsRepository extends JpaRepository<MedalStandings, Integer> {
}
