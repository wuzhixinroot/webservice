package com.wuzhixin.entity;

/**
 * 吴志新
 * 2019/6/13-21:33
 * webservice
 **/
public class AirPort {
    private String startCity ; //出发城市
    private String lastCity ;  //到达城市
    private String startTime ;  //开始时间


    public AirPort() {
    }

    @Override
    public String toString() {
        return "AirPort{" +
                "startCity='" + startCity + '\'' +
                ", lastCity='" + lastCity + '\'' +
                ", startTime='" + startTime + '\'' +
                '}';
    }

    public AirPort(String startCity, String lastCity, String startTime) {
        this.startCity = startCity;
        this.lastCity = lastCity;
        this.startTime = startTime;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getLastCity() {
        return lastCity;
    }

    public void setLastCity(String lastCity) {
        this.lastCity = lastCity;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
