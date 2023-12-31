package com.example.fitConnect.controller

import com.example.fitConnect.domain.Activity
import com.example.fitConnect.service.Impl.AthleteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class AthleteController {
   @Autowired
   AthleteService athleteService


    @RequestMapping("/{athleteName}/profile")
    Map profileStats(@PathVariable String athleteName) {
        return athleteService.getAthlete(athleteName)
    }
}