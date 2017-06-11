package org.opportunity.management.service.priv.helper;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.opportunity.management.dto.setting.SettingDto;
import org.opportunity.management.model.setting.Setting;

public class PrivateSettingHelper {

  private static final String DELIMITER = ";";

  public static void setValues(final SettingDto settingDto, final String values) {

    if (StringUtils.isEmpty(values)) {
      return;
    }

    for (final String value : values.split(DELIMITER)) {
      settingDto.addValue(value);
    }
  }

  public static void setValues(final Setting<? extends Serializable> setting,
      final List<String> values) {
    setting.setValue(PrivateSettingHelper.getValues(values));

  }

  public static String getValues(final List<String> values) {
    return String.join(DELIMITER, values);

  }

}
