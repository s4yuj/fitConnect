package com.example.fitConnect.service.ifc

import com.example.fitConnect.domain.Athlete
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic


@CompileStatic
@grails.gorm.services.Service(value = Athlete)
interface AthleteService {

    Athlete read(String athleteName)

    Athlete save(Athlete athlete)
}
