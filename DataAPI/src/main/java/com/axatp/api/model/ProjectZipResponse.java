package com.axatp.api.model;

/**
 * 上传项目zip包响应
 */
public class ProjectZipResponse extends BaseResponse {
    private String projectId;
    private String version;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ProjectZipResponse{" +
                "projectId='" + projectId + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
