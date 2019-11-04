package com.wuzhixin.service;

import com.wuzhixin.entity.AirLineInfo;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpProtocolParams;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.net.*;

/**
 * 吴志新
 * 2019/6/14-13:43
 * webservice
 **/
public class AirService {

    public static List<AirLineInfo> getDomesticAirlinesTimeString(String startCity ,String lastCity,String  theDate,String userID) throws Exception{
        String url = "/webservices/DomesticAirline.asmx/getDomesticAirlinesTime";
        String host = "www.webxml.com.cn";
        String param = "startCity="+URLEncoder.encode(startCity, "utf-8")+"&lastCity="+URLEncoder.encode(lastCity, "utf-8")+"&theDate="+theDate+"&userID="+userID+"";
        System.out.println("http://"+host+url+"?"+param);
        HttpClient httpclient = new DefaultHttpClient();
        httpclient.getParams().setParameter(HttpProtocolParams.HTTP_CONTENT_CHARSET,"UTF-8");

        HttpGet httpget = new HttpGet("http://"+host+url+"?"+param);

        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        String responseBody = httpclient.execute(httpget, responseHandler);
//              System.out.println(responseBody);
        List<AirLineInfo> airList = getDomesticAirlinesTime(responseBody);
        httpclient.getConnectionManager().shutdown();
        return airList;

    }
    //解析xml字符串
    /**
     *
     * @param xmlString 需要解析的xml字符串,也即xml中的字符串
     * @return
     */
    @SuppressWarnings("all")
    private static List<AirLineInfo>  getDomesticAirlinesTime (String xmlString) {
        // 使用 SAXReader 解析 XML
        SAXReader saxReader = new SAXReader();
        Document document = null;
        try {
            document =  DocumentHelper.parseText(xmlString);
        } catch (DocumentException e) {
            e.printStackTrace();
        }

        // 获取根节点
        Element root = document.getRootElement();
        // 打印节点名称
        //        System.out.println("<" + root.getName() + ">");

        // 获取根节点下的子节点遍历
        Iterator<?> iter = root.elementIterator("diffgram");
        //创建一个list集合用来存储获取到的信息
        List<AirLineInfo> list=new ArrayList<AirLineInfo>();
        // 遍历diffgram节点
        while (iter.hasNext()) {
            // 获取第一个diffgram节点
            Element empEle = (Element) iter.next();
            //           System.out.println("<" + empEle.getName() + ">");
            //获取Airlines节点
            Iterator elementIterator = empEle.elementIterator("Airlines");
            while (elementIterator.hasNext()) {
                Element object = (Element) elementIterator.next();
                Iterator airlinesTimes = object.elementIterator("AirlinesTime");
                //创建AirLineInfo对象
                AirLineInfo air=null;
                while (airlinesTimes.hasNext()) {
                    air=new AirLineInfo();
                    //循环遍历出了每一个AirlinesTime元素
                    Element airlinesTime = (Element) airlinesTimes.next();
//                          System.out.println(airlinesTime.getName());
                    Iterator everyElement = airlinesTime.elementIterator();
                    int count=1;
                    while (everyElement.hasNext()) {
                        Element every = (Element) everyElement.next();
//                              Item(Company)航空公司、
//                              Item(AirlineCode)航班号、
//                              Item(StartDrome)出发机场、
//                              Item(ArriveDrome)到达机场、
//                              Item(StartTime)出发时间、
//                              Item(ArriveTime)到达时间、
//                              Item(Mode)机型、
//                              Item(AirlineStop)经停
//                              、Item(Week)飞行周期（星期）
                        if(count==1){
                            air.setCompany(every.getStringValue());
                        }else if (count==2) {
                            air.setAirlineCode(every.getStringValue());
                        }else if (count==3) {
                            air.setStartDrome(every.getStringValue());
                        }else if (count==4) {
                            air.setArriveDrome(every.getStringValue());
                        }else if (count==5) {
                            air.setStartTime(every.getStringValue());
                        }else if (count==6) {
                            air.setArriveTime(every.getStringValue());
                        }else if (count==7) {
                            air.setMode(every.getStringValue());
                        }else if (count==8) {
                            air.setAirlineStop(every.getStringValue());
                        }else if (count==9) {
                            air.setWeek(every.getStringValue());
                        }
//                              System.out.println(every.getStringValue());
                        count++;
                    }
                    //把对象添加到集合中
                    list.add(air);
                    //保证count为 1~6
                    count=1;
                }
            }
        }
      //  循环遍历list集合
              for (AirLineInfo airLineInfo : list) {
                  System.out.println(airLineInfo);
              }
        return list;
    }



}
