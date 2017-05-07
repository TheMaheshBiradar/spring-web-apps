package org.opportunity.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.opportunity.management.model.init.Identifiable;

public abstract class DomainObject<I> implements Serializable, Identifiable<I> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected DomainObject() {
		super();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		} else if (obj instanceof Identifiable) {
			Identifiable<?> item = (Identifiable<?>) obj;
			return new EqualsBuilder().append(this.getId(), item.getId()).build();
		}

		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.getClass()).append(this.getId()).build();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append(this.getId()).build();
	}
}
