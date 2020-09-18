package com.axatp.api.model;

/**
 * 登录返回信息
 */
public class LoginResponse extends BaseResponse {
    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


    @Override
    public String toString() {
        return "LoginResponse{" +
                "sessionId='" + sessionId + '\'' +
                '}';
    }
}
