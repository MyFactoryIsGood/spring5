package com.jun.conf;

import com.jun.datamodel.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class AppConfigThree {
    @Bean
    public Person person(){
        return new Person();
    }
}
