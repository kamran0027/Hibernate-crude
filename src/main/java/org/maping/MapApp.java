package org.maping;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.kamran.HibernateUtil;

public class MapApp {
    public static void main(String[] args) {
        try {
            SessionFactory factory= HibernateUtil.getSessionFactory();

            //creating question

            Question q1=new Question();


            q1.setQuestionId(121);
            q1.setQuestion("what is programing ?");

            // creating answer

            Answer answer=new Answer();

            answer.setAnswerid(221);
            answer.setAnswer("programing  is sequence of instruction that execute on machine.");

            q1.setAnswer(answer);
            Session session= factory.openSession();

            Transaction tx= session.beginTransaction();
            session.save(q1);
            session.save(answer);
            tx.commit();

            factory.close();

            System.out.println("done");
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
    }
}
