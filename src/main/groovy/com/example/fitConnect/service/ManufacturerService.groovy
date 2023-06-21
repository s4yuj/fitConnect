package com.example.fitConnect.service

import org.springframework.stereotype.Service
import groovy.transform.CompileStatic
import com.example.fitConnect.domain.*


@CompileStatic
@grails.gorm.services.Service(value = Manufacturer)
@Service
interface ManufacturerService {

    List<Manufacturer> findAll()

    Manufacturer save(Manufacturer manufacturer)
}
