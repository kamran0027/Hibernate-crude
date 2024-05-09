
//this is configuration class of java by which we connect with the database;
package org.kamran;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null){
            Configuration configuration= new Configuration();
            Properties properties=new Properties();
            properties.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
            properties.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernate_db");
            properties.put(Environment.USER,"root");
            properties.put(Environment.PASS,"Kamran098@");
            properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
            properties.put(Environment.HBM2DDL_AUTO,"update");
            properties.put(Environment.SHOW_SQL,true);

            configuration.setProperties(properties);

            //add the class or entity name
            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(Address.class);

            ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory=configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}
