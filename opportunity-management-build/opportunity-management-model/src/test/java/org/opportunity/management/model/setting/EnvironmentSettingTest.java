package org.opportunity.management.model.setting;

import org.opportunity.management.model.AbstractEntityPKIntegrationTest;
import org.opportunity.management.model.setting.EnvironmentSetting.PK;

public class EnvironmentSettingTest extends AbstractEntityPKIntegrationTest<EnvironmentSetting, EnvironmentSetting.PK> {

	@Override
	protected PK getEntityPK2() {
		return new EnvironmentSetting.PK("1", "DEV");

	}

	@Override
	protected PK getEntityPK1() {
		return new EnvironmentSetting.PK("2", "DEV");
	}
}
