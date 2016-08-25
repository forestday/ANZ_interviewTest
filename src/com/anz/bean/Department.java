package com.anz.bean;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
public class Department {
    private Long id;
    private Long fatherDepId;
    private String name;
    private String location;
    private Employee manager;
    private int openPositions;
    
}
