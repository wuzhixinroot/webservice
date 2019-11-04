package com.wuzhixin.entity;

/**
 * 吴志新
 * 2019/6/14-13:39
 * webservice
 **/
public class CityInfo {
    private String enCityName; //  (enCityName)城市英文名称、
    private String cnCityName; //  Item(cnCityName)城市中文名称
    private String abbreviation; // Item(Abbreviation)缩写

 public String getEnCityName() { return enCityName; }
 public void setEnCityName(String enCityName) { this.enCityName = enCityName; }
 public String getCnCityName() { return cnCityName; }
 public void setCnCityName(String cnCityName) { this.cnCityName = cnCityName; }
 public String getAbbreviation() { return abbreviation; }
 public void setAbbreviation(String abbreviation) { this.abbreviation = abbreviation; }
 @Override public String toString()
 { return "CityInfo [城市英文名称=" + enCityName + ", 城市中文名称=" + cnCityName + ", 缩写=" + abbreviation + "]"; } }