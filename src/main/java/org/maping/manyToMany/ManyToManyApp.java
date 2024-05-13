package org.maping.manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.kamran.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ManyToManyApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();

        Emp e1=new Emp();
        Emp e2=new Emp();

        e1.setId(100);
        e1.setName("kamran");


        e2.setId(101);
        e2.setName("wasim");


        Project p1=new Project();
        Project p2=new Project();

        p1.setpId(200);
        p1.setProjectname("online book store");

        p2.setpId(201);
        p2.setProjectname("bank app");

        List<Emp> list1=new ArrayList<Emp>();
        List<Project> list2=new ArrayList<Project>();


        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);

        e1.setProject(list2);
        p2.setEmps(list1);

        Session session=sessionFactory.openSession();

        Transaction tx= session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);


        tx.commit();

        session.close();

        System.out.println("done");



    }
}
