package Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory sessionFactory;
    
    public static SessionFactory getSessionFactory() {
    	 if(sessionFactory == null) {
    		 sessionFactory = new Configuration().configure().buildSessionFactory();
    	 }
    	 return sessionFactory;
    }

    public static void close() {
    	if(sessionFactory.isOpen()) {
    		sessionFactory.close();
    	}
    }

}