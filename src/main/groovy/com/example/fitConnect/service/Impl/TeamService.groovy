package com.example.fitConnect.service.Impl

import com.example.fitConnect.domain.Team
import com.example.fitConnect.service.data.TeamDataService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@CompileStatic
@Service('teamService')
@Transactional
class TeamService {

    @Autowired
    TeamDataService teamDataService

    List<String> getMembers(String teamName) {
        return teamDataService.getMembers(teamName)*.name
    }

    Map getTeamProfile(String teamName) {
        Team team = teamDataService.getTeam(teamName)
        return ['name': team.name, 'score': team.teamScore]
    }
}