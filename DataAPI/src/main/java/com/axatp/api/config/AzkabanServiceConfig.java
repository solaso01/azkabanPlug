package com.axatp.api.config;


import com.axatp.api.proxy.AzkabanServiceProxyBuilder;
import com.axatp.api.service.AzkabanService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shirukai on 2019-06-03 11:05
 * 配置API，创建Bean，并注入Spring
 */
@Configuration
public class AzkabanServiceConfig {
    @Value("${com.azkaban.url}")
    private String uri;

    @Value("${com.azkaban.username}")
    private String username;

    @Value("${com.azkaban.password}")
    private String password;

    @Bean
    public AzkabanService azkabanService() {
        return AzkabanServiceProxyBuilder.create()
                .setUri(uri)
                .setUsername(username)
                .setPassword(password)
                .build();
    }
}
