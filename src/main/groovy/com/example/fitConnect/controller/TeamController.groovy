package com.example.fitConnect.controller

import com.example.fitConnect.service.Impl.TeamService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TeamController {

    @Autowired
    TeamService teamService

    @RequestMapping('/{teamName}/members')
    List<String> getMembers(@PathVariable String teamName) {
        teamService.getMembers(teamName)
    }

    @RequestMapping('/{teamName}/teamProfile')
    Map getTeamProfile(@PathVariable String teamName) {
        teamService.getTeamProfile(teamName)
    }

    //this is not exactly REQUIRING the teamName, it is giving me the teamstats for any teamName
    

}
