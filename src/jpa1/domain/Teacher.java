/*
 * 文件名：Teacher.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年10月14日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年10月14日
 * @see Teacher
 * @since 1.0
 */
@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private String id;
    private Integer age;
    @Embedded
    private Address address;
//    @Embedded
//    private Course course;
    
//    private Address1 address1;
//    @ElementCollection
//    @CollectionTable(name="course")
//    private Set<Course> courseSet=new HashSet<>();
    
    
    /**
     * 获取 courseSet
     * @return courseSet.
     */
//    public Set<Course> getCourseSet() {
//        return courseSet;
//    }

    
    /**
     * 设置 courseSet
     * @param courseSet courseSet
     */
//    public void setCourseSet(Set<Course> courseSet) {
//        this.courseSet = courseSet;
//    }

    /**
     * 获取 id
     * @return id.
     */
    public String getId() {
        return id;
    }
    
    /**
     * 设置 id
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * 获取 age
     * @return age.
     */
    public Integer getAge() {
        return age;
    }
    
    /**
     * 设置 age
     * @param age age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    
    /**
     * 获取 address
     * @return address.
     */
    public Address getAddress() {
        return address;
    }

    
    /**
     * 设置 address
     * @param address address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    
    /**
     * 获取 address1
     * @return address1.
     */
//    public Address1 getAddress1() {
//        return address1;
//    }
//
//    
//    /**
//     * 设置 address1
//     * @param address1 address1
//     */
//    public void setAddress1(Address1 address1) {
//        this.address1 = address1;
//    }
//    
    
}
