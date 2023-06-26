package com.example.fitConnect.service.Impl

import com.example.fitConnect.domain.Activity
import com.example.fitConnect.service.data.ActivityDataService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@CompileStatic
@Service('activityService')
@Transactional
class ActivityService {

    @Autowired
    ActivityDataService activityDataService

    Map getActivity(String athleteName, String activityName) {
        Activity activity = activityDataService.getActivity(athleteName, activityName) //calling the autogenerated function
        return ['name': activity.name, 'score': activity.score]
    }

    List<String> getAllActivities(String athleteName) {
        List<Activity> allActivities = activityDataService.getAllActivities(athleteName)
        return allActivities*.name
    }
}