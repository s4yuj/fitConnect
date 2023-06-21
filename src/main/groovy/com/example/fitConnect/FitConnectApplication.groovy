package com.example.fitConnect

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import com.example.fitConnect.init.BootStrap
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration

@CompileStatic
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
class FitConnectApplication implements ApplicationRunner {

	@Autowired
	BootStrap bootStrap

	static void main(String[] args) {
		SpringApplication.run (FitConnectApplication, args)
	}

	void run(ApplicationArguments args) throws Exception {
		bootStrap.init()
	}
}
