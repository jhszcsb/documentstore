package com.toportyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by csaba.juhasz on 21/04/2016.
 */

// @SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan

@SpringBootApplication
public class DocumentStoreApplication {

    public static void main (String[] args) {
        SpringApplication.run(DocumentStoreApplication.class, args);
    }
}
