package com.example.fitConnect.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Team implements GormEntity<Team> {
    String name
    Integer teamScore

    static hasMany = [athletes : Athlete]


    static constraints = {
        name blank : false, unique: true
        athletes minsize: 1, maxSize: 5 // must have between 1 and 5 athletes
        teamScore min : 0 //score > 0
    }


    //TODO: create a constructor that adds all athlete scores to generate team score
}