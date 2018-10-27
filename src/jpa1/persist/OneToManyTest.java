/*
 * 文件名：OneToManyTest.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月16日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.persist;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import jpa1.domain.Book;
import jpa1.domain.Person;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月16日
 * @see OneToManyTest
 * @since 1.0
 */
public class OneToManyTest {
    @Test
    public void func1(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person=new Person();
        person.setName("zhgsan");
        Person person1=new Person();
        person1.setName("lisi");
        Person person2=new Person();
        person2.setId("123");
        person2.setName("wanger");
        em.persist(person);
        em.persist(person1);
        em.persist(person2);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    @Test
    public void func2(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person=new Person();
        person.setName("zhangsan");
        
        Book book1=new Book();
        book1.setDescription("aaa");
//        book1.setDesc("ssss");
        book1.setName("水浒传");
      
        Book book2=new Book();
        book2.setDescription("aaaa");
        book2.setName("三国");
        
        em.persist(book1);
        em.persist(book2);
        
        List<Book> books=new ArrayList<>();
       books.add(book1);
       books.add(book2);
       
        person.setBooks(books);
        em.persist(person);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
