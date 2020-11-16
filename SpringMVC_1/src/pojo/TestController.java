package pojo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 孟享广
 * @date 2020-11-15 7:52 下午
 * @description
 */

@Controller
public class TestController {
    /**
     * localhost:8080/SpringMVC_1/hello
     */

    @RequestMapping("hello")
    public String hello(String username, String password) {
        System.out.println("66");
        System.out.println(username+password);
        return "success";//视图名称
    }
}
