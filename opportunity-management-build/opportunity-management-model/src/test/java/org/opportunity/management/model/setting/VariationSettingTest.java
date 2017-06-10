package org.opportunity.management.model.setting;

import org.opportunity.management.model.AbstractEntityPKIntegrationTest;
import org.opportunity.management.model.setting.VariationSetting.PK;

public class VariationSettingTest extends AbstractEntityPKIntegrationTest<VariationSetting,VariationSetting.PK>
{

	@Override
	protected PK getEntityPK2() {
		return new VariationSetting.PK("1", "USA");

	}

	@Override
	protected PK getEntityPK1() {
		return new VariationSetting.PK("2", "USA");
	}
}