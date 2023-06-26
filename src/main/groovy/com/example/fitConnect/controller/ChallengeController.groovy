package com.example.fitConnect.controller

import com.example.fitConnect.service.Impl.ChallengeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ChallengeController {

    @Autowired
    ChallengeService challengeService

    @RequestMapping('/challenge/{challengeName}')
    Map getChallenge(@PathVariable String challengeName) {
        return challengeService.getChallengeInfo(challengeName)
    }

    @RequestMapping('/{organiserName}/challenges')
    List<String> getOrganiserChallenges(@PathVariable String organiserName) {
        return challengeService.getOrganiserChallenges(organiserName)
    }
}