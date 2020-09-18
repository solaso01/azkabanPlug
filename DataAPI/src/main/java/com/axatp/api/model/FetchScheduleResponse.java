package com.axatp.api.model;

/**
 * Created by shirukai on 2019-06-04 10:13
 * 查询定时任务响应
 */
public class FetchScheduleResponse extends BaseResponse {
    private Schedule schedule;

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "FetchScheduleResponse{" +
                "schedule=" + schedule +
                '}';
    }
}

