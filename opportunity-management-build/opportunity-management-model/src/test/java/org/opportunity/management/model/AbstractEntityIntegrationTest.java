package org.opportunity.management.model;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public abstract class AbstractEntityIntegrationTest<T> extends AbstractDatabaseIntegrationTest {

	@Test
	public void testEntityMapping() throws Exception {
		try {
			this.findOne();
		} catch (NoResultException e) {
			// this means mapping is okay
		}
	}

	protected abstract T getEntity1();

	protected abstract T getEntity2();

	@SuppressWarnings("unchecked")
	protected T findOne() {
		Class<T> queryClass = (Class<T>) this.getEntity1().getClass();
		Query query = this.entityManager.createQuery("FROM " + queryClass.getName() + " a");
		query.setMaxResults(1);
		return (T) query.getSingleResult();
	}
}
