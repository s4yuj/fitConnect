package com.example.fitConnect.service

import com.example.fitConnect.domain.Vehicle
import com.example.fitConnect.domain.Manufacturer
import org.springframework.stereotype.Service
import groovy.transform.CompileStatic
import grails.gorm.services.Where


@CompileStatic
@grails.gorm.services.Service(Vehicle)
@Service
interface VehicleService {

    @Where({ Manufacturer.name == manufacturerName })
    List<Vehicle> findAllByManufacturer(String manufacturerName)


}