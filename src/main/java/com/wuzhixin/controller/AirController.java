package com.wuzhixin.controller;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuzhixin.entity.AirLineInfo;
import com.wuzhixin.service.AirService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 吴志新
 * 2019/6/13-21:32
 * webservice
 **/

/**
 * 返回json格式的
 */
@Controller
public class AirController {



    @ResponseBody
    @RequestMapping(value = {"/airPortHandle"},method = {RequestMethod.GET},produces="text/plain;charset=UTF-8")
    public String getInfoAirPort(@RequestParam("startCity")String startCity,
                                 @RequestParam("lastCity")String lastCity,
                                 @RequestParam("startTime")String startTime) throws Exception {
        System.out.println(startCity+lastCity+startTime);
        List<AirLineInfo> domesticAirlinesTimeString = AirService.getDomesticAirlinesTimeString(startCity, lastCity, startTime, "");
        ObjectMapper objectMapper = new ObjectMapper();
        String string = objectMapper.writeValueAsString(domesticAirlinesTimeString);

        StringBuffer  stringBuffer = new StringBuffer("{\"code\":0,\"count\":"+domesticAirlinesTimeString.size()+",\"data\":");
        return stringBuffer.append(string).append("}").toString();
    }
}
