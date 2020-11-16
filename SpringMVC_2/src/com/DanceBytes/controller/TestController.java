package com.DanceBytes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

/**
 * @author 孟享广
 * @date 2020-11-16 10:30 上午
 * @description
 */

@Controller
@RequestMapping("/mvc")
public class TestController {

    /**
     * method = RequestMethod.POST
     * 参数必须有username，不能含有password 可以没有age有的话必须=12
     * params = {"username", "!password", "age!=12"}
     */
    @RequestMapping(value = "/test"
//            method = RequestMethod.POST,
//            params = {"username", "!password", "age!=12"},
//            headers = {"Accept-Language=zh-CN,zh;q=0.8"}
    )
    public String test1() {
        System.out.println("success!11");
        return "success";
    }

    @RequestMapping("/*/ant??/**/testAnt")
    public String test2() {
        System.out.println("success!testAnt....");
        return "success";
    }

    @RequestMapping("/testREST/{id}/{username}")
    public String testREST(@PathVariable("id")Integer id, @PathVariable("username")String username) {
        System.out.println(id  + "----" + username);
        System.out.println("success!testREST....");
        return "success";
    }
}
