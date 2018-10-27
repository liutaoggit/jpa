/*
 * 文件名：PersistStudent.java
 * 版权：Copyright 2016-2017 JoyinTech. Co. Ltd. All Rights Reserved.
 * 描述：中信银行资管系统
 * 修改人：liutao
 * 修改时间：2018年9月12日
 * 修改内容：新建
 * 系统名称：中信银行资管系统
 */
 
package jpa1.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa1.domain.StudentEntity;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author liutao
 * @version 1.0 2018年9月12日
 * @see PersistStudent
 * @since 1.0
 */
public class PersistStudent {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();

        StudentEntity s1 = new StudentEntity();
        s1.setId(1004);
        s1.setName("Maxsu");
        s1.setAge(26);

        StudentEntity s2 = new StudentEntity();
        s2.setId(1105);
        s2.setName("Yiibai");
        s2.setAge(23);

        StudentEntity s3 = new StudentEntity();
        s3.setId(1006);
        s3.setName("中文");
        s3.setAge(28);

        em.persist(s1);
        em.persist(s2);
        em.persist(s3);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
