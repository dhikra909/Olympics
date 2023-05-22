package com.Olympic.Olympic.Controllers;

import com.Olympic.Olympic.Modles.Event;
import com.Olympic.Olympic.Modles.MedalStandings;
import com.Olympic.Olympic.Services.EventServices;
import com.Olympic.Olympic.Services.MedalStandingsServices;
import com.Olympic.Olympic.Slack.SlackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "medalStandings")
public class MedalStandingsConteoler {


    @Autowired
    MedalStandingsServices medalStandingsServices;

    @Autowired
    SlackClient slackClient;


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

    @Scheduled(cron = "0 0/5 * * * *")
    @GetMapping(value = "/getAllMedalStandings")
    public List<MedalStandings> getAlMedalStandings() {
        List<MedalStandings> medalStandingsList = medalStandingsServices.getAllMedalStandings();
        for(MedalStandings medalStandingsData : medalStandingsList) {
            slackClient.sendMessage(medalStandingsData.getName().toString());
            slackClient.sendMessage(medalStandingsData.getNumber().toString());
            slackClient.sendMessage(medalStandingsData.getSilver().toString());
            slackClient.sendMessage(medalStandingsData.getMedals().toString());
            slackClient.sendMessage(medalStandingsData.getSilver().toString());
            slackClient.sendMessage(medalStandingsData.getCreatedDate().toString());
            slackClient.sendMessage(medalStandingsData.getUpdatedDate().toString());
//            slackClient.sendMessage(medalStandingsData.getActive().toString());
        }
        return medalStandingsList;
    }





}
