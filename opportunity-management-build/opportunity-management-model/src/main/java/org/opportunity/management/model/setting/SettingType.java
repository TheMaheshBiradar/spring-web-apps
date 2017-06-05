package org.opportunity.management.model.setting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.opportunity.management.model.DataType;
import org.opportunity.management.model.DomainObject;
import org.opportunity.management.util.type.SettingHierarchy;

/**
 * 
 * @author Mahesh
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

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	@OneToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "DATA_TYPE_ID", nullable = false)
	private DataType dataType;

	@Column(name = "LOWEST_ALLOWED_LEVEL", nullable = false)
	@Enumerated(EnumType.STRING)
	private SettingHierarchy lowestAllowedLevel;

	@Column(name = "MULTI_VALUE_ALLOWED_FL", nullable = false)
	private Boolean multiValueAllowed;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

	public SettingHierarchy getLowestAllowedLevel() {
		return lowestAllowedLevel;
	}

	public void setLowestAllowedLevel(SettingHierarchy lowestAllowedLevel) {
		this.lowestAllowedLevel = lowestAllowedLevel;
	}

	public Boolean getMultiValueAllowed() {
		return multiValueAllowed;
	}

	public void setMultiValueAllowed(Boolean multiValueAllowed) {
		this.multiValueAllowed = multiValueAllowed;
	}

	public SettingType() {
	}
}
