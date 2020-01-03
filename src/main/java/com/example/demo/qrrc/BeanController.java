package com.example.demo.qrrc;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhou_gc@suixingpay.com
 * @description
 * @date 2020/1/2 14:59
 */



@Api(value = "测试类")
@RestController
public class BeanController {

    @RequestMapping(value = "/getBean")
    @ApiOperation(value = "获取bean")
    @ApiImplicitParam(name = "bean名", dataType="String")
    @ApiResponse(message = "返回bean+name",code = 200)
    public String getBean(String name){
        return "hello world"+name;
    }



}
