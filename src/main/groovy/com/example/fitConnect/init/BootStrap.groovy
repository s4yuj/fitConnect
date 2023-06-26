package com.example.fitConnect.init

import com.example.fitConnect.domain.Activity
import com.example.fitConnect.domain.Athlete
import com.example.fitConnect.domain.Challenge
import com.example.fitConnect.domain.Organiser
import com.example.fitConnect.domain.Team
import com.example.fitConnect.domain.demo.Manufacturer
import com.example.fitConnect.domain.demo.Vehicle
import com.example.fitConnect.service.data.TeamDataService
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

    @Autowired
    TeamDataService teamDataService

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

        Athlete abhay = new Organiser(name: "Abhay", age: 48, score: 0, challenges: null)

        abhay.addToChallenges(new Challenge(name: "JulyChallenge",
                                            startDate: new Date(2023, 07, 01),
                                            endDate: new Date(2023, 07, 31)))

        //TODO: Fix DateTime format.

        athleteDataService.save(abhay)

        Team teamWinners = new Team(name: 'teamWinners', teamScore: 0)
        teamWinners.addToAthletes(sayuj)
        teamWinners.addToAthletes(abhay)

        teamDataService.save(teamWinners)
    }
}
