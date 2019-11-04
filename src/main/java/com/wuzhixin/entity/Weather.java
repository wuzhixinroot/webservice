package com.wuzhixin.entity;


/**
 * 吴志新
 * 2019/6/11-21:23
 * webservice
 **/
public class Weather {
    private String cityName ;  //城市名字 索引 1

    private String queryTime;  //查询时间       4
    private String  temperature; //温度      5
    private String condition ; //温度状况     6
    private String fengXiang ; //风况        7
    private String shikuang ; //实况        10

    private String tomorrowTemperature;  //明日温度 12
    private String tomorrowCondition ;   //明日状况 13
    private String tomorrowFengXiang ;  //明日风向  14

    private String afterTomorrowTemperature;  //后天温度 17
    private String afterTomorrowCondition ;   //后天状况 18
    private String afterAomorrowFengXiang ;  //后天风向  19

    private String cityDescription ;   //城市描述  22


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getFengXiang() {
        return fengXiang;
    }

    public void setFengXiang(String fengXiang) {
        this.fengXiang = fengXiang;
    }

    public String getShikuang() {
        return shikuang;
    }

    public void setShikuang(String shikuang) {
        this.shikuang = shikuang;
    }

    public String getTomorrowTemperature() {
        return tomorrowTemperature;
    }

    public void setTomorrowTemperature(String tomorrowTemperature) {
        this.tomorrowTemperature = tomorrowTemperature;
    }

    public String getTomorrowCondition() {
        return tomorrowCondition;
    }

    public void setTomorrowCondition(String tomorrowCondition) {
        this.tomorrowCondition = tomorrowCondition;
    }

    public String getTomorrowFengXiang() {
        return tomorrowFengXiang;
    }

    public void setTomorrowFengXiang(String tomorrowFengXiang) {
        this.tomorrowFengXiang = tomorrowFengXiang;
    }

    public String getAfterTomorrowTemperature() {
        return afterTomorrowTemperature;
    }

    public void setAfterTomorrowTemperature(String afterTomorrowTemperature) {
        this.afterTomorrowTemperature = afterTomorrowTemperature;
    }

    public String getAfterTomorrowCondition() {
        return afterTomorrowCondition;
    }

    public void setAfterTomorrowCondition(String afterTomorrowCondition) {
        this.afterTomorrowCondition = afterTomorrowCondition;
    }

    public String getAfterAomorrowFengXiang() {
        return afterAomorrowFengXiang;
    }

    public void setAfterAomorrowFengXiang(String afterAomorrowFengXiang) {
        this.afterAomorrowFengXiang = afterAomorrowFengXiang;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    public Weather() {
    }

    @Override
    public String toString() {
        return "Weather{" +
                "cityName='" + cityName + '\'' +
                ", queryTime='" + queryTime + '\'' +
                ", temperature='" + temperature + '\'' +
                ", condition='" + condition + '\'' +
                ", fengXiang='" + fengXiang + '\'' +
                ", shikuang='" + shikuang + '\'' +
                ", tomorrowTemperature='" + tomorrowTemperature + '\'' +
                ", tomorrowCondition='" + tomorrowCondition + '\'' +
                ", tomorrowFengXiang='" + tomorrowFengXiang + '\'' +
                ", afterTomorrowTemperature='" + afterTomorrowTemperature + '\'' +
                ", afterTomorrowCondition='" + afterTomorrowCondition + '\'' +
                ", afterAomorrowFengXiang='" + afterAomorrowFengXiang + '\'' +
                ", cityDescription='" + cityDescription + '\'' +
                '}';
    }

    public Weather(String cityName, String queryTime, String temperature, String condition, String fengXiang, String shikuang, String tomorrowTemperature, String tomorrowCondition, String tomorrowFengXiang, String afterTomorrowTemperature, String afterTomorrowCondition, String afterAomorrowFengXiang, String cityDescription) {
        this.cityName = cityName;
        this.queryTime = queryTime;
        this.temperature = temperature;
        this.condition = condition;
        this.fengXiang = fengXiang;
        this.shikuang = shikuang;
        this.tomorrowTemperature = tomorrowTemperature;
        this.tomorrowCondition = tomorrowCondition;
        this.tomorrowFengXiang = tomorrowFengXiang;
        this.afterTomorrowTemperature = afterTomorrowTemperature;
        this.afterTomorrowCondition = afterTomorrowCondition;
        this.afterAomorrowFengXiang = afterAomorrowFengXiang;
        this.cityDescription = cityDescription;
    }
}
