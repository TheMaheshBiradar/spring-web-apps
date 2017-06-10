package org.opportunity.management.model.setting;

import org.opportunity.management.model.AbstractEntityPKIntegrationTest;
import org.opportunity.management.model.setting.CountrySetting.PK;

public class CountrySettingTest extends AbstractEntityPKIntegrationTest<CountrySetting, CountrySetting.PK> {

	@Override
	protected PK getEntityPK2() {
		return new CountrySetting.PK("1", "DEV");

	}

	@Override
	protected PK getEntityPK1() {
		return new CountrySetting.PK("2", "DEV");
	}
	
}