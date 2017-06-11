package org.opportunity.management.dto.setting;

import org.opportunity.management.util.type.SettingHierarchy;
import org.opportunity.uti.dto.BaseDto;

public class SettingTypeDto extends BaseDto {

  private static final long serialVersionUID = 1L;

  private String            id;
  private String            description;
  private Boolean           multiValuesAllowed;
  private DataTypeDto       dataType;
  private SettingHierarchy  lowestLevelAllowed;

  public String getId() {
    return this.id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public Boolean getMultiValuesAllowed() {
    return this.multiValuesAllowed;
  }

  public void setMultiValuesAllowed(final Boolean multiValuesAllowed) {
    this.multiValuesAllowed = multiValuesAllowed;
  }

  public DataTypeDto getDataType() {
    return this.dataType;
  }

  public void setDataType(final DataTypeDto dataType) {
    this.dataType = dataType;
  }

  public SettingHierarchy getLowestLevelAllowed() {
    return this.lowestLevelAllowed;
  }

  public void setLowestLevelAllowed(final SettingHierarchy lowestLevelAllowed) {
    this.lowestLevelAllowed = lowestLevelAllowed;
  }

}
