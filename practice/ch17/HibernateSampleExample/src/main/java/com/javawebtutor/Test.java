package com.javawebtutor;
 
import java.util.Date;
 
import org.hibernate.Session;
 
/** 
 * 
 USE hibernate;
 
 CREATE TABLE USER (
 	USER_ID INT (5) NOT NULL,
 	USERNAME VARCHAR (20) NOT NULL,
 	CREATED_BY VARCHAR (20) NOT NULL,
 	CREATED_DATE DATE NOT NULL,
 	PRIMARY KEY ( USER_ID )
);
 */


public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        User user = new User();
 
        user.setUserId(1);
        user.setUsername("RyanB");
        user.setCreatedBy("Ryan with tutorial");
        user.setCreatedDate(new Date());
 
        session.save(user);
        session.getTransaction().commit();
 
    }
 
}