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
@Table(name = "OPP_T_SETTING_VARIATION")
public class VariationSetting extends Setting<VariationSetting.PK> {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VariationSetting.PK id;

	public VariationSetting() {
	}

	public VariationSetting(PK id) {
		super();
		this.id = id;
	}

	public VariationSetting.PK getId() {
		return id;
	}

	public void setId(VariationSetting.PK id) {
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
		@Column(name = "VARIATION_ID", nullable = false)
		private String variationId;

		public PK() {

		}

		/**
		 * @param name
		 * @param variationId
		 */
		public PK(String name, String variationId) {
			this.name = name;
			this.variationId = variationId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVariationId() {
			return variationId;
		}

		public void setVariationId(String variationId) {
			this.variationId = variationId;
		}
		
		@Override
		public int hashCode() {
			return new HashCodeBuilder().append(this.getClass()).append(this.getVariationId()).append(this.getName())
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

			return new EqualsBuilder().append(this.getName(), id.getName()).append(this.getVariationId(), id.getVariationId())
					.build();
		}

		@Override
		public String toString() {
			return new ToStringBuilder(this).append(this.getVariationId()).append(this.getName()).toString();

		}


	}

}
