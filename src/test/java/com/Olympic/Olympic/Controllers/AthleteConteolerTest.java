package com.Olympic.Olympic.Controllers;

import com.Olympic.Olympic.Modles.Athlete;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AthleteConteolerTest {
@Autowired
    AthleteConteoler athleteConteoler;
    @Test
    void getAthleteById() {
        Athlete eByIdTest=athleteConteoler.getAthleteById(1);
        String name=eByIdTest.getName();
        assertNotNull(eByIdTest);
        assertEquals("Simone-Biles",name);
        assertNotEquals("Women's-Artistic-Team-All-Around",name);
        assertEquals("Women's-Vault",name);
    }

    @Test
    void getAllAthlete() {
        List<Athlete> allAthleteTest=athleteConteoler.getAllAthlete();
        assertNotNull(allAthleteTest);
    }

}