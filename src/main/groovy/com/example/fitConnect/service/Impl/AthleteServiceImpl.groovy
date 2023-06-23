package com.example.fitConnect.service.Impl

import com.example.fitConnect.domain.Athlete
import com.example.fitConnect.service.ifc.AthleteService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@grails.gorm.services.Service(value = Athlete)
@Service
@Transactional
class AthleteServiceImpl implements AthleteService{

    @Override
    Athlete read(String athleteName) {
        Athlete.get(athleteName)
    }

    @Override
    Athlete save(Athlete athlete) {
        return null
    }
}
