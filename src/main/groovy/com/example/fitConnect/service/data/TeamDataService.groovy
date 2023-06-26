package com.example.fitConnect.service.data

import com.example.fitConnect.domain.Athlete
import com.example.fitConnect.domain.Team
import grails.gorm.services.Where
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service


@CompileStatic
@grails.gorm.services.Service(value = Team)
@Service()
interface TeamDataService {

    @Where({Team.name == teamName})
    List<Athlete> getMembers(String teamName)

    @Where({Team.name == teamName})
    Team getTeam(String teamName)

    Team save(Team team)
}
