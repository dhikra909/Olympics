package com.Olympic.Olympic.Controllers;

import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Modles.Event;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EventConteolerTest {

    @Autowired
    EventConteoler eventConteoler;

    @Test
    void getAllEvent() {
        List<Event> allEventTest=eventConteoler.getAllEvent();
        assertNotNull(allEventTest);

    }
}