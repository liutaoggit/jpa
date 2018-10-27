/*
 * 文件名：EmbedableTest.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月16日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import jpa1.domain.Address;
import jpa1.domain.Employee;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月16日
 * @see EmbedableTest
 * @since 1.0
 */
public class EmbedableTest {
    @Test
    public void func1(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Employee employee=new Employee();
        employee.setE_name("em1");
        Address address=new Address();
//        address.setE_city("c222");
        address.setE_pincode(1);
        address.setE_state("e111");
        employee.setAddress(address);
//        employee.setE_id("");
        
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
