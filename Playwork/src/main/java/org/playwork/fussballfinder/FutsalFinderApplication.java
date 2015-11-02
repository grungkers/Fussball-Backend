package org.playwork.fussballfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class FutsalFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FutsalFinderApplication.class, args);
    }
   
    
}


