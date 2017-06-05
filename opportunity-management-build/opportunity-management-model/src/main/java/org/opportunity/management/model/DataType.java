package org.opportunity.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.opportunity.management.model.init.Modifiable;
@Entity
@Table(name = "OPP_T_DATA_TYPE")
public class DataType extends DomainObject<Integer> implements Modifiable<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DATA_TYPE_ID", nullable = false)
	private Integer id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "CONVERTER_ID", nullable = false)
	private Integer converterId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getConverterId() {
		return converterId;
	}

	public void setConverterId(Integer converterId) {
		this.converterId = converterId;
	}

}
