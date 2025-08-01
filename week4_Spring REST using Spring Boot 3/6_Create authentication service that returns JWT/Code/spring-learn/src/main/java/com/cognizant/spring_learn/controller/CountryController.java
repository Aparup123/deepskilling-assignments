package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    private final ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");

    @RequestMapping("/country")
    public Country getCountryIndia(){
        Country india=context.getBean("country", Country.class);
        return india;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries(){
        List<Country> countries = context.getBean("countries", List.class);
        return countries;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code){
        return countryService.getCountry(code);
    }


}
