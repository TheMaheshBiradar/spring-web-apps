package org.opportunity.management.model.setting;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;

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

	}

}
