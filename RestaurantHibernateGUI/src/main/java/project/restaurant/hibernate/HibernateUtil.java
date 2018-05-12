package project.restaurant.hibernate;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        Configuration configuration=new Configuration();
        configuration.addAnnotatedClass(Drink.class);
        configuration.addAnnotatedClass(Food.class);
        configuration.addAnnotatedClass(Authentication.class);
        return  configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());


    }

}

