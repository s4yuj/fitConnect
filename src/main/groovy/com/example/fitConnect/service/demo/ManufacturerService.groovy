package com.example.fitConnect.service.demo

import com.example.fitConnect.domain.demo.Manufacturer
import org.springframework.stereotype.Service
import groovy.transform.CompileStatic

@CompileStatic
@grails.gorm.services.Service(value = Manufacturer)
@Service
interface ManufacturerService {

    List<Manufacturer> findAll()

    Manufacturer save(Manufacturer manufacturer)
}
