package com.taggy.infra;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;

/**
 * Created by Mahesh on 08-10-2017.
 */

    @Configuration
    public class Config {

        @Autowired
        private EntityManagerFactory entityManagerFactory;

        @Bean
        public SessionFactory getSessionFactory() {
            if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
                throw new NullPointerException("factory is not a hibernate factory");
            }
            return entityManagerFactory.unwrap(SessionFactory.class);
        }

}
