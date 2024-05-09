package org.kamran;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Date;

public class AddressApp {
    public static void main(String[] args) {
        try {
            SessionFactory factory=HibernateUtil.getSessionFactory();

            System.out.println(factory);


            //creating Adsress
            Address ad=new Address();
            ad.setStreet("5th cross");
            ad.setCity("greater noida");
            ad.setAddedDate(new Date());

            //set the image
//            FileInputStream fis=new FileInputStream("src/main/java/pic.jpg");
//            byte[] data=new byte[fis.available()];
//            fis.read(data);
//            ad.setImage(data);


            Session session= factory.openSession();
            Transaction tx= session.beginTransaction();
            session.save(ad);
            tx.commit();
            session.close();
            System.out.println("succesful");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
