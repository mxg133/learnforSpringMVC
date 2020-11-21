package com.DanceBytes.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 孟享广
 * @date 2020-11-21 11:21 上午
 * @description
 */

@Controller
public class TestInterceptorController {

    /**
     * preHandle()最为重要，可以控制控制器是否执行
     *
     * 当有多个拦截器时 --preHandle()返回都为true
     * preHandle()：按照拦截器数组的 正向 顺序执行
     * postHandle():按照拦截器数组的 反向 顺序执行
     * afterCompletion(): 按照拦截器数组的 反向 顺序执行
     *
     * 当多个拦截器的preHandle()返回值不同时
     * 第一个返回false 第二个返回false：
     *      只有第一个preHandle()会执行
     * 第一个返回true 第二个返回false：
     *      （全部）preHandle()会执行，（全部）postHandle()都不执行，
     *      （返回false拦截器之前的所有）第一个afterCompletion()（都）执行
     * 第一个返回false 第二个返回true：
     *      只有第一个preHandle()会执行
     */
    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
//        System.out.println(12/0);
        System.out.println("我是程序");
        return "success";
    }
}
