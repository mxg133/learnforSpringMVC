package com.DanceBytes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 孟享广
 * @date 2020-11-21 2:55 下午
 * @description MVC异常处理
 */

@Controller
public class TestException {

    @RequestMapping(value = "testException", method = RequestMethod.GET)
    public String testException() {
        //制造异常
        String str = null;
        str.substring(0, 5);
        return "success";
    }
}
