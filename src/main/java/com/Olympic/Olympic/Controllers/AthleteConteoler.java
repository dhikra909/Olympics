package com.Olympic.Olympic.Controllers;

import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Services.AthleteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "athlete")
public class AthleteConteoler {

    @Autowired
    AthleteServices athleteServices;

    @RequestMapping(value ="/AthleteData" ,method = RequestMethod.POST)
    public void createAthlete(@RequestParam String name , @RequestParam  String nationality, @RequestParam String sport,@RequestParam String history ,@RequestParam Integer id) throws ParseException {
        athleteServices.createAthlete(name ,nationality, sport,history, id);
    }

    @RequestMapping(value = "athleteId", method = RequestMethod.GET)
    public Athlete getAthleteById(@RequestParam Integer id) {
        Athlete athlete = athleteServices.getAthleteById(id);
        return athlete;
    }

    @RequestMapping("/updateAthlete")
    public Athlete updateAthlete(@RequestParam String name , @RequestParam  String nationality, @RequestParam String sport,@RequestParam String history ,@RequestParam Integer id){
        return athleteServices.updateAthlete(name , nationality , sport,history,id);
    }




    @RequestMapping(value = "deleteCAthleteById", method = RequestMethod.POST)
    public void deleteAthleteById(@RequestParam Integer id) {
        athleteServices.deleteAthleteById(id);
    }



    @GetMapping(value = "/getAllAthlete")
    public List<Athlete> getAllAthlete() {
        return athleteServices.getAllAthlete();
    }











}
