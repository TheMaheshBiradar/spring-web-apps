package org.opportunity.management.dto.setting;

import java.util.Arrays;
import java.util.List;

import org.opportunity.uti.dto.BaseDto;

public class SettingLevelKeyDto extends BaseDto {

	private static final long serialVersionUID = 1L;

	private final List<String> components;

	private SettingLevelKeyDto(String... components) {
		this.components = Arrays.asList(components);
	}

	public String getFirst() {
		return (!components.isEmpty() ? components.get(0) : null);
	}

	
	public String getSecond() {
		return (components.size() > 1 ? components.get(1) : null);
	}
	
	public void setFirst(String value){
		this.components.set(0, value);
	}
	
	public void setSecond(String value){
		this.components.set(1, value);
	}
	
	
	
	public static SettingLevelKeyDto empty(){
		return new SettingLevelKeyDto((String)null);
	}
	
	public static SettingLevelKeyDto application(){
		return new SettingLevelKeyDto((String)null);
	}
	
	

	public static SettingLevelKeyDto country(String countryName){
		return new SettingLevelKeyDto(countryName);
	}
	
	public static SettingLevelKeyDto variation(Integer variationId){
		return new SettingLevelKeyDto(variationId.toString());
	}
	
	public static SettingLevelKeyDto environment(String environmentId){
		return new SettingLevelKeyDto(environmentId);
	}
	
	public static SettingLevelKeyDto user(String user){
		return new SettingLevelKeyDto(user);
	}
}
