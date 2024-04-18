package com.xdzhouxin;

public class Request {
    private final String requestType;
    public Request(String requestType) {
        this.requestType = requestType;
    }
    public String getRequestType() {
        return requestType;
    }
}
