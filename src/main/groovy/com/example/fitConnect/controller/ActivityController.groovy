package com.example.fitConnect.controller

import com.example.fitConnect.domain.Activity
import com.example.fitConnect.service.Impl.ActivityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ActivityController {

    @Autowired
    ActivityService activityService

    @RequestMapping("/{athleteName}/activity/{activityName}")
    Map getActivity(@PathVariable String athleteName, @PathVariable String activityName) {
        return activityService.getActivity(athleteName, activityName)
    }

    @RequestMapping("/{athleteName}/activities/all")
    List<String> activities(@PathVariable String athleteName) {
        return activityService.getAllActivities(athleteName)
    }

}
