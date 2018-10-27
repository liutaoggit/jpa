/*
 * 文件名：Chiild.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月16日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月16日
 * @see Chiild
 * @since 1.0
 */
@Entity
public class Child {
    @Id
    private String name;

    @ManyToOne
//    @JoinColumn(name="father_id")
    private Father father;
    
    
    
    /**
     * 获取 father
     * @return father.
     */
    public Father getFather() {
        return father;
    }



    
    /**
     * 设置 father
     * @param father father
     */
    public void setFather(Father father) {
        this.father = father;
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
