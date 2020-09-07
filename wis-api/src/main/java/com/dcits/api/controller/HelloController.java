package com.dcits.api.controller;


import com.dcits.api.common.APIResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("这是一个欢迎接口类")
@RestController
public class HelloController {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @GetMapping({"","hello"})
    @ApiOperation("这是一个Hello的方法")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "base",value = "就是base"),
            @ApiImplicitParam(name = "hello",value = "就是hello")
    })
    public APIResult<String> hello(String base, String hello){
        APIResult<String> apiResult = new APIResult<String>();
        String mykey = redisTemplate.opsForValue().get("mykey");
        System.out.println(mykey);
        apiResult.setCode(200);
        apiResult.setMsg("成功");
        apiResult.setData(mykey);
        return apiResult;
    }
}
