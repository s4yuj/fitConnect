package com.example.fitConnect.controller.demo

import com.example.fitConnect.service.demo.VehicleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class VehicleController {

    @Autowired
    VehicleService vehicleService

    @RequestMapping("/{manufacturerName}/vehicles")
    List<String> vehiclesByManufacturer(@PathVariable String manufacturerName) {
        vehicleService.findAllByManufacturer(manufacturerName)*.name
    }
}
