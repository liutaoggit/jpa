/*
 * 文件名：CascadeTest.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月16日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.persist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import jpa1.domain.Address;
import jpa1.domain.Book;
import jpa1.domain.Course;
import jpa1.domain.Employee;
import jpa1.domain.Person;
import jpa1.domain.StudentEntity;
import jpa1.domain.Subject;
import jpa1.domain.Teacher;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月16日
 * @see CascadeTest
 * @since 1.0
 */
public class CascadeTest {
    
    @Test
    public void func2(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Teacher teacher=new Teacher();
//        teacher.setId("4");
        teacher.setAge(30);
        teacher.setAddress(new Address("aaa", "bbb"));
        em.persist(teacher);
//        Set<Course> set=new HashSet<>();
//        Course course=new Course();
//        course.setName("as");
//        course.setAge(20);
//        set.add(course);
//        teacher.setCourseSet(set);
//        em.persist(teacher);
//        Employee find = em.find(Employee.class, 4);
//        em.remove(find);
//        Employee employee=new Employee();
//        List<Address> addresses=new ArrayList<>();
//        Address address=new Address();
//        address.setE_pincode(1);
//        address.setE_state("a");
//        addresses.add(address);
//        
//        Address address2=new Address();
//        address2.setE_pincode(2);
//        address2.setE_state("b");
//        addresses.add(address2);
//        employee.setAddresses(addresses);
//        employee.setE_id(3);
//        em.persist(employee);
//        StudentEntity find = em.find(StudentEntity.class, 27);
//        System.out.println(find);
//        em.remove(find);
//        Person find = em.find(Person.class, "1");
//        Book book=em.find(Book.class, 15);
//        System.out.println(find+" "+find.getBooks().size());
//        em.remove(find);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    @Test
    public void funcx3(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        StudentEntity find = em.find(StudentEntity.class, 14);
//        em.remove(find);
//        Subject find2 = em.find(Subject.class, "2");
//        find.setSubject(null);
//        find.setAge(22);
//        Person find = em.find(Person.class, "5");
        Book find = em.find(Book.class, 2);
        em.remove(find);
//        List<Book> books = find.getBooks();
//        find.setName("aaaaaaaa");
//        find.setBooks(null);
//        books=null;
//        em.remove(books.get(0));
//        System.out.println(books.size());
//        em.remove(find);
//        System.out.println(find);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    @Test
    public void func1(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        StudentEntity s=new StudentEntity();
        Subject subject=new Subject();
        em.persist(subject);
        s.setAge(22);
        s.setName("a");
        s.setSubject(subject);
        em.persist(s);
        
//        Person person=new Person();
//        person.setName("zhgsan");
//        Person person1=new Person();
//        person1.setName("lisi");
//        Person person2=new Person();
//        person2.setId("123");
//        person2.setName("wanger");
//        Book book=new Book();
//        book.setName("123");
//        book.setPerson(person);
//        List<Book> list=new ArrayList<>();
//        list.add(book);
//        person.setBooks(list);
//        person1.setBooks(list);
//        em.persist(person);
//        em.persist(person1);
//        em.persist(book);
//        Book book=em.find(Book.class, 3);
//        System.out.println(book);
//        em.remove(book);
        
//        Person person=em.find(Person.class, "1");
//        System.out.println(person);
//        em.remove(person);
//        StudentEntity studentEntity=em.find(StudentEntity.class, 2);
//        em.remove(studentEntity);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    @Test
    public void funx2(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Query query = em.createQuery("Select s from StudentEntity as s");
        List resultList = query.getResultList();
        for (Object object : resultList) {
            System.out.println(object);
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    @Test
    public void funx3(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
            
//        Query query = em.createQuery("update StudentEntity set name='zhgsan' where id>=15");
       Query query = em.createQuery("delete StudentEntity where id=15");
        query.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
