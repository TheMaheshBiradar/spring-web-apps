package com.taggy.infra.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Mahesh on 08-10-2017.
 */
@Entity
@Table(name="TABLE_COM_STATUS_URL")
public class ConfigurationStatusUrlConfiguration implements Serializable{

    @Id
    @Column(name="COMPONENT_ID")
    private String componentId;

    @Id
    @Column(name="ENVIONMENT_ID")
    private String environment;

    @Id
    @Column(name="URL")
    private String url;


    @Column(name="ACTIVE_FL")
    private Boolean active;

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ConfigurationStatusUrlConfiguration() {

    }

    public ConfigurationStatusUrlConfiguration(String componentId, String environment, String url) {
        this.componentId = componentId;
        this.environment = environment;
        this.url = url;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
