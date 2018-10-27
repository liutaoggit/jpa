/*
 * 文件名：Library.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月12日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月12日
 * @see Library
 * @since 1.0
 */

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int b_id;
    private String b_name;
    
    @OneToOne(cascade={CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.REFRESH})
    private StudentEntity student;

    
    /**
     * 获取 b_id
     * @return b_id.
     */
    public int getB_id() {
        return b_id;
    }

    
    /**
     * 设置 b_id
     * @param b_id b_id
     */
    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    
    /**
     * 获取 b_name
     * @return b_name.
     */
    public String getB_name() {
        return b_name;
    }

    
    /**
     * 设置 b_name
     * @param b_name b_name
     */
    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    
    /**
     * 获取 student
     * @return student.
     */
    public StudentEntity getStudent() {
        return student;
    }

    
    /**
     * 设置 student
     * @param student student
     */
    public void setStudent(StudentEntity student) {
        this.student = student;
    }
    

}
