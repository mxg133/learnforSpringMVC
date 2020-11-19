package com.DanceBytes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;
import java.util.Map;

/**
 * @author 孟享广
 * @date 2020-11-16 10:30 上午
 * @description
 */

@Controller
@RequestMapping("/mvc")
public class TestController {

    /**
     * 1.RequestMapping注解的作用是建立请求URL和处理方法之间的对应关系
     *
     * 2.RequestMapping注解可以作用在方法和类上
     *     1.作用在类上：第一级的访问目录
     *     2.作用在方法上：第二级的访问路径
     *     3.细节：路径可以不编写/表示应用的根目录开始
     *
     * 3.RequestMapping的属性
     *     1.path      指定请求路径的URL
     *     2.value     value属性和path属性是一样的
     *     3.method    指定该方法的请求方式
     *     4.param     指定限制请求参数的条件
     *
     * method = RequestMethod.POST
     * 参数必须有username，不能含有password 可以没有age有的话必须=12
     * params = {"username", "!password", "age!=12"}
     */
    @RequestMapping(value = "/test1"
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
        System.out.println(id + "----" + username);
        System.out.println("success!testREST....");
        return "success";
    }

    /**
     * View作用：
     *      处理模型数据， 实现页面转发、重点向
     *
     * View类型
     * InternalResourceView ：转发视图
     * JstlView ：转发视图
     * redirect ：重定向视图
     * @return
     */
//    重定向
    @RequestMapping(value = "/test2")
    public String test() {
//        return "success";//前缀 + string +后 缀
        return "redirect:/index.jsp";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(Map<String, Object> map, String username) {
        System.out.println(username);
        map.put("username", username);
        return "success";
    }
}
