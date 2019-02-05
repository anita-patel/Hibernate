package com.learning.hibernate.hibernate_v3;

import org.hibernate.Session;

import com.learning.hibernate.config.HibernateUtil;
import com.learning.hibernate.entities.Students;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session=HibernateUtil.getSessionfactory().getCurrentSession();
        session.beginTransaction();
        System.out.println("session created");
        Students s=new Students();
        s.setName("Laxmi");
        s.setEmailId("laxmi@gmail.com");
        s.setMobileNo("123456890");
        s.setMarks(89);
        
        session.save(s);
        session.getTransaction().commit();
    }
}
