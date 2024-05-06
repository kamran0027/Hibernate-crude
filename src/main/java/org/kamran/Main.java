package org.kamran;

import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        try (SessionFactory factory = HibernateUtil.getSessionFactory()) {
            System.out.println(factory);
            System.out.println("connection complete");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}