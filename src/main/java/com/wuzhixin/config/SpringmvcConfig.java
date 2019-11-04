package com.wuzhixin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 吴志新
 * 2019/6/11-17:24
 * webservice
 **/
@Configuration //spring mvc配置类
@ComponentScan(value = {"com.wuzhixin.controller"},includeFilters = {@ComponentScan.Filter(
        type = FilterType.ANNOTATION,classes = Controller.class
)},useDefaultFilters = false)  //只扫描控制器
@EnableWebMvc  //定制mvc配置
public class SpringmvcConfig implements WebMvcConfigurer {

    //注册视图解析器
   // @Override
   public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/myjsp/",".jsp");
    }

    //开启静态资源访问
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
