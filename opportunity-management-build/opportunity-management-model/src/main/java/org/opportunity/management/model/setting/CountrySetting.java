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
@Table(name = "OPP_T_SETTING_COUNTRY")
public class CountrySetting extends Setting<CountrySetting.PK> {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CountrySetting.PK id;

	public CountrySetting() {
	}

	public CountrySetting(PK id) {
		super();
		this.id = id;
	}

	public CountrySetting.PK getId() {
		return id;
	}

	public void setId(CountrySetting.PK id) {
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
		@Column(name = "COUNTRY_CD", nullable = false)
		private String countryCode;

		public PK() {

		}

		/**
		 * @param name
		 * @param countryCode
		 */
		public PK(String name, String countryCode) {
			this.name = name;
			this.countryCode = countryCode;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountryCode() {
			return countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		

		@Override
		public int hashCode() {
			return new HashCodeBuilder().append(this.getClass()).append(this.getCountryCode()).append(this.getName())
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

			return new EqualsBuilder().append(this.getName(), id.getName()).append(this.getCountryCode(), id.getCountryCode())
					.build();
		}

		@Override
		public String toString() {
			return new ToStringBuilder(this).append(this.getCountryCode()).append(this.getName()).toString();

		}



		
	}

}
