package com.DanceBytes.rest.controller;

import com.DanceBytes.rest.bean.Department;
import com.DanceBytes.rest.bean.Employee;
import com.DanceBytes.rest.dao.DepartmentDao;
import com.DanceBytes.rest.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 孟享广
 * @date 2020-11-19 2:34 下午
 * @description
 */

@Controller
public class EmpController {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    /**
     * 获取员工信息
     * @param map
     * @return
     */
    @RequestMapping(value = "/emps")
    public String getAll(Map<String, Object> map) {
        Collection<Employee> emps = employeeDao.getAll();
        map.put("emps", emps);
        return "list";
    }

    /**
     * 跳转到添加页面
     */
    @RequestMapping(value = "/emp")
    public String toADD(Map<String, Object> map) {
        Collection<Department> depts = departmentDao.getDepartments();
        map.put("depts", depts);
        Map<String, Object> genders = new HashMap<>();
        genders.put("0", "女");
        genders.put("1", "男");
        map.put("genders", genders);
        //form标签有自动回显示的功能，会在页面能够默认获取request作用域 中command属性的值
//        map.put("command", new Employee());
        //在<form:form>标签设置的自定义名
        map.put("emp", new Employee());
        return "edit";
    }

    /**
     * 添加 员工信息
     * @param employee
     * @return
     */

    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    /**
     * 修改回显
     */
    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id")Integer id, Map<String, Object> map) {
        Employee employee = employeeDao.get(id);
        //设置存储性别的回显
        Map<String, Object> genders = new HashMap<>();
        map.put("emp", employee);
        genders.put("0", "女");
        genders.put("1", "男");
        map.put("genders", genders);
//        Collection<Department> depts = departmentDao.getDepartments();
//        map.put("depts", depts);
        return "edit";
    }

    /**
     * 修改
     */
    @RequestMapping(value = "emp", method = RequestMethod.PUT)
    public String updateEmp(Employee employee) {
        employeeDao.save(employee);
        return "redrect:/emps";
    }
}
