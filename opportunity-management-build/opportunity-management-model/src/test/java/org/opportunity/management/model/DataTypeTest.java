package org.opportunity.management.model;

public class DataTypeTest extends AbstractEntityIntegrationTest<DataType> {

	@Override
	protected DataType getEntity1() {
		DataType dataType = new DataType();
		dataType.setId(1);
		return dataType;
	}

	@Override
	protected DataType getEntity2() {
		DataType dataType = new DataType();
		dataType.setId(2);
		return dataType;
	}

}
