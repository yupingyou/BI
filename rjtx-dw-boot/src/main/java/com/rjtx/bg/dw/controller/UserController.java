package com.rjtx.bg.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/6/13.
 */
@Controller
public class UserController {

    @RequestMapping("test1")
    @ResponseBody
    public String test1(){
        return "test1";
    }
}
