package org.opportunity.management.model.setting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.opportunity.management.model.DomainObject;

/**
 * 
 * @author Mahesh
 *
 *
 *         CREATE TABLE HR. (
 * 
 *         VARCHAR2(100 BYTE) NOT NULL, DESCRIPTION VARCHAR2(1000 BYTE) NOT
 *         NULL, DATA_TYPE_ID NUMBER NOT NULL, LOWEST_ALLOWED_LEVEL VARCHAR2(100
 *         BYTE), MULTI_VALUE_ALLOWED_FL NUMBER(1) DEFAULT 0 NOT NULL
 * 
 * 
 */
@Entity
@Table(name = "OPP_T_SETTING_TYPE")
public class SettingType extends DomainObject<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SETTING_TYPE_ID", nullable = false)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SettingType() {
	}
}
