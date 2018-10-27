/*
 * 文件名：Person.java
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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月16日
 * @see Person
 * @since 1.0
 */
@Entity
public class Person implements Cloneable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private String name;
    @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
    @JoinColumn(name="person_id")
    private List<Book> books;
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    /**
     * 获取 books
     * @return books.
     */
    public List<Book> getBooks() {
        return books;
    }


    
    /**
     * 设置 books
     * @param books books
     */
    public void setBooks(List<Book> books) {
        this.books = books;
    }


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
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((books == null) ? 0 : books.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person)obj;
        if (books == null) {
            if (other.books != null) {
                return false;
            }
        }
        else if (!books.equals(other.books)) {
            return false;
        }
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        }
        else if (!id.equals(other.id)) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}
