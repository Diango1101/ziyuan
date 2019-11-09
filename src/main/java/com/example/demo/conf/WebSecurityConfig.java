package com.example.demo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Configuration
public class WebSecurityConfig extends WebMvcConfigurationSupport {
    public final static String SESSION_KEY="username";

    @Bean
    public SecurityInterceptor getSecurityInterceptor(){
        return new SecurityInterceptor();
    }

    public void  addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
        addInterceptor.excludePathPatterns("/QueryByClick");
        addInterceptor.excludePathPatterns("/defaultKaptcha");
        addInterceptor.excludePathPatterns("/login","/index","/error");
        addInterceptor.excludePathPatterns("/register","/getAllUser");
        addInterceptor.excludePathPatterns("/imgvrifyControllerDefaultKaptcha","/registerin");
//        addInterceptor.excludePathPatterns("/**/*.css","/**/*.js","/**/*.jpg","/css/**","/js/**","/images/**");
//        addInterceptor.excludePathPatterns("/**");
        addInterceptor.addPathPatterns("/index-s","/index-t","/zhuce","/index-admin"
        ,"/myblog","/query1","/openblog","/openblogt","/opencourse","/coursemanage","/admin-addStudent"
        ,"/admin-addTeacher","/admin-selecttea");
//        addInterceptor.addPathPatterns("/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/resources/**")
                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/js")
                .addResourceLocations("classpath:/css");
        super.addResourceHandlers(registry);



    }

    private class SecurityInterceptor extends HandlerInterceptorAdapter {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
            HttpSession session = request.getSession();

//            判断是否已有该用户登录的session
            if(session.getAttribute(SESSION_KEY) != null){
                return true;
            }

//            跳转到登录页
            String url = "/index";
            response.sendRedirect(url);
            return false;
        }
    }
}
