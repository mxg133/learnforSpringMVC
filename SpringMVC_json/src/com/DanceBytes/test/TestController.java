package com.DanceBytes.test;


import com.DanceBytes.bean.Employee;
import com.DanceBytes.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * @author 孟享广
 * @date 2020-11-20 12:22 下午
 * @description
 */

@Controller
public class TestController {

    @Autowired
    private EmployeeDao employeeDao;

    /**
     * SpringMVC 处理JSON 的四个条件
     * 1 jar包
     * 2 springMVC开启mvc驱动 <mvc:annotation-driven/>
     * 3 在处理Ajax请求 加@ResponseBody
     * 4 将对象地址作为返回值
     *
     * @ResponseBody 表示方法是响应体 就不能进行页面跳转了
     * @return 返回的string不是视图名称 而是返回到客户端的数据
     */
    @RequestMapping(value = "testJson")
    @ResponseBody
    public Collection<Employee> testJson() {
        Collection<Employee> emps = employeeDao.getAll();
        return emps;//返回的是 地址值
    }

}
