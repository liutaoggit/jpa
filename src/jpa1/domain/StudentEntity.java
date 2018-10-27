/*
 * 文件名：StudentEntity.java
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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.CascadeOnDelete;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月12日
 * @see StudentEntity
 * @since 1.0
 */

@Entity
@Table(name="student")
public class StudentEntity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    @OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
//    @CascadeOnDelete
    private Subject subject;
    
    
    
    
    /**
     * 获取 subject
     * @return subject.
     */
    public Subject getSubject() {
        return subject;
    }

    
    /**
     * 设置 subject
     * @param subject subject
     */
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * 获取 id
     * @return id.
     */
    public int getId() {
        return id;
    }
    
    /**
     * 设置 id
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }
    
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

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "StudentEntity [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    
}
