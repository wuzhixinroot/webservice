package com.wuzhixin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webxml.ArrayOfString;
import com.webxml.WeatherWebService;
import com.webxml.WeatherWebServiceSoap;
import com.wuzhixin.entity.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 吴志新
 * 2019/6/11-16:43
 * webservice
 **/
@Controller
public class CityController {

    @Autowired
    private WeatherWebService weatherWebService;

    @RequestMapping(value = {"/cityHandle"},produces= "text/plain;charset=UTF-8")
    @ResponseBody
    public String cityHandle(@RequestParam("city")String city, ModelAndView mv) throws JsonProcessingException, ParseException {
        //得到soap对象
        WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
        System.out.println(city);
        System.out.println("ssssssssssssss");
        //返回字符串

        List<Weather> weathers = new ArrayList<>();
      //  Map<String ,Weather> map = new HashMap<>();
        ArrayOfString weatherInfo= weatherWebServiceSoap.getWeatherbyCityName(city);
        List<String> string = weatherInfo.getString();
        Weather weather = getInfo(string);
      //  map.put("data",weather);



        weathers.add(weather);
       // weathers.add(weather);


        ObjectMapper objectMapper = new ObjectMapper();
        String string1 = objectMapper.writeValueAsString(weathers);
        StringBuffer  stringBuffer = new StringBuffer("{\"code\":0,\"data\":");
        return stringBuffer.append(string1).append("}").toString();
    }

    /**
     *   private String cityName ;  //城市名字 索引 1
     *     private Date queryTime;  //查询时间       4
     *     private String  temperature; //温度      5
     *     private String condition ; //温度状况     6
     *     private String fengXiang ; //风况        7
     *     private String shikuang ; //实况        10
     *     private String tomorrowTemperature;  //明日温度 12
     *     private String tomorrowCondition ;   //明日状况 13
     *     private String tomorrowFengXiang ;  //明日风向  14
     *     private String afterTomorrowTemperature;  //后天温度 17
     *     private String afterTomorrowCondition ;   //后天状况 18
     *     private String afterAomorrowFengXiang ;  //后天风向  19
     *     private String cityDescription ;   //城市描述  22
     * @param strings
     * @return
     */

    public Weather getInfo(List<String> strings) throws ParseException {
        Weather weather = new Weather();

        if(strings!=null) {
            for (int i = 0; i < strings.size(); i++) {
                weather.setCityName(strings.get(1));
                weather.setQueryTime(strings.get(4));
                weather.setTemperature(strings.get(5));
                weather.setCondition(strings.get(6));
                weather.setFengXiang(strings.get(7));
                weather.setShikuang(strings.get(10));
                weather.setTomorrowTemperature(strings.get(12));
                weather.setTomorrowCondition(strings.get(13));
                weather.setTomorrowFengXiang(strings.get(14));
                weather.setAfterTomorrowTemperature(strings.get(17));
                weather.setAfterTomorrowCondition(strings.get(18));
                weather.setAfterAomorrowFengXiang(strings.get(19));
                weather.setCityDescription(strings.get(22));
            }
        }
      return weather;
    }
}
