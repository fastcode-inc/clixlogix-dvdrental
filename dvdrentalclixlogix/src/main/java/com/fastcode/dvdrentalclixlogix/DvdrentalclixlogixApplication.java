package com.fastcode.dvdrentalclixlogix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.fastcode.dvdrentalclixlogix", "org.springframework.versions" })
public class DvdrentalclixlogixApplication {

    public static void main(String[] args) {
        SpringApplication.run(DvdrentalclixlogixApplication.class, args);
    }
}
