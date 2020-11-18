package com.DanceBytes.controller;

import com.DanceBytes.bean.User;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 孟享广
 * @date 2020-11-16 3:51 下午
 * @description
 */

@Controller
public class ParamController {

    //required = false 表示不是必须有！
    @RequestMapping(value = "/param1", method = RequestMethod.POST)
    public String param(@RequestParam(value = "username", required = false, defaultValue = "admin")String username1, String password, String age, String province, String city, String country) {
        System.out.println(username1);
        System.out.println(password);
        System.out.println(age);
        System.out.println(province);
        System.out.println(city);
        System.out.println(country);
        return "success";
    }

    @RequestMapping(value = "/param2", method = RequestMethod.POST)
    public String param2(@RequestHeader(value = "Accept-Language", defaultValue = "admin")String h) {
        System.out.println(h);
        return "success";
    }

    @RequestMapping(value = "/param3", method = RequestMethod.POST)
    public String param3(@CookieValue(value = "JSESSIONID")String JSESSIONID1) {
        System.out.println(JSESSIONID1);
        return "success";
    }

    @RequestMapping(value = "/param4", method = RequestMethod.POST)
    public String param4(User user) {
        System.out.println(user);
        return "success";
    }

    /**
     * SpringMVC 在处理请求的过程中，往作用域中放值有以下 3 种方式：
     * 无论哪种方式，都是 最终把model数据 和 view数据封装到一个ModelAndView中8
     */
//    把 对象 放在 域 中的 第 1 种方式
    @RequestMapping(value = "/param5", method = RequestMethod.POST)
    public ModelAndView param5(@RequestParam(value = "username", required = false, defaultValue = "admin")String username1) {
        ModelAndView mav = new ModelAndView();
        //装在数据 放在request域
        mav.addObject("username", username1);
        //设置视图名称，实页面跳转
        mav.setViewName("success");
        return mav;
    }

//    把 对象 放在 域 中的 第 2 种方式
    @RequestMapping(value = "/param6", method = RequestMethod.POST)
    public String param6(Map<String, Object> map, @RequestParam(value = "username", required = false, defaultValue = "admin")String username1) {
        //装在数据 放在request域
        map.put("username", username1);
        //设置视图名称，实页面跳转
        return "success";
    }

//    把 对象 放在 域 中的 第 3 种方式
    @RequestMapping(value = "/param7", method = RequestMethod.POST)
    public String param7(Model model, @RequestParam(value = "username", required = false, defaultValue = "admin")String username1) {
        //装在数据 放在request域
        model.addAttribute("username", username1);
        //设置视图名称，实页面跳转
        return "success";
    }

    //解决乱码问题
//    @RequestMapping(value = "/param", method = RequestMethod.POST)
//    public String param8(Model model, @RequestParam(value = "username", required = false, defaultValue = "admin")String username1) {
//        //装在数据 放在request域
//        model.addAttribute("username", username1);
//        //设置视图名称，实页面跳转
//        return "success";
//    }

}
