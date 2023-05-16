package com.Olympic.Olympic.Services;

import com.Olympic.Olympic.Modles.Event;
import com.Olympic.Olympic.Modles.MedalStandings;
import com.Olympic.Olympic.Repositories.AthleteRepositores;
import com.Olympic.Olympic.Repositories.EventRepository;
import com.Olympic.Olympic.Repositories.MedalStandingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Service
public class MedalStandingsServices {


    @Autowired
    MedalStandingsRepository medalStandingsRepository;

    @Autowired
    EventRepository eventRepository;


    public void createMedalStandings(String name , Integer number, Integer silver, Integer medals , Integer id) {
        MedalStandings medalStandings=new MedalStandings();
        medalStandings.setName(name);
        medalStandings.setNumber(number);
        medalStandings.setSilver(silver);
        medalStandings.setMedals(medals);
        medalStandings.setId(id);
        medalStandingsRepository.save(medalStandings);
    }

    public MedalStandings getMedalStandingsById(Integer id) {
        MedalStandings medalStandings = medalStandingsRepository.findById(id).get();
        return medalStandings;
    }

    public MedalStandings updateMedalStandings(String name , Integer number, Integer silver, Integer medals , Integer id){
        MedalStandings medalStandings = medalStandingsRepository.getMedalStandingsById(id);
        medalStandings.setName(name);
        medalStandings.setUpdatedDate(new Date());
        return medalStandingsRepository.save(medalStandings);
    }

    public void deleteMedalStandingsById(Integer id) {
        medalStandingsRepository.getMedalStandingsById(id);

    }

    public List<MedalStandings> getAllMedalStandings() {
        return medalStandingsRepository.findAll();

    }



}
