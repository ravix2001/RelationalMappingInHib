package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App
{
    public static void main( String[] args )
    {

        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Acer");

        Student std = new Student();
        std.setSid(1);
        std.setSname("Ravi");
        std.setAge(23);
        std.getLaptop().add(laptop);

        laptop.getStudent().add(std);

        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        SessionFactory sf = cfg.buildSessionFactory(sr);
        Session session = sf.openSession();

        session.beginTransaction();

        /*session.save(laptop);
        session.save(std);*/

        session.persist(laptop);
        session.persist(std);

        session.getTransaction().commit();
        session.close();


    }
}
