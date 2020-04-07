package com.hy.demo.redis.controller;
import java.util.Date;

import com.hy.demo.redis.config.CustomRedisConfig;
import com.hy.demo.redis.pojo.dto.UserDTO;
import com.hy.demo.redis.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author home-pc
 * @program: redis
 * @description: redis控制器
 * @date 2020-04-07 11:17:19
 */
@Slf4j
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource
    private RedisUtil redisUtil;
    @Resource
    private CustomRedisConfig customRedisConfig;

    /**
     * 向redis存值
     * @param key
     * @param value
     * @return
     */
    @RequestMapping("/set")
    public boolean set(
            @RequestParam String key,
            @RequestParam String value
    ){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(0);
        userDTO.setName(value);
        userDTO.setAge(18);
        userDTO.setGuid("123");
        userDTO.setCreateTime(new Date());
        return redisUtil.set(key,userDTO,customRedisConfig.getDefaultExpireTime());
//        return redisUtil.set(key,value);
    }

    /**
     * 向redis取值
     * @param key
     * @return
     */
    @RequestMapping("/get")
    public Object get(
            @RequestParam String key
    ){
        return redisUtil.get(key);
    }

    /**
     * 设置过期时间
     * @param key
     * @return
     */
    @RequestMapping("/setExpire")
    public boolean setExpire(
            @RequestParam String key
    ){
        return redisUtil.expire(key,customRedisConfig.getDefaultExpireTime());
    }

}
