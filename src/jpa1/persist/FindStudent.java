/*
 * 文件名：FindStudent.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月12日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.persist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import jpa1.domain.Address;
import jpa1.domain.Employee;
import jpa1.domain.Library;
import jpa1.domain.StudentEntity;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月12日
 * @see FindStudent
 * @since 1.0
 */
public class FindStudent {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        StudentEntity find = em.find(StudentEntity.class, 1003);
//        find.setAge(30);
        Library find = em.find(Library.class, 1001);
        
//        em.remove(find);
        System.out.println(find);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    @Test
    public void func1(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        StudentEntity find = em.find(StudentEntity.class, 1004);
//        System.out.println(find);
        Employee e1=new Employee();
//        e1.setE_id(1004);
        e1.setE_name("zhagsan");
//        Address[] arr=new Address[]{new Address(201,"c1","e1")};
//        List<Address> list=new ArrayList<>(Arrays.asList(arr));
//        e1.setAddress(list);
//        Address address = new Address(202,"c2","e2");
//        Address address1 = new Address(203,"c3","e3");
        Map<Integer, Address> map=new HashMap<>();
//        map.put(001, address);
//        map.put(002, address1);
//        e1.setAddressMap(map);
        em.persist(e1);
//      
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    @Test
    public void func3(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
//        StudentEntity s1=new StudentEntity();
//        s1.setAge(22);
//        s1.setName("student1");
//        Library library=new Library();
//        library.setB_id(1001);
//        library.setB_name("library1");
//        library.setStudent(s1);
//        em.persist(library);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    
}
