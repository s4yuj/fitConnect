package com.example.fitConnect.service.data

import com.example.fitConnect.domain.Activity
import com.example.fitConnect.domain.Athlete
import grails.gorm.services.Where
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service


@CompileStatic
@grails.gorm.services.Service(value = Activity)
@Service
interface ActivityDataService {

    //autogenerated getActivity
    @Where({Activity.name == activityName && Athlete.name == athleteName})
    Activity getActivity(String athleteName, String activityName)

    @Where({Athlete.name == athleteName})
    List<Activity> getAllActivities(athleteName)

    //autogenerated save
    Activity save(Activity activity)
}