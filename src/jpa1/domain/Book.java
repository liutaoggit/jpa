/*
 * 文件名：Book.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月16日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */

package jpa1.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 〈一句话功能简述〉 〈功能详细描述〉
 * 
 * @author liutao
 * @version 1.0 2018年9月16日
 * @see Book
 * @since 1.0
 */
@Entity
public class Book implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String description;

    @ManyToOne
    // @JoinColumn(name="person_id")
    private Person person;

    public Object clone()
        throws CloneNotSupportedException {
        Book clone = (Book)super.clone();
        clone.person = (Person)clone.getPerson().clone();
        return clone;
        // return super.clone();
    }



    
    public static void main(String[] args)
        throws CloneNotSupportedException {
        Book book1 = new Book();
        Person person = new Person();
        book1.setPerson(person);
        Book book2 = (Book)book1.clone();
        System.out.println(book1.equals(book2));
        System.out.println(book1.getPerson().equals(book2.getPerson()));
        System.out.println(book1.getPerson() == book2.getPerson());
        System.out.println("--------------------");
        
    }

    /**
     * 获取 desc
     * 
     * @return desc.
     */
    // public String getDesc() {
    // return desc;
    // }

    /**
     * 设置 desc
     * 
     * @param desc desc
     */
    // public void setDesc(String desc) {
    // this.desc = desc;
    // }

    /**
     * 获取 id
     * 
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * 设置 id
     * 
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取 name
     * 
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 name
     * 
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 description
     * 
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 description
     * 
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 person
     * 
     * @return person.
     */
    public Person getPerson() {
        return person;
    }

    /**
     * 设置 person
     * 
     * @param person person
     */
    public void setPerson(Person person) {
        this.person = person;
    }




    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((person == null) ? 0 : person.hashCode());
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
        Book other = (Book)obj;
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        }
        else if (!description.equals(other.description)) {
            return false;
        }
        if (id != other.id) {
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
        if (person == null) {
            if (other.person != null) {
                return false;
            }
        }
        else if (!person.equals(other.person)) {
            return false;
        }
        return true;
    }

}
