package org.opportunity.management.model.setting;

import org.opportunity.management.model.AbstractEntityIntegrationTest;

public class ApplicationSettingTest extends AbstractEntityIntegrationTest<ApplicationSetting>{

	@Override
	protected ApplicationSetting getEntity1() {
		ApplicationSetting applicationSetting=new ApplicationSetting();
		applicationSetting.setId("123");
		return applicationSetting;
	}

	@Override
	protected ApplicationSetting getEntity2() {
		ApplicationSetting applicationSetting=new ApplicationSetting();
		applicationSetting.setId("124");
		return applicationSetting;
	}

	
}
