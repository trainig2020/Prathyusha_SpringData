package org.anusha.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.anusha.dao.HibernateDaoImpl;

public class JdbcDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		HibernateDaoImpl dao = context.getBean("hibernateDaoImpl",
				HibernateDaoImpl.class);

		System.out.println(dao.getCircleCount());

	}

}
