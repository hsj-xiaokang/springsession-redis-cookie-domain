package com.gstar.acp.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

/**
 * 配置spring sesssion cookie根域名为"/"多模块session共享
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
         DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer(); 
         cookieSerializer.setCookiePath("/");
         strategy.setCookieSerializer(cookieSerializer);  
         return strategy;  
     }  
}  
