package com.dcits.api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 一些声明信息
 * Description: 全局跨域处理
 * date: 2020/9/2 10:11<br/>
 *
 * @author lidw3<br />
 * @since JDK 1.8
 */

@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // 允许域名
        corsConfiguration.addAllowedHeader("*"); // 允许头
        corsConfiguration.addAllowedMethod("*"); // 允许方法
        return corsConfiguration;

    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}
