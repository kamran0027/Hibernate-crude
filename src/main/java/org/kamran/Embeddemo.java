package org.kamran;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Embeddemo {
    public static void main(String[] args) {
        try {
            SessionFactory sessionFactory=HibernateUtil.getSessionFactory();

            Student student1=new Student();

            student1.setId(1236);
            student1.setAge(21);
            student1.setName("wasim");
            student1.setCity("gopalganj");

            Certificate certi1=new Certificate();

            certi1.setCourse("java training");
            certi1.setDuration("2 month");
            student1.setCerti(certi1);

            Student student2=new Student();
            student2.setId(1237);
            student2.setAge(20);
            student2.setName("gibrail");
            student2.setCity("chhapra");

            Certificate certi2=new Certificate();

            certi2.setCourse("web training");
            certi2.setDuration("3 month");
            student2.setCerti(certi2);
            Session session= sessionFactory.openSession();
            Transaction tx=session.beginTransaction();
            session.save(student1);
            session.save(student2);
            tx.commit();



            sessionFactory.close();
            System.out.println("done");
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }


    }
}
