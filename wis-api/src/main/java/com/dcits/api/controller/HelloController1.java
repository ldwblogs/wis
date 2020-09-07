package com.dcits.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("这是一个欢迎接口类1")
@RestController
public class HelloController1 {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @GetMapping("hello1")
    @ApiOperation("这是一个Hello的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "base",value = "就是base"),
            @ApiImplicitParam(name = "hello",value = "就是hello")
    })
    public String hello(String base,String hello){

        String mykey = redisTemplate.opsForValue().get("mykey");
        System.out.println(mykey);
        return mykey;
    }
}
