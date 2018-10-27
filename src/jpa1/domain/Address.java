/*
 * 文件名：Address.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月9日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.domain;

import javax.persistence.Embeddable;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月9日
 * @see Address
 * @since 1.0
 */
@Embeddable
public class Address {
    private String province;
    private String city;
    
    /**
     * 获取 province
     * @return province.
     */
    public String getProvince() {
        return province;
    }
    
    /**
     * 设置 province
     * @param province province
     */
    public void setProvince(String province) {
        this.province = province;
    }
    
    /**
     * 获取 city
     * @return city.
     */
    public String getCity() {
        return city;
    }
    
    /**
     * 设置 city
     * @param city city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @param province
     * @param city
     */
    public Address(String province, String city) {
        super();
        this.province = province;
        this.city = city;
    }

    /**
     * 
     */
    public Address() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Address [province=" + province + ", city=" + city + "]";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((province == null) ? 0 : province.hashCode());
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
        Address other = (Address)obj;
        if (city == null) {
            if (other.city != null) {
                return false;
            }
        }
        else if (!city.equals(other.city)) {
            return false;
        }
        if (province == null) {
            if (other.province != null) {
                return false;
            }
        }
        else if (!province.equals(other.province)) {
            return false;
        }
        return true;
    }
    
}
