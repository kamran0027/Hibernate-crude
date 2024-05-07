package org.kamran;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            System.out.println(factory);


            Student st=new Student();
            st.setId(103);
            st.setName("adarsh");
            st.setCity("grugaon");
            st.setAge(20);

            System.out.println(st);

            Session session=factory.openSession();
            Transaction tx=session.beginTransaction();

            session.save(st);
            tx.commit();
            session.close();
            System.out.println("transaction completed");
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
}