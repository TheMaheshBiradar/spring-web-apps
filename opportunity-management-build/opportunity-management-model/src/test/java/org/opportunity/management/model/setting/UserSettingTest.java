package org.opportunity.management.model.setting;

import org.opportunity.management.model.AbstractEntityPKIntegrationTest;
import org.opportunity.management.model.setting.UserSetting.PK;

public class UserSettingTest extends AbstractEntityPKIntegrationTest<UserSetting, UserSetting.PK> {

	@Override
	protected PK getEntityPK2() {
		return new UserSetting.PK("1", "USA");

	}

	@Override
	protected PK getEntityPK1() {
		return new UserSetting.PK("2", "USA");
	}

}
