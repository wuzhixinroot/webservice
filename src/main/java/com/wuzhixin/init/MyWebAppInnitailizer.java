package com.wuzhixin.init;

import com.wuzhixin.config.SpringConfig;
import com.wuzhixin.config.SpringmvcConfig;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * 吴志新
 * 2019/6/11-19:35
 * webservice
 **/
public class MyWebAppInnitailizer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //父容器spring容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //子容器springmvc容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringmvcConfig.class};
    }

    //映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //配置字符编码过滤器
    @Override
    protected Filter[] getServletFilters() {

        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[] {characterEncodingFilter};

    }
}
