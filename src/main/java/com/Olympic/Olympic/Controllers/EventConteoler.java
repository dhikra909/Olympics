package com.Olympic.Olympic.Controllers;

import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Modles.Event;
import com.Olympic.Olympic.Services.AthleteServices;
import com.Olympic.Olympic.Services.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "event")
public class EventConteoler {

    @Autowired
    EventServices eventServices;

    @RequestMapping(value ="/EventeData" ,method = RequestMethod.POST)
    public void createEvent(@RequestParam String name , @RequestParam  String Sport, @RequestParam Date Schedale, @RequestParam String resalts , @RequestParam Integer id) throws ParseException {
        eventServices.createEvent(name ,Sport, Schedale,resalts, id);
    }

    @RequestMapping(value = "eventId", method = RequestMethod.GET)
    public Event getEventById(@RequestParam Integer id) {
        Event event = eventServices.getEventById(id);
        return event;
    }

   

    @RequestMapping(value = "deleteEventById", method = RequestMethod.POST)
    public void deleteEventById(@RequestParam Integer id) {
        eventServices.deleteEventById(id);
    }

    @GetMapping(value = "/getAllEvent")
    public List<Event> getAllEvent() {
        return eventServices.getAllEvent();
    }







}
