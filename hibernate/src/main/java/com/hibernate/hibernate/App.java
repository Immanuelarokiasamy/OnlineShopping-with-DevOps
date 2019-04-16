package com.hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session ses=sf.openSession();
     /* name obj1=new name();
       obj1.setFname("imman");
       obj1.setLname("knight");*/
       stu obj=new stu();
       obj.setStudid(103);
       obj.setStudname("immu");
       Transaction tx=ses.beginTransaction();
      ses.save(obj);
      tx.commit();
      ses.close();
      sf.close();
       
    }
}
