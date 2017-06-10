package org.opportunity.management.model;

import java.lang.reflect.ParameterizedType;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;

@Transactional
public abstract class AbstractEntityPKIntegrationTest<T extends DomainObject<PK>, PK>
		extends AbstractEntityIntegrationTest<T> {

	@Test
	@Override
	public void testEntityMapping() throws Exception {
		try {
			this.findOne();
		} catch (NoResultException e) {
			// this means mapping is okay
		}
	}

	@Test
	public void testPKEqualsAndHashCode() throws Exception {
		final Object object1 = this.getEntityPK1();
		final Object object2 = this.getEntityPK1();

		Assert.assertEquals("Objects with same ids must be equal", object1, object2);
		Assert.assertTrue("same objects must be equal", object1.equals(object2));
		Assert.assertFalse("object comparision with null must not be equal", object1.equals(null));
		Assert.assertFalse("Objects with differing object type must not be equal", object1.equals(new Object()));

		// hascode

		Assert.assertEquals("hashcode of objects that are equal must be same", object1.hashCode(), object2.hashCode());
		final Object object3 = this.getEntityPK2();
		Assert.assertFalse("Objects with differing ids must not be equal", object1.equals(object3));
	}

	@Test
	public void testPKToString() throws Exception {
		Object obj = this.getEntityPK1();
		Assert.assertNotEquals("to string must be overridden for domain objects", obj.toString(),
				obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode()));

	}

	protected abstract PK getEntityPK2();

	protected abstract PK getEntityPK1();

	@SuppressWarnings("unchecked")
	protected final T getEntity(final PK id) {

		T instance = null;

		try {

			// get the class name of this instance's type
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			// you may need this split or not use logging to check
			String parameterClassName = pt.getActualTypeArguments()[0].toString().split("\\s")[1];
			instance = (T) Class.forName(parameterClassName).newInstance();
			try {
				instance.setId(id);
			} catch (Exception e) {
				// ignore
			}
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
		Assert.assertNotNull(instance);
		return instance;
	}

	protected T getEntity1() {
		PK pk = this.getEntityPK1();
		T entity = this.getEntity(pk);
		entity.setId(pk);
		return entity;

	}

	protected T getEntity2() {
		PK pk = this.getEntityPK2();
		T entity = this.getEntity(pk);
		entity.setId(pk);
		return entity;

	}
}
