package com.Ritik.aws;

import java.util.Map;

public class GatewayResponse {

    private String body;
    private Integer statusCode;
    private Map<String, String> headers;
    private boolean isBase64Encoded;

    public GatewayResponse(String body, Integer statusCode, Map<String, String> headers, boolean isBase64Encoded) {
        this.body = body;
        this.statusCode = statusCode;
        this.headers = headers;
        this.isBase64Encoded = isBase64Encoded;
    }


}
