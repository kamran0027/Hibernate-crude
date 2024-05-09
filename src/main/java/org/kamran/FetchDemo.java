package org.kamran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FetchDemo {
    public static void main(String[] args) {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        System.out.println("project started");
        Session session=factory.openSession();

        //get - student information
        // we can use load instead of get
        Student student=session.get(Student.class,101);
//        Student student=session.load(Student.class,101);
        System.out.println(student);
        session.close();
        factory.close();

        System.out.println("done...");

    }



}
