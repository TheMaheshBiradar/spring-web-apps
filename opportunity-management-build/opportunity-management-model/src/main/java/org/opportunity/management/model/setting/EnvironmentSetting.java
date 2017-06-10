package org.opportunity.management.model.setting;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Data Object for VARIATION_ID setting.
 * 
 * @author Mahesh
 *
 */
 @Entity
 @Table(name = "OPP_T_SETTING_ENVIRONMENT")
public class EnvironmentSetting extends Setting<EnvironmentSetting.PK> {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EnvironmentSetting.PK id;

	public EnvironmentSetting() {
	}

	public EnvironmentSetting(PK id) {
		super();
		this.id = id;
	}

	public EnvironmentSetting.PK getId() {
		return id;
	}

	public void setId(EnvironmentSetting.PK id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return this.id.getName();
	}

	public static class PK implements Serializable {
		private static final long serialVersionUID = 1L;
		@Column(name = "SETTING_TYPE_ID", nullable = false)
		private String name;
		@Column(name = "ENV_ID", nullable = false)
		private String environmentId;

		public PK() {

		}

		/**
		 * @param name
		 * @param environmentId
		 */
		public PK(String name, String environmentId) {
			this.name = name;
			this.environmentId = environmentId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEnvironmentId() {
			return environmentId;
		}

		public void setEnvironmentId(String environmentId) {
			this.environmentId = environmentId;
		}
		

		@Override
		public int hashCode() {
			return new HashCodeBuilder().append(this.getClass()).append(this.getEnvironmentId()).append(this.getName())
					.build();
		}

		@Override
		public boolean equals(Object obj) {

			if (obj == null) {
				return false;
			}

			if (obj == this) {
				return true;
			}

			if (!(obj instanceof PK)) {

				return false;
			}

			PK id = (PK) obj;

			return new EqualsBuilder().append(this.getName(), id.getName()).append(this.getEnvironmentId(), id.getEnvironmentId())
					.build();
		}

		@Override
		public String toString() {
			return new ToStringBuilder(this).append(this.getEnvironmentId()).append(this.getName()).toString();

		}
		
	}

}
