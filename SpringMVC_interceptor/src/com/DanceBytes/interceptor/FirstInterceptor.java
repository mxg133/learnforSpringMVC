package com.DanceBytes.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author 孟享广
 * @date 2020-11-21 10:54 上午
 * @description 拦截器类
 */

@Component
public class FirstInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("First: preHandle");
        return false;//代表拦截!
//        return true;//代表放行 不拦截!
    }

    /**
     * 能进入postHandle() 说明请求一定是符合规则的
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("First: postHandle");
    }

    /**
     * 更不要返回值了 就是个关闭资源的 Finally
     */
    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("First: afterCompletion");
    }
}
