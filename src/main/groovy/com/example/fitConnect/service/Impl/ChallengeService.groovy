package com.example.fitConnect.service.Impl

import com.example.fitConnect.domain.Challenge
import com.example.fitConnect.service.data.ChallengeDataService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@CompileStatic
@Service('ChallengeService')
@Transactional
class ChallengeService {

    @Autowired
    ChallengeDataService challengeDataService

    Map getChallengeInfo(String challengeName) {
        Challenge challenge = challengeDataService.getChallenge(challengeName)
        return ['name': challenge.name,
                'startDate': challenge.startDate,
                'endDate': challenge.endDate]
    }

    List<String> getOrganiserChallenges(String organiserName) {
        return challengeDataService.getOrganiserChallenges(organiserName)*.name
    }


}
