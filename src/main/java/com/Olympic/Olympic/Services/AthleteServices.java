package com.Olympic.Olympic.Services;

import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Repositories.AthleteRepositores;
import com.Olympic.Olympic.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AthleteServices {

    @Autowired
    AthleteRepositores athleteRepositores;

    @Autowired
    EventRepository eventRepository;


    public void createAthlete(String name, String nationality, String sport, String history ,Integer id) {
        Athlete athlete=new Athlete();
        athlete.setHistory(history);
        athlete.setId(id);
        athlete.setSport(sport);
        athlete.setName(name);
        athlete.setNationality(nationality);
    }










}
