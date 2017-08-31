package com.aartek.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.RegistrationDto;

@Repository
public class RegisterRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Autowired
	private SessionFactory sessionFactory;

	public RegistrationDto saveRegister(RegistrationDto reg) {

		/*
		 * if (reg != null) { hibernateTemplate.saveOrUpdate(reg);
		 * System.out.println(reg.getAddressList().get(0).getCity()); return
		 * reg; } else { return null; }
		 */

		if (reg != null) {

			sessionFactory = (SessionFactory) hibernateTemplate.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(reg);
			tx.commit();
			return reg;
		}
		return null;
	}

}
