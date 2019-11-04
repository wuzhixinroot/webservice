package com.wuzhixin.config;


import com.webxml.WeatherWebService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 吴志新
 * 2019/6/11-17:24
 * webservice
 **/
@Configuration
@ComponentScan(value = {"com.webxml","com.wuzhixin"},excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)})
public class SpringConfig {

    @Bean
    public WeatherWebService weatherWebService(){
        return new WeatherWebService();
    }



}
