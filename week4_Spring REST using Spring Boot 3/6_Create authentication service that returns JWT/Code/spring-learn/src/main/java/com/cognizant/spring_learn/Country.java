package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Country {
    private static final Logger logger= LoggerFactory.getLogger(Country.class);
    private String code;
    private String name;
    public Country(){
        logger.debug("Inside Country constructor");
    }

    public String getCode() {
        logger.debug("Inside getCode()");
        return this.code;
    }

    public void setCode(String code) {
        logger.debug("Inside setCode()");
        this.code = code;
    }

    public String getName() {
        logger.debug("Inside getName()");
        return this.name;
    }

    public void setName(String name) {
        logger.debug("Inside setName()");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
