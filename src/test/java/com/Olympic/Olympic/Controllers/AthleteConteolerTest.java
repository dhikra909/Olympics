package com.Olympic.Olympic.Controllers;

import com.Olympic.Olympic.Modles.Athlete;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AthleteConteolerTest {
@Autowired
    AthleteConteoler athleteConteoler;
    @Test
    void getAthleteById() {
        Athlete eByIdTest=athleteConteoler.getAthleteById(1);
        String name=eByIdTest.getName();
        assertNotNull(eByIdTest);
        assertEquals("fdghfh,dhikra",name);
        assertNotEquals("since",name);

    }

    @Test
    void getAllAthlete() {
        List<Athlete> allAthleteTest=athleteConteoler.getAllAthlete();
        assertNotNull(allAthleteTest);
    }
}