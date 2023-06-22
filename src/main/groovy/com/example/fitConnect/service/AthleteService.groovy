package com.example.fitConnect.service

import com.example.fitConnect.domain.Athlete
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service


@CompileStatic
@grails.gorm.services.Service(value = Athlete)
@Service

interface AthleteService {
}
