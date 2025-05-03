package com.daffodilschool.schoolmanagement.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse
{
    @JsonProperty("status")
    private String status;

    @JsonProperty("message")
    private String message;
    private String token;
    private long expiresIn;

    public LoginResponse(String status, String message, String token, long expiresIn) {
        this.status = status;
        this.message = message;
        this.token = token;
        this.expiresIn = expiresIn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
