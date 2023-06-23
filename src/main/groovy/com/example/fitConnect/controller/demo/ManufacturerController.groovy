package com.example.fitConnect.controller.demo

import com.example.fitConnect.service.demo.ManufacturerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ManufacturerController {

    @Autowired
    ManufacturerService manufacturerService

    @RequestMapping("/")
    List<String> index() {
        manufacturerService.findAll()*.name
    }
}
