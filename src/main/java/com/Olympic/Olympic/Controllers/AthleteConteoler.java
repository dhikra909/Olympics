package com.Olympic.Olympic.Controllers;

import com.Olympic.Olympic.Services.AthleteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value = "athlete")
public class AthleteConteoler {

    @Autowired
    AthleteServices athleteServices;

    @RequestMapping(value ="/AthleteData" ,method = RequestMethod.POST)
    public void createAthlete(@RequestParam String name , @RequestParam  String nationality, @RequestParam String sport,@RequestParam String history ,@RequestParam Integer id) throws ParseException {
        athleteServices.createAthlete(name ,nationality, sport,history, id);
    }



}
