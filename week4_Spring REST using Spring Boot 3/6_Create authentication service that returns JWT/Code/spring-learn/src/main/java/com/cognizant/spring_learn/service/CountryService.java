package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final ApplicationContext context =new ClassPathXmlApplicationContext("country.xml");
    public Country getCountry(String code){
        List<Country> countries=context.getBean("countries", List.class);
        Optional<Country> foundCountry=countries.stream().filter((country)-> code.equalsIgnoreCase(country.getCode())).findFirst();
        if(foundCountry.isEmpty()){
            throw new RuntimeException("Country not found");
        }
        return foundCountry.get();
    }

}
