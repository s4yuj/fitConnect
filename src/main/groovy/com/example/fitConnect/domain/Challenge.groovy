package com.example.fitConnect.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity


@Entity
class Challenge implements GormEntity<Challenge> {
    String name
    Date startDate
    Date endDate

    static hasMany = [teams : Team] // participating teams

    static belongsTo = [organiser: Organiser]
}
