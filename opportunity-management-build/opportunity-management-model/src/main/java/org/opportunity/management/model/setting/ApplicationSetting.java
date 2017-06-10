package org.opportunity.management.model.setting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Data Object for VARIATION_ID setting.
 * 
 * @author Mahesh
 *
 */
@Entity
@Table(name = "OPP_T_SETTING_APPLICATION")
public class ApplicationSetting extends Setting<String> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SETTING_TYPE_ID", nullable = false)
	private String name;

	public ApplicationSetting() {
	}

	public String getId() {
		return this.name;
	}

	public void setId(String id) {
		this.name = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
