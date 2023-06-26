package com.example.fitConnect.init

import com.example.fitConnect.domain.Activity
import com.example.fitConnect.domain.Athlete
import com.example.fitConnect.domain.demo.Manufacturer
import com.example.fitConnect.domain.demo.Vehicle
import com.example.fitConnect.service.demo.ManufacturerService
import com.example.fitConnect.service.data.AthleteDataService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
@CompileStatic
class BootStrap {

    @Autowired
    ManufacturerService manufacturerService

    @Autowired
    AthleteDataService athleteDataService

    @Transactional
    void init() {
        Manufacturer audi = new Manufacturer(name: "audi")
        audi.addToVehicles(new Vehicle(name: "A3", year: 1996))
        audi.addToVehicles(new Vehicle(name: "A4", year: 1994))

        manufacturerService.save(audi)

        Athlete sayuj = new Athlete(name: "Sayuj",
                age: 19,
                score: 100)

        sayuj.addToActivities(new Activity(name: "Run", score: 50))
        sayuj.addToActivities(new Activity(name: "Cycle", score: 30))

        athleteDataService.save(sayuj)
    }
}
