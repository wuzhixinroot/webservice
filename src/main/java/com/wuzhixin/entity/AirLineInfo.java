package com.wuzhixin.entity;

/**
 * 吴志新
 * 2019/6/14-13:35
 * webservice
 **/
public class AirLineInfo {
    //     <Company>吉祥航空</Company>
//       <AirlineCode>HO1252</AirlineCode>
//       <StartDrome>北京首都国际机场</StartDrome>
//       <ArriveDrome>上海虹桥国际机场</ArriveDrome>
//       <StartTime>06:50</StartTime>
//       <ArriveTime>09:05</ArriveTime>
//       <Mode>320</Mode>
//       <AirlineStop>0</AirlineStop>
//       <Week>123456日</Week>
//  返回数据：DataSet，Table(0)结构为
//  Item(Company)航空公司、
//  Item(AirlineCode)航班号、
//  Item(StartDrome)出发机场、
//  Item(ArriveDrome)到达机场、
//  Item(StartTime)出发时间、
//  Item(ArriveTime)到达时间、
//  Item(Mode)机型、
//  Item(AirlineStop)经停
//  、Item(Week)飞行周期（星期）
    private String company;
    private String airlineCode;
    private String startDrome;
    private String arriveDrome;
    private String startTime;
    private String arriveTime;
    private String mode;
    private String airlineStop;
    private String week;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getStartDrome() {
        return startDrome;
    }

    public void setStartDrome(String startDrome) {
        this.startDrome = startDrome;
    }

    public String getArriveDrome() {
        return arriveDrome;
    }

    public void setArriveDrome(String arriveDrome) {
        this.arriveDrome = arriveDrome;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getAirlineStop() {
        return airlineStop;
    }

    public void setAirlineStop(String airlineStop) {
        this.airlineStop = airlineStop;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "AirLineInfo [航空公司=" + company + ", 航班号=" + airlineCode + ", 出发机场=" + startDrome + ", 到达机场=" + arriveDrome + ", 出发时间=" + startTime + ", 到达时间=" + arriveTime + ", 机型=" + mode + ", 经停=" + airlineStop + ", 飞行周期（星期）=" + week + "]";
    }
}

