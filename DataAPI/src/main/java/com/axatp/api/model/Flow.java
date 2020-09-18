package com.axatp.api.model;

public class Flow{
    private String flowId;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    @Override
    public String toString() {
        return "Flow{" +
                "flowId='" + flowId + '\'' +
                '}';
    }
}
