package com.ec.pintulac.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CodigosCategoriaResponse {
	
	@JsonProperty("ConnectorRequest1")
    private ConnectorRequest1Data connectorRequest1;

    public ConnectorRequest1Data getConnectorRequest1() {
        return connectorRequest1;
    }

    public void setConnectorRequest1(ConnectorRequest1Data connectorRequest1) {
        this.connectorRequest1 = connectorRequest1;
    }
}
