package com.example.fitConnect.service.data

import com.example.fitConnect.domain.Challenge
import com.example.fitConnect.domain.Organiser
import grails.gorm.services.Where
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service


@CompileStatic
@grails.gorm.services.Service(value = Challenge)
@Service()
interface ChallengeDataService {

    @Where({Challenge.name == challengeName})
    Challenge getChallenge(challengeName)

    @Where({Organiser.name == organiserName})
    List<Challenge> getOrganiserChallenges(String organiserName)
}