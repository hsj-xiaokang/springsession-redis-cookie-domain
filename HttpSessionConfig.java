package com.gstar.acp.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieHttpSessionStrategy;

/**
* @author 作者heshengjin E-mail:2356899074@qq.com
* @version 创建时间：2017年9月19日 上午11:21:42
* 类说明
*/
@Configuration  
@EnableRedisHttpSession   
public class HttpSessionConfig {  
     @Bean  
     public CookieHttpSessionStrategy cookieHttpSessionStrategy() {  
         CookieHttpSessionStrategy strategy = new CookieHttpSessionStrategy();  
         strategy.setCookieSerializer(new SpringSessionCoustomCookieSerializer());  
         return strategy;  
     }  
}  
