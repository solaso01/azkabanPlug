package com.axatp.api.model;

import java.util.List;

/**
 * Created by shirukai on 2019-06-04 09:53
 * 查询所有项目的响应
 */
public class FetchAllProjectsResponse extends BaseResponse {
    private List<Project> projects;

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "FetchAllProjectsResponse{" +
                "projects=" + projects +
                '}';
    }
}

