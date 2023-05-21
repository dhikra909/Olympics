package com.Olympic.Olympic.Controllers;

import com.Olympic.Olympic.Modles.Event;
import com.Olympic.Olympic.Modles.MedalStandings;
import com.Olympic.Olympic.Services.EventServices;
import com.Olympic.Olympic.Services.MedalStandingsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "medalStandings")
public class MedalStandingsConteoler {


    @Autowired
    MedalStandingsServices medalStandingsServices;



    @RequestMapping(value = "medalStandingsId", method = RequestMethod.GET)
    public MedalStandings getMedalStandingsById(@RequestParam Integer id) {
        MedalStandings medalStandings = medalStandingsServices.getMedalStandingsById(id);
        return medalStandings;
    }
    @RequestMapping(value ="/MedalStandingseData" ,method = RequestMethod.POST)
    public void createMedalStandings(@RequestParam String name , @RequestParam  Integer number, @RequestParam Integer silver, @RequestParam Integer medals , @RequestParam Integer id) throws ParseException {
        medalStandingsServices.createMedalStandings(name ,number, silver,medals, id);
    }

    @RequestMapping("/updateMedalStandings")
    public MedalStandings updateMedalStandings(@RequestParam String name , @RequestParam  Integer number, @RequestParam Integer silver, @RequestParam Integer medals , @RequestParam Integer id){
        return medalStandingsServices.updateMedalStandings(name , number , silver,medals,id);
    }


    @RequestMapping(value = "deleteMedalStandingsById", method = RequestMethod.POST)
    public void deleteMedalStandingsById(@RequestParam Integer id) {
        medalStandingsServices.deleteMedalStandingsById(id);
    }

  




}
