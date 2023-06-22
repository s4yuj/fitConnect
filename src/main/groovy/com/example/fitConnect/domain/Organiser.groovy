package com.example.fitConnect.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity


@Entity
class Organiser extends Athlete implements GormEntity<Organiser> {
    static hasMany = [challenges : Challenge]
}
