package org.opportunity.management.model.setting;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import org.opportunity.management.model.DomainObject;

@MappedSuperclass
public abstract class Setting<I extends Serializable> extends DomainObject<I> {

	private static final long serialVersionUID = 1L;

	@Column(name = "VALUE", nullable = false)
	protected String value;

	@MapsId("name")
	@OneToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "SETTING_TYPE_ID", nullable = false)
	private SettingType settingType;

	public abstract String getName();

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public SettingType getSettingType() {
		return settingType;
	}

	public void setSettingType(SettingType settingType) {
		this.settingType = settingType;
	}

}
