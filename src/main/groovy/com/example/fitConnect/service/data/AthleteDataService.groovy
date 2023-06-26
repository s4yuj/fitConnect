package com.example.fitConnect.service.data

import com.example.fitConnect.domain.Athlete
import grails.gorm.services.Where
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service


@CompileStatic
@grails.gorm.services.Service(value = Athlete)
@Service
interface AthleteDataService {

    @Where({Athlete.name == athleteName})
    Athlete getAthlete(String athleteName)

    Athlete save(Athlete athlete)
}
