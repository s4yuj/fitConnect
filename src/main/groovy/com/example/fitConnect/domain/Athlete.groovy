package com.example.fitConnect.domain

import grails.gorm.annotation.Entity
import groovy.transform.ToString
import org.grails.datastore.gorm.GormEntity


@ToString //generates a toString method for the class
@Entity
class Athlete implements GormEntity<Athlete> {

    String name
    Integer age
    //TODO: add fields for health variables from Health Client
    Integer score
    Team team

    static hasMany = [activities : Activity]

    static constraints = {
        name blank: false //name not blank
        score min: 0 //score > 0
        team nullable: true
        activities nullable: true
    }
}
