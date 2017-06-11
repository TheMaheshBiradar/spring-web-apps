package org.opportunity.management.dto.setting;

import static org.opportunity.management.dto.setting.SettingLevelKeyDto.empty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.opportunity.management.service.priv.helper.PrivateSettingHelper;
import org.opportunity.management.util.type.SettingHierarchy;
import org.opportunity.uti.dto.BaseDto;

public class SettingDto extends BaseDto implements Comparable<SettingDto> {

  private static final long        serialVersionUID = 1L;

  private final String             name;
  private final SettingLevelKeyDto key;
  private List<String>             values;
  private final SettingHierarchy   hierarchy;
  private String                   description;

  public static SettingDto singleValueSetting(final String name, final String value,
      final SettingHierarchy hierarchy) {
    return new SettingDto(name, empty(), hierarchy, Arrays.asList(value));
  }

  public static SettingDto singleValueSetting(final String name, final String value) {
    return singleValueSetting(name, value, null);
  }

  public static SettingDto multiValueSetting(final String name, final List<String> values) {
    return new SettingDto(name, empty(), null, values);
  }

  public static SettingDto multiValueSetting(final String name, final String value) {
    final SettingDto dto = new SettingDto(name, empty(), null, Collections.<String> emptyList());
    dto.setMultipleValues(value);
    return dto;
  }

  public void addValue(final String value) {
    this.getValues().add(value);
  }

  public void setMultipleValues(final String values) {
    this.resetValues();
    PrivateSettingHelper.setValues(this, values);
  }

  public String getMultipleValues() {
    return PrivateSettingHelper.getValues(this.getValues());
  }

  public void resetValues() {
    this.values.clear();
  }

  public SettingDto(final String name, final SettingLevelKeyDto key,
      final SettingHierarchy hierarchy, final List<String> values) {
    this.name = name;
    this.key = key;
    this.values = new CopyOnWriteArrayList<>(values);
    this.hierarchy = hierarchy;
  }

  public SettingDto(final String name, final SettingHierarchy hierarchy) {
    this(name, empty(), hierarchy, new ArrayList<>());
  }

  public SettingDto(final String name, final SettingLevelKeyDto key,
      final SettingHierarchy hierarchy) {
    this(name, key, hierarchy, new ArrayList<>());
  }

  public SettingDto(final String name, final SettingHierarchy hierarchy,
      final List<String> values) {
    this(name, empty(), hierarchy, values);
  }

  public String getSingleValue() {
    if (this.getValues().isEmpty()) {
      return null;
    }
    return this.getValues().get(0);
  }

  public List<String> getValues() {
    return this.values;
  }

  public void setValues(final List<String> values) {
    this.values = values;
  }

  public String getDescription() {
    return this.description;
  }

  public String getName() {
    return this.name;
  }

  public SettingLevelKeyDto getKey() {
    return this.key;
  }

  public SettingHierarchy getHierarchy() {
    return this.hierarchy;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  @Override
  public int compareTo(final SettingDto otherSetting) {
    return this.name.compareTo(otherSetting.getName());
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(this.getClass()).append(this.getName())
        .append(this.getHierarchy()).build();
  }

  public boolean equalsValue(final Object obj) {
    if (this.equalsType(obj)) {
      final SettingDto settingDto = (SettingDto) obj;
      return new EqualsBuilder().append(this.getValues(), settingDto.getValues()).build();
    }
    return false;

  }

  public boolean equalsType(final Object obj) {
    if (!(obj instanceof SettingDto)) {
      return false;
    }
    if (this.getName().equals(((SettingDto) obj).getName())) {
      final SettingDto settingDto = (SettingDto) obj;
      return new EqualsBuilder().append(this.getValues(), settingDto.getValues()).build();
    }

    return false;

  }

  @Override
  public boolean equals(final Object obj) {

    if (obj == null) {
      return false;
    }

    if (obj == this) {
      return true;
    }

    if (!(obj instanceof SettingDto)) {
      return false;
    }

    final SettingDto settingDto = (SettingDto) obj;
    return new EqualsBuilder().append(this.getName(), settingDto.getName())
        .append(this.getHierarchy(), settingDto.getHierarchy()).build();
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append(this.getName()).build();
  }

}
