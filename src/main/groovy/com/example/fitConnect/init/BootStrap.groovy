package com.example.fitConnect.init

import com.example.fitConnect.domain.Manufacturer
import com.example.fitConnect.domain.Vehicle
import com.example.fitConnect.service.ManufacturerService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
@CompileStatic
class BootStrap {

    @Autowired
   ManufacturerService manufacturerService

    @Transactional
    void init() {
        Manufacturer audi = new Manufacturer(name: "audi")
        audi.addToVehicles(new Vehicle(name: "A3", year: 1996))
        audi.addToVehicles(new Vehicle(name: "A4", year: 1994))

        manufacturerService.save(audi)
    }
}
