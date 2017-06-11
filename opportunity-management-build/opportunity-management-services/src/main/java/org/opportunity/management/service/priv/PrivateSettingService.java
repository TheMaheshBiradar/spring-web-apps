package org.opportunity.management.service.priv;

import org.opportunity.management.dto.setting.SettingDto;
import org.opportunity.management.util.exception.NotFoundException;

public interface PrivateSettingService {
	
	 SettingDto getSetting(String settingKey) throws NotFoundException;

}
