/*
 * 文件名：Father.java
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
import javax.persistence.OneToMany;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月16日
 * @see Father
 * @since 1.0
 */
@Entity
public class Father {
    @Id
    private String name;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Child> childs;
    
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
     * 获取 childs
     * @return childs.
     */
    public List<Child> getChilds() {
        return childs;
    }
    
    /**
     * 设置 childs
     * @param childs childs
     */
    public void setChilds(List<Child> childs) {
        this.childs = childs;
    }
    
}
