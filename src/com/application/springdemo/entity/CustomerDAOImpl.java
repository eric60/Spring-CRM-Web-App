package com.application.springdemo.entity;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.springdemo.dao.CustomerDAO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory dependency/java bean that was configured from our XML
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		// get the current Hibernate session
		// create a SQL query
		// get the query
		// execute query and get the list
		// return the list	
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
		List<Customer> customerList = theQuery.getResultList();
		return customerList;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currSession = sessionFactory.getCurrentSession();
		currSession.save(theCustomer);	
	}

}
