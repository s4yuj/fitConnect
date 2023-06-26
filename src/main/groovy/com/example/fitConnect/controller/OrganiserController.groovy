package com.example.fitConnect.controller

import com.example.fitConnect.service.Impl.OrganiserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class OrganiserController {

    @Autowired
    OrganiserService organiserService

    //TODO: organiser would need access to change stuff in the challenge, invite teams and create new challenge.
}
