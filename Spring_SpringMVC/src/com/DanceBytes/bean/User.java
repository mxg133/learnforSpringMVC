package com.DanceBytes.bean;

/**
 * @author 孟享广
 * @date 2020-11-21 4:08 下午
 * @description
 */
public class User {
    private Integer id;
    private String name;

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
