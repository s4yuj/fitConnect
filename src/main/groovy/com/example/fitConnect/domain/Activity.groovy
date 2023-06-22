package com.example.fitConnect.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Activity implements GormEntity<Activity> {
    String name
    Integer score
    // TODO: Add activity stats from health client

    static belongsTo = [athlete : Athlete]

    static constraints = {
        score min: 0 //score > 0
    }
}
