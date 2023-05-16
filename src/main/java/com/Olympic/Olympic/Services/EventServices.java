package com.Olympic.Olympic.Services;

import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Modles.Event;
import com.Olympic.Olympic.Repositories.AthleteRepositores;
import com.Olympic.Olympic.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Service
public class EventServices {

    @Autowired
    AthleteRepositores athleteRepositores;

    @Autowired
    EventRepository eventRepository;

    public void createEvent(String name, String Sport,Date Schedale,String resalts ,Integer id) {
        Event event=new Event();
        event.setName(name);
        event.setSport(Sport);
        event.setSchedale(Schedale);
        event.setResalts(resalts);
        event.setId(id);
        eventRepository.save(event);
    }


    public Event getEventById(Integer id) {
        Event event = eventRepository.findById(id).get();
        return event;
    }

    public Event updateEvent(String name, String Sport,Date Schedale,String resalts ,Integer id){
        Event event = eventRepository.getEventById(id);
        event.setName(name);
        event.setUpdatedDate(new Date());
        return eventRepository.save(event);
    }

    public void deleteEventById(Integer id) {
        eventRepository.getEventById(id);

    }


    public List<Event> getAllEvent() {
        return eventRepository.findAll();

    }



    }
