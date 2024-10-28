package com.ec.pintulac.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConnectorRequest1Data {
	
	 @JsonProperty("rows")
     private List<Item> rows;

	public ConnectorRequest1Data() {
		super();
	}

	public List<Item> getRows() {
		return rows;
	}

	public void setRows(List<Item> rows) {
		this.rows = rows;
	}

}
