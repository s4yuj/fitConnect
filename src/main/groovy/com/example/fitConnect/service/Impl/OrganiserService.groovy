package com.example.fitConnect.service.Impl

import com.example.fitConnect.service.data.OrganiserDataService
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service('organiserService')
@Transactional
class OrganiserService {

    @Autowired
    OrganiserDataService organiserDataService


}
