package br.com.andre.drogaria.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
    private static SessionFactory buildSessionFactory() {
        try {
            // Cria uma sessão por meio do arquivo hibernate.cfg.xml
        	Configuration configuracao = new Configuration().configure();
        	ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
        	SessionFactory fabrica = configuracao.buildSessionFactory(registro);
        	return fabrica;
            
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Erro ao criar uma sessão" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
