package com.Olympic.Olympic.Services;


import com.Olympic.Olympic.Modles.Athlete;
import com.Olympic.Olympic.Repositories.AthleteRepositores;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportSerices {
    public static final String pathToReports ="C:\\Users\\user022\\Desktop\\reoprts";
@Autowired
    AthleteRepositores athleteRepositores;
    public String generateathleteReport()  throws FileNotFoundException, JRException  {

            List<Athlete> athleteList = athleteRepositores.findAll();

            File file = ResourceUtils.getFile("C:\\Users\\user022\\Desktop\\Olympics\\Olympics\\src\\main\\resources\\AthleteReport.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(athleteList);
            Map<String, Object> paramters = new HashMap<>();
            paramters.put("CreatedBy", "MyName");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramters, dataSource);
            JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports + "\\AthleteReport.pdf");
            return "Report generated : " + pathToReports + "\\AthleteReport.pdf";
        }
    }

