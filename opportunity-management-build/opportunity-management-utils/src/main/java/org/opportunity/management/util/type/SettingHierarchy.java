package org.opportunity.management.util.type;

public enum SettingHierarchy {

	USER(5, "USR", "org.opportunity.management.model.setting.UserSetting", true), COUNTRY(4, "CTY",
			"org.opportunity.management.model.setting.CountrySetting",
			true), VARIATION(3, "VAR", "org.opportunity.management.model.setting.VariationSetting", true), ENVIRONMENT(
					2, "ENV", "org.opportunity.management.model.setting.EnvironmentSetting",
					false), APPLICATION(1, "APP", "org.opportunity.management.model.setting.ApplicationSetting", false);

	/**
	 * @param level
	 * @param id
	 * @param implementationClassName
	 * @param userRelevant
	 */
	private SettingHierarchy(int level, String id, String implementationClassName, boolean userRelevant) {
		this.level = level;
		this.id = id;
		this.implementationClassName = implementationClassName;
		this.userRelevant = userRelevant;
	}

	private final int level;
	private final String id;
	private final String implementationClassName;
	private final boolean userRelevant;

	public int getLevel() {
		return level;
	}

	public String getId() {
		return id;
	}

	public String getImplementationClassName() {
		return implementationClassName;
	}

	public boolean isUserRelevant() {
		return userRelevant;
	}

}
