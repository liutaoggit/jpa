/*
 * 文件名：Employee.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月12日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.domain;

import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.eclipse.persistence.annotations.CascadeOnDelete;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月12日
 * @see Employee
 * @since 1.0
 */

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int e_id;
    private String e_name;
    
    @ElementCollection
//    @CascadeOnDelete
//    @Embedded
//    private Address address;
//    private Map<Integer, Address> addressMap;
    private List<Address> addresses;
    
    
    
    
    /**
     * 获取 addresses
     * @return addresses.
     */
    public List<Address> getAddresses() {
        return addresses;
    }


    
    /**
     * 设置 addresses
     * @param addresses addresses
     */
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }


    /**
     * 获取 e_id
     * @return e_id.
     */
    public int getE_id() {
        return e_id;
    }
    
    

    

    /**
     * 设置 e_id
     * @param e_id e_id
     */
    public void setE_id(int e_id) {
        this.e_id = e_id;
    }
    
    /**
     * 获取 e_name
     * @return e_name.
     */
    public String getE_name() {
        return e_name;
    }
    
    /**
     * 设置 e_name
     * @param e_name e_name
     */
    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    
    /**
     * 获取 addressMap
     * @return addressMap.
     */
//    public Map<Integer, Address> getAddressMap() {
//        return addressMap;
//    }

    
    /**
     * 设置 addressMap
     * @param addressMap addressMap
     */
//    public void setAddressMap(Map<Integer, Address> addressMap) {
//        this.addressMap = addressMap;
//    }

    
    
}
