/*
 * 文件名：Course.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年10月14日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.domain;

import javax.persistence.Embeddable;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年10月14日
 * @see Course
 * @since 1.0
 */
@Embeddable
public class Course {
    private String name;
    private int age;
    
    /**
     * 获取 name
     * @return name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * 设置 name
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获取 age
     * @return age.
     */
    public int getAge() {
        return age;
    }
    
    /**
     * 设置 age
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
