package com.example.fitConnect.service.Impl

import com.example.fitConnect.domain.Athlete
import com.example.fitConnect.service.ifc.AthleteDataService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service('athleteService')
@Transactional
class AthleteService {

    @Autowired
    AthleteDataService athleteDataService

    Map getAthlete(String athleteName) {

        Athlete athlete = athleteDataService.getAthlete(athleteName)
        return ['name': athlete.name, 'age': athlete.age]
    }

   }
