package com.Olympic.Olympic.Modles;


import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Setter
@Getter
@Entity



public class Athlete extends BaseEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "name")
    private String name ;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "sport")
    private String sport;


    @Column(name = "history")
    private String history;




}
