package com.DanceBytes.bean;

import org.springframework.stereotype.Component;

/**
 * @author 孟享广
 * @date 2020-11-21 4:08 下午
 * @description
 */

@Component
public class User {
    private Integer id;
    private String name;

    public User() {
        System.out.println("默认构造.....");
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
