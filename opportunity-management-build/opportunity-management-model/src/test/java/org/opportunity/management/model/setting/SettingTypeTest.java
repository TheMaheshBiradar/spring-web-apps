package org.opportunity.management.model.setting;

import org.opportunity.management.model.AbstractEntityIntegrationTest;

public class SettingTypeTest extends AbstractEntityIntegrationTest<SettingType>{

	
	@Override
	protected SettingType getEntity1() {
		SettingType settingType=new SettingType();
		settingType.setId("USER_LANG");
		return settingType;
	}

	@Override
	protected SettingType getEntity2() {
		SettingType settingType=new SettingType();
		settingType.setId("USER_COUNTRY");
		return settingType;
	}

}
