/*
 * 文件名：Subject.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月16日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月16日
 * @see Subject
 * @since 1.0
 */
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    
//    @OneToOne(mappedBy="sub_id")
//    private StudentEntity studentEntity;
    
    
    
    
    /**
     * 获取 studentEntity
     * @return studentEntity.
     */
//    public StudentEntity getStudentEntity() {
//        return studentEntity;
//    }

    
    /**
     * 设置 studentEntity
     * @param studentEntity studentEntity
     */
//    public void setStudentEntity(StudentEntity studentEntity) {
//        this.studentEntity = studentEntity;
//    }

    /**
     * 获取 id
     * @return id.
     */
    public Long getId() {
        return id;
    }
    
    /**
     * 设置 id
     * @param id id
     */
    public void setId(Long id) {
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
    
}
