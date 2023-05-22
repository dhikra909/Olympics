package com.Olympic.Olympic.Services;

import com.Olympic.Olympic.Controllers.MedalStandingsConteoler;
import com.Olympic.Olympic.Modles.Event;
import com.Olympic.Olympic.Modles.MedalStandings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MedalStandingsServicesTest {
    @Autowired
    MedalStandingsConteoler medalStandingsConteoler;
    @Test
    void getAllMedalStandings() {
        List<MedalStandings> allMedalStandingsTest=medalStandingsConteoler.getAlMedalStandings();
        assertNotNull(allMedalStandingsTest);
    }
}