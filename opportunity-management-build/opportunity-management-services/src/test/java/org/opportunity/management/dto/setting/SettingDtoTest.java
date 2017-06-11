package org.opportunity.management.dto.setting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.opportunity.management.util.type.SettingHierarchy;

public class SettingDtoTest {

  @Test
  public void testValues() {
    final SettingDto dto = new SettingDto("DEFAULT_PRECESION", SettingHierarchy.APPLICATION,
        Arrays.asList("2"));
    Assert.assertEquals("2", dto.getSingleValue());
  }
}
