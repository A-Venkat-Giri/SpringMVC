package com.dev.blrspringmvc.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class EntityManagerFactoryConfig {
	@Bean
 public EntityManagerFactory getEntityManagerFactory() {
	 LocalEntityManagerFactoryBean bean = new  LocalEntityManagerFactoryBean();
	 bean.setPersistenceUnitName("student.db.unit");
	return (EntityManagerFactory) bean;
 }
}
