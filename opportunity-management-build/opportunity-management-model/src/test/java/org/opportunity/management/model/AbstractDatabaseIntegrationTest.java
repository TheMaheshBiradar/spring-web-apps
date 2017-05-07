package org.opportunity.management.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author Mahesh
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("development")
@ContextConfiguration("classpath:/spring-datasource-test.xml")
public abstract class AbstractDatabaseIntegrationTest extends AbstractTransactionalJUnit4SpringContextTests {

	@PersistenceContext(unitName = "entityManagerFactory")
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	protected <T> T getOne(final Class<T> clazz) {
		Query query = this.createQuery(clazz);
		query.setMaxResults(1);
		return (T) query.getResultList();

	}
	
	@SuppressWarnings("unchecked")
	protected <T> List<T> getAll(final Class<T> clazz) {
		Query query = this.createQuery(clazz);
		return query.getResultList();
	}

	private <T> Query createQuery(final Class<T> clazz) {
		return this.entityManager.createQuery("FROM " + clazz.getName() + " a");
	}

}
