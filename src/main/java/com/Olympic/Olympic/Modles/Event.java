package com.Olympic.Olympic.Modles;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity


public class Event extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "Sport")
    private String Sport;

    @Column(name = "Schedale")
    private Date Schedale;


    @Column(name = "resalts")
    private String resalts;


//    @ManyToOne
//    @JoinColumn(name = "athlete_id", referencedColumnName = "id")
//    private Athlete athlete;




}
