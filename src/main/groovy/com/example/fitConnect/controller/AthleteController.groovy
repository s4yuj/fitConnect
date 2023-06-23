package com.example.fitConnect.controller

import com.example.fitConnect.domain.Athlete
import com.example.fitConnect.service.ifc.AthleteService
import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Transactional
@RestController
class AthleteController {
   @Autowired
   AthleteService athleteService

    @RequestMapping("/{athleteName}/profile")
    Athlete profileStats(@PathVariable String athleteName) {
        return athleteService.getProfile(athleteName)
    }
}