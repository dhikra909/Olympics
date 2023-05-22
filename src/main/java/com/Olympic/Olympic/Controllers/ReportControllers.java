package com.Olympic.Olympic.Controllers;


import com.Olympic.Olympic.Services.ReportSerices;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping(value = "report")
public class ReportControllers {


    @Autowired
    ReportSerices reportSerices;
    @RequestMapping(value = "athleteReport")
    public String generateathleteReport() throws JRException, FileNotFoundException {
        return reportSerices.generateathleteReport();
    }
}