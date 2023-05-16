package com.Olympic.Olympic.Modles;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class MedalStandings extends BaseEntity {
  @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;


    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private Integer number ;

    @Column(name = "silver")
    private Integer silver;

    @Column(name = "medals")
    private Integer medals;

}
