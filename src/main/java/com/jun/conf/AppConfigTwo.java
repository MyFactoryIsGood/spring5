package com.jun.conf;

import com.jun.datamodel.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTwo {
    @Bean
    public Person person(){
        return new Person();
    }
}
