package com.axatp.api.model;

/**
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

