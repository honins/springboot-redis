package com.hy.demo.redis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author home-pc
 * @program: redis
 * @description: 项目自定义的redis配置
 * @date 2020-04-07 12:18:35
 */
@Configuration
@EnableConfigurationProperties(CustomRedisConfig.class)
@ConfigurationProperties(prefix = "custom.redis")
@Data
public class CustomRedisConfig {
    private Long defaultExpireTime;
}
