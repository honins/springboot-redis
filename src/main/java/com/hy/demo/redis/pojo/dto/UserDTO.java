package com.hy.demo.redis.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author home-pc
 * @program: redis
 * @description: 测试pojo类
 * @date 2020-04-07 11:15:15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private Integer age;
    private String guid;
    private Date createTime;

}
