package org.opportunity.management.model.setting;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Data Object for User setting.
 * 
 * @author Mahesh
 *
 */
public class UserSetting extends Setting<UserSetting.PK> {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserSetting.PK id;

	public UserSetting() {
	}

	public UserSetting(PK id) {
		super();
		this.id = id;
	}

	public UserSetting.PK getId() {
		return id;
	}

	public void setId(UserSetting.PK id) {
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
		@Column(name = "USER_ID", nullable = false)
		private String userId;

		public PK() {

		}

		/**
		 * @param name
		 * @param userId
		 */
		public PK(String name, String userId) {
			this.name = name;
			this.userId = userId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		@Override
		public int hashCode() {
			return new HashCodeBuilder().append(this.getClass()).append(this.getUserId()).append(this.getName())
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

			return new EqualsBuilder().append(this.getName(), id.getName()).append(this.getUserId(), id.getUserId())
					.build();
		}

		@Override
		public String toString() {
			return new ToStringBuilder(this).append(this.getUserId()).append(this.getName()).toString();

		}

	}

}
